package cn.xinyue365.common;

import cn.xinyue365.common.http.HttpConnection;
import cn.xinyue365.common.profile.HttpProfile;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.time.Instant;
import java.util.List;

/**
 * @author frank
 */
public abstract class AbstractClient {

    protected static final Gson gson = new Gson();

    protected final Credential credential;
    protected final String endpoint;
    private HttpConnection httpConnection;

    protected AbstractClient(Credential credential, String endpoint) {
        this.credential = credential;
        this.endpoint = endpoint;
    }

    public AbstractClient(Credential credential, HttpProfile httpProfile, String endpoint) {
        this.credential = credential;
        this.endpoint = endpoint;
        this.httpConnection = new HttpConnection(
            httpProfile.getConnTimeout(),
            httpProfile.getReadTimeout(),
            httpProfile.getWriteTimeout());
    }

    protected <T extends AbstractResponse<?>> T postCall(String action, AbstractRequest request, Class<T> responseClass) {
        try {
            String timestamp = String.valueOf(Instant.now().getEpochSecond());
            String payload = request.toJson();
            String stringToSign = action + "\\n" + timestamp;
            String signature = Sign.sign(stringToSign, credential.getSecretKey());

            Headers.Builder headerBuilder = new Headers.Builder()
                .add("Content-Type", "application/json")
                .add("Authorization", signature)
                .add("X-Timestamp", timestamp)
                .add("X-Secret-Id", credential.getSecretId());

            String responseStr = this.httpConnection.postRequest(endpoint + action,
                RequestBody.create(payload, MediaType.parse("application/json")), headerBuilder.build());
            return new Gson().fromJson(responseStr, responseClass);
        } catch (IOException e) {
            return ResponseFactory.failure(responseClass, e);
        }
    }

    protected <T extends AbstractResponse<?>> T postCallWithForm(String action, AbstractRequest request, Class<T> responseClass) {
        try {
            String timestamp = String.valueOf(Instant.now().getEpochSecond());
            String stringToSign = action + "\\n" + timestamp;
            String signature = Sign.sign(stringToSign, credential.getSecretKey());

            Headers.Builder headerBuilder = new Headers.Builder()
                .add("Content-Type", "application/json")
                .add("Authorization", signature)
                .add("X-Timestamp", timestamp)
                .add("X-Secret-Id", credential.getSecretId());

            MultipartBody.Builder multipartBuilder = new MultipartBody.Builder()
                .setType(MultipartBody.FORM);

            Field[] fields = request.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                Object value = field.get(request);
                if (value != null) {
                    if (value instanceof List) {
                        List<?> list = (List<?>) value;
                        for (Object item : list) {
                            multipartBuilder.addFormDataPart(field.getName(), item.toString());
                        }
                    } else if (value instanceof File) {
                        File file = (File) value;

                        multipartBuilder.addFormDataPart(
                            "file",
                            file.getName(),
                            RequestBody.create(file, MediaType.parse("application/octet-stream"))
                        );
                    } else {
                        multipartBuilder.addFormDataPart(field.getName(), value.toString());
                    }
                }
            }

            String responseStr = this.httpConnection.postRequest(endpoint + action, multipartBuilder.build(), headerBuilder.build());
            return new Gson().fromJson(responseStr, responseClass);
        } catch (IOException | IllegalAccessException e) {
            return ResponseFactory.failure(responseClass, e);
        }
    }
}

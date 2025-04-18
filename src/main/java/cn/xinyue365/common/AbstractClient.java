package cn.xinyue365.common;

import cn.xinyue365.common.http.HttpConnection;
import cn.xinyue365.common.profile.HttpProfile;
import com.google.gson.Gson;
import okhttp3.Headers;

import java.io.IOException;
import java.time.Instant;

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
            String stringToSign = timestamp + "\\n" + payload;
            String signature = Sign.sign(stringToSign, credential.getSecretKey());

            Headers.Builder headerBuilder = new Headers.Builder()
                .add("Content-Type", "application/json")
                .add("Authorization", signature)
                .add("X-Timestamp", timestamp)
                .add("X-Secret-Id", credential.getSecretId());

            String responseStr = this.httpConnection.postRequest(endpoint + action, payload, headerBuilder.build());
            return new Gson().fromJson(responseStr, responseClass);
        } catch (IOException e) {
            return ResponseFactory.failure(responseClass, e);
        }
    }
}

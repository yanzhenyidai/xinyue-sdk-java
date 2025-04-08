package cn.xinyue365.common;

import cn.xinyue365.common.exception.SDKException;
import cn.xinyue365.common.http.HttpUtil;
import cn.xinyue365.common.profile.HttpProfile;
import com.google.gson.Gson;
import okhttp3.Headers;

import java.io.IOException;
import java.time.Instant;

/**
 * @author frank
 * @version 1.0
 * @date 2025-04-08 14:19
 */
public abstract class AbstractClient {

    protected static final Gson gson = new Gson();

    protected final Credential credential;
    protected final String endpoint;
    private HttpUtil httpConnection;

    protected AbstractClient(Credential credential, String endpoint) {
        this.credential = credential;
        this.endpoint = endpoint;
    }

    public AbstractClient(Credential credential, HttpProfile httpProfile, String endpoint) {
        this.credential = credential;
        this.endpoint = endpoint;
        this.httpConnection = new HttpUtil(
            httpProfile.getConnTimeout(),
            httpProfile.getReadTimeout(),
            httpProfile.getWriteTimeout());
    }

    public <T extends AbstractResponse> T call(String action, AbstractRequest request, Class<T> responseClass) {
        try {
            String timestamp = String.valueOf(Instant.now().getEpochSecond());
            String payload = request.toJson();
            String stringToSign = "POST\\n" + action + "\\n" + timestamp + "\\n" + payload;
            String signature = Sign.sign(stringToSign, credential.getSecretKey());

            Headers.Builder headerBuilder = new Headers.Builder()
                .add("Content-Type", "application/json")
                .add("Authorization", signature)
                .add("X-Timestamp", timestamp)
                .add("X-Secret-Id", credential.getSecretId());

            String responseStr = this.httpConnection.post(endpoint + "/" + action, payload, headerBuilder.build());
            return new Gson().fromJson(responseStr, responseClass);
        } catch (IOException e) {
            throw new SDKException("Request failed", e);
        }
    }
}

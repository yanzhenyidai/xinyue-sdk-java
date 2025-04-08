package cn.xinyue365.common.http;

import okhttp3.*;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HttpUtil {

    private static final Logger logger = Logger.getLogger(HttpUtil.class);

    private static final OkHttpClient clientSingleton = new OkHttpClient();
    private final OkHttpClient client;

    public HttpUtil(Integer connTimeout, Integer readTimeout, Integer writeTimeout) {
        this.client = clientSingleton.newBuilder()
            .connectTimeout(connTimeout, TimeUnit.SECONDS)
            .readTimeout(readTimeout, TimeUnit.SECONDS)
            .writeTimeout(writeTimeout, TimeUnit.SECONDS)
            .build();
    }

    public String post(String url, String json, Headers headers) throws IOException {
        Request request = new Request.Builder()
            .url(url)
            .post(RequestBody.create(json, MediaType.parse("application/json; charset=utf-8")))
            .headers(headers)
            .build();

        int retries = 3;
        IOException lastException = null;
        for (int i = 0; i < retries; i++) {
            try (Response response = client.newCall(request).execute()) {
                if (!response.isSuccessful()) {
                    throw new IOException("HTTP error: " + response.code());
                }
                return response.body().string();
            } catch (IOException e) {
                lastException = e;
                logger.error("Request attempt " + (i + 1) + " failed: " + e.getMessage());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignored) {
                }
            }
        }
        throw lastException;
    }
}

package cn.xinyue365.common.http;

import cn.xinyue365.common.exception.SDKException;
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

    public String doRequest(Request request) throws IOException {
        int retries = 3;
        IOException lastException = null;
        for (int i = 0; i < retries; i++) {
            try (Response response = client.newCall(request).execute()) {
                if (!response.isSuccessful()) {
                    throw new IOException("HTTP error: " + response.code());
                }
                return this.client.newCall(request).execute().body().string();
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

    public String getRequest(String url) throws SDKException, IOException {
        Request request = null;
        try {
            request = new Request.Builder().url(url).get().build();
        } catch (IllegalArgumentException e) {
            throw new SDKException(e.getClass().getName() + "-" + e.getMessage());
        }

        return this.doRequest(request);
    }

    public String getRequest(String url, Headers headers) throws SDKException, IOException {
        Request request = null;
        try {
            request = new Request.Builder().url(url).headers(headers).get().build();
        } catch (IllegalArgumentException e) {
            throw new SDKException(e.getClass().getName() + "-" + e.getMessage());
        }

        return this.doRequest(request);
    }

    public String postRequest(String url, String body) throws SDKException, IOException {
        MediaType contentType = MediaType.parse("application/x-www-form-urlencoded");
        Request request = null;
        try {
            request = new Request.Builder().url(url).post(RequestBody.create(contentType, body)).build();
        } catch (IllegalArgumentException e) {
            throw new SDKException(e.getClass().getName() + "-" + e.getMessage());
        }

        return this.doRequest(request);
    }

    public String postRequest(String url, String body, Headers headers)
        throws SDKException, IOException {
        MediaType contentType = MediaType.parse(headers.get("Content-Type"));
        Request request = null;
        try {
            request =
                new Request.Builder()
                    .url(url)
                    .post(RequestBody.create(contentType, body))
                    .headers(headers)
                    .build();
        } catch (IllegalArgumentException e) {
            throw new SDKException(e.getClass().getName() + "-" + e.getMessage());
        }

        return this.doRequest(request);
    }

    public String postRequest(String url, byte[] body, Headers headers)
        throws SDKException, IOException {
        MediaType contentType = MediaType.parse(headers.get("Content-Type"));
        Request request = null;
        try {
            request =
                new Request.Builder()
                    .url(url)
                    .post(RequestBody.create(contentType, body))
                    .headers(headers)
                    .build();
        } catch (IllegalArgumentException e) {
            throw new SDKException(e.getClass().getName() + "-" + e.getMessage());
        }

        return this.doRequest(request);
    }
}

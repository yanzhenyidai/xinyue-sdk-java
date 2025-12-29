package cn.xinyue365.common.http;

import cn.xinyue365.common.exception.SDKException;
import okhttp3.*;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HttpConnection {

    private static final Logger logger = Logger.getLogger(HttpConnection.class);
    private static volatile OkHttpClient clientSingleton;
    private final OkHttpClient client;

    public HttpConnection(Integer connTimeout, Integer readTimeout, Integer writeTimeout) {
        this.client = getClientSingleton()
            .newBuilder()
            .connectTimeout(connTimeout, TimeUnit.SECONDS)
            .readTimeout(readTimeout, TimeUnit.SECONDS)
            .writeTimeout(writeTimeout, TimeUnit.SECONDS)
            .build();
    }

    private static OkHttpClient getClientSingleton() {
        if (clientSingleton == null) {
            synchronized (HttpConnection.class) {
                if (clientSingleton == null) {
                    try {
                        clientSingleton = new OkHttpClient();
                    } catch (Throwable t) {
                        Logger.getLogger(HttpConnection.class)
                            .error("Init OkHttpClient failed", t);
                        throw t;
                    }
                }
            }
        }
        return clientSingleton;
    }

    public String doRequest(Request request) throws IOException {
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
                logger.error("Request attempt " + (i + 1) + " failed", e);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignored) {
                }
            }
        }
        throw lastException;
    }

    public String getRequest(String url) throws SDKException, IOException {
        try {
            Request request = new Request.Builder().url(url).get().build();
            return this.doRequest(request);
        } catch (IllegalArgumentException e) {
            throw new SDKException(e.getClass().getName() + "-" + e.getMessage());
        }
    }

    public String getRequest(String url, Headers headers) throws SDKException, IOException {
        try {
            Request request =
                new Request.Builder().url(url).headers(headers).get().build();
            return this.doRequest(request);
        } catch (IllegalArgumentException e) {
            throw new SDKException(e.getClass().getName() + "-" + e.getMessage());
        }
    }

    public String postRequest(String url, String body) throws SDKException, IOException {
        try {
            MediaType contentType = MediaType.parse("application/x-www-form-urlencoded");
            Request request =
                new Request.Builder()
                    .url(url)
                    .post(RequestBody.create(body, contentType))
                    .build();
            return this.doRequest(request);
        } catch (IllegalArgumentException e) {
            throw new SDKException(e.getClass().getName() + "-" + e.getMessage());
        }
    }

    public String postRequest(String url, String body, Headers headers)
        throws SDKException, IOException {
        try {
            MediaType contentType = MediaType.parse(headers.get("Content-Type"));
            Request request =
                new Request.Builder()
                    .url(url)
                    .post(RequestBody.create(body, contentType))
                    .headers(headers)
                    .build();
            return this.doRequest(request);
        } catch (IllegalArgumentException e) {
            throw new SDKException(e.getClass().getName() + "-" + e.getMessage());
        }
    }

    public String postRequest(String url, byte[] body, Headers headers)
        throws SDKException, IOException {
        try {
            MediaType contentType = MediaType.parse(headers.get("Content-Type"));
            Request request =
                new Request.Builder()
                    .url(url)
                    .post(RequestBody.create(body, contentType))
                    .headers(headers)
                    .build();
            return this.doRequest(request);
        } catch (IllegalArgumentException e) {
            throw new SDKException(e.getClass().getName() + "-" + e.getMessage());
        }
    }

    public String postRequest(String url, RequestBody body, Headers headers)
        throws SDKException, IOException {
        try {
            Request request =
                new Request.Builder()
                    .url(url)
                    .post(body)
                    .headers(headers)
                    .build();
            return this.doRequest(request);
        } catch (IllegalArgumentException e) {
            throw new SDKException(e.getClass().getName() + "-" + e.getMessage());
        }
    }
}

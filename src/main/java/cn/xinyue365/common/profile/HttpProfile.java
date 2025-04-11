package cn.xinyue365.common.profile;

import lombok.Data;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

@Data
public class HttpProfile {

    public static final String REQ_HTTPS = "https://";

    public static final String REQ_HTTP = "http://";

    public static final String REQ_POST = "POST";

    public static final String REQ_GET = "GET";

    /**
     * Time unit, 1 minute, equals 60 seconds.
     */
    public static final int TM_MINUTE = 60;

    private String reqMethod;

    /**
     * Endpoint means the domain which this request is sent to, such as cvm.tencentcloudapi.com.
     */
    private String endpoint;

    /**
     * root domain means endpoint without service name, such as tencentcloudapi.com.
     */
    private String rootDomain;

    /**
     * HTTPS or HTTP, currently only HTTPS is valid.
     */
    private String protocol;

    /**
     * Read timeout in seconds.
     */
    private int readTimeout;

    /**
     * Write timeout in seconds
     */
    private int writeTimeout;

    /**
     * Connect timeout in seconds
     */
    private int connTimeout;

    /**
     * http proxy host
     */
    private String proxyHost;

    /**
     * http proxy port
     */
    private int proxyPort;

    /**
     * http proxy user name
     */
    private String proxyUsername;

    /**
     * http proxy password
     */
    private String proxyPassword;

    private SSLSocketFactory sslSocketFactory;

    private X509TrustManager trustManager;

    private HostnameVerifier hostnameVerifier;

    /**
     * APIGateway endpoint
     */
    private String apigwEndpoint;

    public HttpProfile() {
        this.reqMethod = HttpProfile.REQ_POST;
        this.endpoint = null;
        this.rootDomain = "yanzhenyidai.top";
        this.protocol = HttpProfile.REQ_HTTPS;
        this.readTimeout = 0;
        this.writeTimeout = 0;
        this.connTimeout = HttpProfile.TM_MINUTE;
        this.apigwEndpoint = null;
    }
}

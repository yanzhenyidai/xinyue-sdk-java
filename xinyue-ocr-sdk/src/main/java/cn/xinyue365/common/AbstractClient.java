package cn.xinyue365.common;

import cn.xinyue365.common.exception.XinyueSDKException;
import cn.xinyue365.common.http.HttpConnection;
import cn.xinyue365.common.profile.ClientProfile;
import cn.xinyue365.common.profile.HttpProfile;
import com.google.gson.Gson;
import okhttp3.Response;

import java.io.IOException;

/**
 * @author frank
 * @version 1.0
 * @date 2025-04-07 16:38
 */
public abstract class AbstractClient {

    private Credential credential;
    private String endpoint;
    private ClientProfile profile;
    private HttpConnection httpConnection;
    private String path;

    public AbstractClient(Credential credential, String endpoint) {
        this.credential = credential;
        this.endpoint = endpoint;
    }

    private Response doRequest(String endpoint, AbstractModel request) throws IOException {
        String reqMethod = this.profile.getHttpProfile().getReqMethod();
        String protocol = this.profile.getHttpProfile().getProtocol();
        String url = protocol + endpoint + this.path;
        String apigwEndpoint = this.profile.getHttpProfile().getApigwEndpoint();
        if (null != apigwEndpoint) {
            url = protocol + apigwEndpoint;
        }
        if (reqMethod.equals(HttpProfile.REQ_GET)) {
            return this.httpConnection.getRequest(url + "?" + new Gson().toJson(request));
        } else if (reqMethod.equals(HttpProfile.REQ_POST)) {
            return this.httpConnection.postRequest(url, new Gson().toJson(request));
        } else {
            throw new XinyueSDKException("Method only support (GET, POST)");
        }
    }
}

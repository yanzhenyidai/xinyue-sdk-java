package cn.xinyue365.verify.v20250408;

import cn.xinyue365.common.AbstractClient;
import cn.xinyue365.common.Credential;
import cn.xinyue365.common.profile.HttpProfile;
import cn.xinyue365.verify.v20250408.models.VerifyRequest;
import cn.xinyue365.verify.v20250408.models.VerifyResponse;
import com.google.gson.JsonObject;

/**
 * @author frank
 * @version 1.0
 */
public class VerifyClient extends AbstractClient {

    public VerifyClient(Credential credential, HttpProfile httpProfile, String endpoint) {
        super(credential, httpProfile, endpoint);
    }

    public VerifyResponse verify(VerifyRequest request) {
        return this.call("/verify/v1", request, VerifyResponse.class);
    }
}

package cn.xinyue365.verify.v20250408;

import cn.xinyue365.common.AbstractClient;
import cn.xinyue365.common.Credential;
import cn.xinyue365.common.profile.HttpProfile;
import cn.xinyue365.verify.v20250408.models.VerifyRequest;
import com.google.gson.JsonObject;

/**
 * @author frank
 * @version 1.0
 * @date 2025-04-08 14:18
 */
public class VerifyClient extends AbstractClient {

    public VerifyClient(Credential credential, HttpProfile httpProfile, String endpoint) {
        super(credential, httpProfile, endpoint);
    }

    public JsonObject verify(VerifyRequest request) {
        return this.call("/sec/verify/v2", request, JsonObject.class);
    }
}

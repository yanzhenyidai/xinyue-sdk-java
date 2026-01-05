package cn.xinyue365.verify.v20260105;

import cn.xinyue365.common.AbstractClient;
import cn.xinyue365.common.Credential;
import cn.xinyue365.common.profile.HttpProfile;
import cn.xinyue365.verify.v20260105.models.VerifyRequest;
import cn.xinyue365.verify.v20260105.models.VerifyResponse;

/**
 * v20250105发票验真
 *
 * @author frank
 */
public class VerifyClient extends AbstractClient {

    public VerifyClient(Credential credential, HttpProfile httpProfile, String endpoint) {
        super(credential, httpProfile, endpoint);
    }

    public VerifyResponse verify(VerifyRequest request) {
        return this.postCall("/verify/doVatV2", request, VerifyResponse.class);
    }
}

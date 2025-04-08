package cn.xinyue365.ocr.v20250408;

import cn.xinyue365.common.AbstractClient;
import cn.xinyue365.common.Credential;
import cn.xinyue365.common.profile.HttpProfile;
import cn.xinyue365.ocr.v20250408.models.OcrRequest;
import cn.xinyue365.ocr.v20250408.models.OcrResponse;

/**
 * @author frank
 * @version 1.0
 * @date 2025-04-08 14:18
 */
public class OcrClient extends AbstractClient {

    public OcrClient(Credential credential, HttpProfile httpProfile, String endpoint) {
        super(credential, httpProfile, endpoint);
    }

    public OcrResponse ocr(OcrRequest request) {
        return call("/ocr", request, OcrResponse.class);
    }
}

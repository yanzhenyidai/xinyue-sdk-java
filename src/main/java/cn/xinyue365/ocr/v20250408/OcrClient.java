package cn.xinyue365.ocr.v20250408;

import cn.xinyue365.common.AbstractClient;
import cn.xinyue365.common.Credential;
import cn.xinyue365.common.profile.HttpProfile;
import cn.xinyue365.ocr.v20250408.models.invoice.InvoiceRequest;
import cn.xinyue365.ocr.v20250408.models.invoice.InvoiceResponse;
import cn.xinyue365.ocr.v20250408.models.text.TextRequest;
import cn.xinyue365.ocr.v20250408.models.text.TextResponse;

/**
 * @author frank
 * @version 1.0
 */
public class OcrClient extends AbstractClient {

    public OcrClient(Credential credential, HttpProfile httpProfile, String endpoint) {
        super(credential, httpProfile, endpoint);
    }

    public InvoiceResponse ocr(InvoiceRequest request) {
        return this.call("/ocr/invoice", request, InvoiceResponse.class);
    }

    public TextResponse ocr(TextRequest request) {
        return this.call("/ocr/text", request, TextResponse.class);
    }
}

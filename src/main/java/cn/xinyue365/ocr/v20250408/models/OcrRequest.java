package cn.xinyue365.ocr.v20250408.models;

import cn.xinyue365.common.AbstractRequest;
import com.google.gson.Gson;

/**
 * @author frank
 * @version 1.0
 * @date 2025-04-08 14:19
 */
public class OcrRequest extends AbstractRequest {

    @Override
    public String toJson() {
        return new Gson().toJson(this);
    }
}

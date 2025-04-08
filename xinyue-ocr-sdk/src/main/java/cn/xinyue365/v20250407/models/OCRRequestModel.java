package cn.xinyue365.v20250407.models;

import cn.xinyue365.common.AbstractModel;

import java.io.Serializable;

/**
 * OCR文字提取 传参
 *
 * @author frank
 * @version 1.0
 * @date 2025-04-07 16:15
 */
public class OCRRequestModel extends AbstractModel implements Serializable {

    private String ocrType;

    private String ocrFile;

    public String getOcrType() {
        return ocrType;
    }

    public void setOcrType(String ocrType) {
        this.ocrType = ocrType;
    }

    public String getOcrFile() {
        return ocrFile;
    }

    public void setOcrFile(String ocrFile) {
        this.ocrFile = ocrFile;
    }
}

package cn.xinyue365.ocr.v20250408.models.invoice;

import cn.xinyue365.common.AbstractRequest;
import com.google.gson.Gson;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 发票识别
 *
 * @author frank
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class InvoiceRequest extends AbstractRequest {

    /**
     * 文件名
     */
    private String name;

    /**
     * base64文件
     */
    private String base64Info;

    /**
     * URL地址文件
     */
    private String urlInfo;


    public String toJson() {
        return new Gson().toJson(this);
    }
}

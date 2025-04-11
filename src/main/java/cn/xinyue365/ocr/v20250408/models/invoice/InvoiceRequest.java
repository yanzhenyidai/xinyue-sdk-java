package cn.xinyue365.ocr.v20250408.models.invoice;

import cn.xinyue365.common.AbstractRequest;
import com.google.gson.Gson;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 发票识别
 *
 * @author frank
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class InvoiceRequest extends AbstractRequest {

    /**
     * 请求类型：1、在线文件，2、Base64文件
     */
    private String type;

    /**
     * 文件格式
     */
    private String fileStyle;

    /**
     * 文件信息
     */
    private String fileInfo;

    public String toJson() {
        return new Gson().toJson(this);
    }
}

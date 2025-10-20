package cn.xinyue365.ocr.v20250408.models.invoice;

import cn.xinyue365.common.AbstractRequest;
import cn.xinyue365.common.annontation.MetaInfo;
import com.google.gson.Gson;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.File;

/**
 * 发票识别
 *
 * @author frank
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@MetaInfo(name = "发票识别请求信息", remark = "file,base64Info,urlInfo 三个字段必须传一个值")
public class InvoiceRequest extends AbstractRequest {

    @MetaInfo(name = "文件名", required = true)
    private String name;

    @MetaInfo(name = "file文件")
    private File file;

    @MetaInfo(name = "base64文件")
    private String base64Info;

    @MetaInfo(name = "URL地址文件")
    private String urlInfo;

    public String toJson() {
        return new Gson().toJson(this);
    }
}

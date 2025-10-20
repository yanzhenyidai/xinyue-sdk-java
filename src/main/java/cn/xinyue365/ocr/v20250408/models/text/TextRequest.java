package cn.xinyue365.ocr.v20250408.models.text;

import cn.xinyue365.common.AbstractRequest;
import cn.xinyue365.common.annontation.MetaInfo;
import com.google.gson.Gson;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.File;
import java.util.List;

/**
 * @author frank
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@MetaInfo(name = "文件识别请求信息")
public class TextRequest extends AbstractRequest {

    @MetaInfo(name = "文件名", required = true)
    private String name;

    @MetaInfo(name = "file文件", required = true)
    private File file;

    @MetaInfo(name = "base64文件", required = true)
    private String base64Info;

    @MetaInfo(name = "URL地址文件", required = true)
    private String urlInfo;

    @MetaInfo(name = "需要提取的关键字信息")
    private List<String> extractCharacters;

    @Override
    public String toJson() {
        return new Gson().toJson(this);
    }
}

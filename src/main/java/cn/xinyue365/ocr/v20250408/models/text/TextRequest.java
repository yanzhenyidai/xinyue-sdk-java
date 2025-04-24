package cn.xinyue365.ocr.v20250408.models.text;

import cn.xinyue365.common.AbstractRequest;
import com.google.gson.Gson;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.InputStream;
import java.util.List;

/**
 * @author frank
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class TextRequest extends AbstractRequest {

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

    /**
     * 需要提取的字符信息
     */
    private List<String> extractCharacters;

    @Override
    public String toJson() {
        return new Gson().toJson(this);
    }
}

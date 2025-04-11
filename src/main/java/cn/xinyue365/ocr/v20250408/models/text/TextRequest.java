package cn.xinyue365.ocr.v20250408.models.text;

import cn.xinyue365.common.AbstractRequest;
import com.google.gson.Gson;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author frank
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TextRequest extends AbstractRequest {

    /**
     * 请求类型：1、在线文件地址，2、Base64文件，3、本地文件地址
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

    /**
     * 需要提取的字符信息
     */
    private List<String> extractCharacters;

    @Override
    public String toJson() {
        return new Gson().toJson(this);
    }
}

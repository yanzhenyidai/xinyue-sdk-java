package cn.xinyue365.ocr.v20250408.models.text;

import cn.xinyue365.common.AbstractModel;
import com.google.gson.Gson;

import java.util.List;

/**
 * @author frank
 * @version 1.0
 * @date 2025-04-11 14:12
 */
public class TextRequest extends AbstractModel {

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

    /**
     * 需要提取的字符信息
     */
    private List<String> extractCharacters;

    @Override
    public String toJson() {
        return new Gson().toJson(this);
    }
}

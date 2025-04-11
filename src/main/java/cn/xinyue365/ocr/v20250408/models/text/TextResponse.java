package cn.xinyue365.ocr.v20250408.models.text;

import cn.xinyue365.common.AbstractModel;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author frank
 * @version 1.0
 * @date 2025-04-11 14:22
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class TextResponse extends AbstractModel {

    private String msg;
    private Integer result;

    private List<JsonObject> items;

    @Override
    public String toJson() {
        return new Gson().toJson(this);
    }
}

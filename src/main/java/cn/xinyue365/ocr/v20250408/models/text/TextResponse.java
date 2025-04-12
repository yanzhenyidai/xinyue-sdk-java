package cn.xinyue365.ocr.v20250408.models.text;

import cn.xinyue365.common.AbstractResponse;
import com.google.gson.JsonObject;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author frank
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class TextResponse extends AbstractResponse<JsonObject> {

}

package cn.xinyue365.ocr.v20250408.models.invoice;

import cn.xinyue365.common.AbstractModel;
import com.google.gson.Gson;

/**
 * @author frank
 * @version 1.0
 */
public class InvoiceResponse extends AbstractModel {

    @Override
    public String toJson() {
        return new Gson().toJson(this);
    }
}

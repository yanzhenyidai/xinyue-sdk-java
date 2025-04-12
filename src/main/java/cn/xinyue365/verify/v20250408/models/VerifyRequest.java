package cn.xinyue365.verify.v20250408.models;

import cn.xinyue365.common.AbstractRequest;
import com.google.gson.Gson;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author frank
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class VerifyRequest extends AbstractRequest implements Serializable {

    /**
     * 发票代码
     */
    private String invoiceCode;

    /**
     * 发票号码
     */
    private String invoiceNum;

    /**
     * 发票日期 格式为yyyy-MM-dd
     */
    private String invoiceDate;

    /**
     * 发票金额 发票类型为增值税专票、机动车发票时必输（查询）
     */
    private String amountTotal;

    /**
     * 校验码 发票类型为增值税普票、电子发票、卷式发票时必输（查询）
     */
    private String checkCode;

    /**
     * 税额
     */
    private String tax;

    /**
     * 价税合计
     */
    private String taxAmount;

    /**
     * 销售方税号
     */
    private String vendorTaxCode;

    @Override
    public String toJson() {
        return new Gson().toJson(this);
    }
}

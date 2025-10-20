package cn.xinyue365.verify.v20250408.models;

import cn.xinyue365.common.AbstractRequest;
import cn.xinyue365.common.annontation.MetaInfo;
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
@MetaInfo(name = "发票查验请求信息")
public class VerifyRequest extends AbstractRequest implements Serializable {

    @MetaInfo(name = "发票代码")
    private String invoiceCode;

    @MetaInfo(name = "发票号码")
    private String invoiceNum;

    @MetaInfo(name = "开票日期", remark = "格式为：yyyy-MM-dd")
    private String invoiceDate;

    @MetaInfo(name = "发票金额", remark = "发票类型为增值税专票、机动车发票时必输（查询）")
    private String amountTotal;

    @MetaInfo(name = "校验码", remark = "发票类型为增值税普票、电子发票、卷式发票时必输（查询）")
    private String checkCode;

    @MetaInfo(name = "税额")
    private String tax;

    @MetaInfo(name = "价税合计")
    private String taxAmount;

    @MetaInfo(name = "销售方税号", remark = "发票类型为区块链发票时必输（查询）")
    private String vendorTaxCode;

    @Override
    public String toJson() {
        return new Gson().toJson(this);
    }
}

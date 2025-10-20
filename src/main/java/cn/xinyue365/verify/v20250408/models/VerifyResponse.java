package cn.xinyue365.verify.v20250408.models;

import cn.xinyue365.common.AbstractResponse;
import cn.xinyue365.common.annontation.MetaInfo;
import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * @author frank
 */
@Data
@EqualsAndHashCode(callSuper = true)
@MetaInfo(name = "发票查验返回信息")
public class VerifyResponse extends AbstractResponse<VerifyResponse.Invoice> {

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Builder
    @MetaInfo(name = "发票信息")
    public static class Invoice implements Serializable {

        @MetaInfo(name = "发票代码")
        private String invoiceCode;

        @MetaInfo(name = "发票号码")
        private String invoiceNo;

        @MetaInfo(name = "发票类型")
        private String invoiceType;

        @MetaInfo(name = "发票类型", remark = "区分数电票的类型")
        private String realinvoiceType;

        @MetaInfo(name = "发票日期")
        private String invoiceDate;

        @MetaInfo(name = "机器编号")
        private String machineNo;

        @MetaInfo(name = "购方名称")
        private String buyerName;

        @MetaInfo(name = "购方税号")
        private String buyerTaxNo;

        @MetaInfo(name = "购方地址电话")
        private String buyerAddressPhone;

        @MetaInfo(name = "购方银行账号")
        private String buyerAccount;

        @MetaInfo(name = "校验码")
        private String checkCode;

        @MetaInfo(name = "查验次数")
        private String checkCount;

        @MetaInfo(name = "开票人")
        private String drawer;

        @MetaInfo(name = "收款人")
        private String payee;

        @MetaInfo(name = "复核人")
        private String reviewer;

        @MetaInfo(name = "状态")
        private String resultCode;

        @MetaInfo(name = "状态提示")
        private String resultTip;

        @MetaInfo(name = "销方名称")
        private String salerName;

        @MetaInfo(name = "销方税号")
        private String salerTaxNo;

        @MetaInfo(name = "销方地址电话")
        private String salerAddressPhone;

        @MetaInfo(name = "销方银行账号")
        private String salerBankAccount;

        @MetaInfo(name = "作废状态", remark = "1-已作废  0-未作废")
        private String cancellationMark;

        @MetaInfo(name = "红冲标志", remark = "0-未红冲，1-全额红冲，2-部分红冲")
        private String hcbz;

        @MetaInfo(name = "发票金额")
        private String invoiceAmount;

        @MetaInfo(name = "税额")
        private String taxAmount;

        @MetaInfo(name = "价税合计")
        private String totalAmount;

        @MetaInfo(name = "发票类型代码")
        private String fplxdm;

        @MetaInfo(name = "清单标志")
        private String qdbz;

        @MetaInfo(name = "备注")
        private String remark;

        @MetaInfo(name = "备注")
        private String remark_b64;

        @MetaInfo(name = "明细")
        private List<Detail> detailList;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Builder
    @MetaInfo(name = "发票明细")
    public static class Detail implements Serializable {

        @MetaInfo(name = "商品名称")
        private String goodsName;

        @MetaInfo(name = "规格型号")
        private String specificationModel;

        @MetaInfo(name = "单位")
        private String unit;

        @MetaInfo(name = "数量")
        private String num;

        @MetaInfo(name = "单价")
        private String unitPrice;

        @MetaInfo(name = "金额")
        private String detailAmount;

        @MetaInfo(name = "税率")
        private String taxRate;

        @MetaInfo(name = "税额")
        private String taxAmount;

        @MetaInfo(name = "分类编码")
        private String flbm;

        @MetaInfo(name = "明细序号")
        private String detailNo;

        @MetaInfo(name = "含税单价")
        private String taxUnitPrice;

        @MetaInfo(name = "含税金额")
        private String taxDetailAmount;
    }
}

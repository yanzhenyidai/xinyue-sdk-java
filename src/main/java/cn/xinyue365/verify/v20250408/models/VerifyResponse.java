package cn.xinyue365.verify.v20250408.models;

import cn.xinyue365.common.AbstractModel;
import com.google.gson.Gson;
import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * @author frank
 * @version 1.0
 * @date 2025-04-11 14:17
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class VerifyResponse extends AbstractModel {

    private String msg;
    private Integer result;
    private Invoice invoice;

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Builder
    public static class Invoice implements Serializable {
        private String invoiceCode;
        private String invoiceNo;
        private String invoiceType;
        private String realinvoiceType;
        private String invoiceDate;
        private String machineNo;
        private String buyerName;
        private String buyerTaxNo;
        private String buyerAddressPhone;
        private String buyerAccount;
        private String checkCode;
        private String checkCount;
        private String drawer;
        private String payee;
        private String reviewer;
        private String resultCode;
        private String resultTip;
        private String salerName;
        private String salerTaxNo;
        private String salerAddressPhone;
        private String salerBankAccount;
        private String cancellationMark;
        private String hcbz;
        private String invoiceAmount;
        private String taxAmount;
        private String totalAmount;
        private String fplxdm;
        private String qdbz;
        private String remark;
        private String remark_b64;
        private List<Detail> detailList;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @Builder
    public static class Detail implements Serializable {
        private String goodsName;
        private String specificationModel;
        private String unit;
        private String num;
        private String unitPrice;
        private String detailAmount;
        private String taxRate;
        private String taxAmount;
        private String flbm;
        private String detailNo;
        private String taxUnitPrice;
        private String taxDetailAmount;
    }

    @Override
    public String toJson() {
        return new Gson().toJson(this);
    }
}

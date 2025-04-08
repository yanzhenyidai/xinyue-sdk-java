package cn.xinyue365.verify.v20250408.models;

import cn.xinyue365.common.AbstractRequest;
import com.google.gson.Gson;

import java.io.Serializable;

/**
 * @author frank
 * @version 1.0
 * @date 2025-04-08 14:19
 */
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

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getAmountTotal() {
        return amountTotal;
    }

    public void setAmountTotal(String amountTotal) {
        this.amountTotal = amountTotal;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getVendorTaxCode() {
        return vendorTaxCode;
    }

    public void setVendorTaxCode(String vendorTaxCode) {
        this.vendorTaxCode = vendorTaxCode;
    }

    @Override
    public String toJson() {
        return new Gson().toJson(this);
    }
}

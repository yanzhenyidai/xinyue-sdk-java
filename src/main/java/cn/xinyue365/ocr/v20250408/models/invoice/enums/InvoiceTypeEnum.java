package cn.xinyue365.ocr.v20250408.models.invoice.enums;

/**
 * 发票类型枚举
 *
 * @author frank
 */
public enum InvoiceTypeEnum {

    ELECTRONIC_ORDINARY_INVOICE("电子普通发票", "10102", "vatInvoice"),
    DIGITAL_ELECTRONIC_ORDINARY_INVOICE("数电普通发票", "10108", "vatInvoice"),
    ORDINARY_INVOICE("普通发票", "10101", "vatInvoice"),
    SPECIAL_INVOICE("专用发票", "10100", "vatInvoice"),
    ELECTRONIC_SPECIAL_INVOICE("电子专用发票", "10100a", "vatInvoice"),
    DIGITAL_ELECTRONIC_SPECIAL_INVOICE("数电专用发票", "10107", "vatInvoice"),
    GENERAL_INVOICE("通用发票", "10101a", "vatInvoice"),
    TRAIN_TICKET("火车票", "10503", "trainInvoice"),
    QUOTA_INVOICE("定额发票", "10200", "quotaInvoice"),
    MOTOR_VEHICLE_INVOICE("机动车销售统一发票", "10104", "motorVehicleInvoice"),
    AIR_TICKET_ITINERARY("机票行程单", "10506", "airInvoice"),
    ROLL_INVOICE("卷票", "10103", "couponInvoice"),
    TAX_PAYMENT_CERTIFICATE("税收完税证明", "10902", "taxProofInvoice"),
    ROAD_BRIDGE_FEE_INVOICE("过路过桥费发票", "10507", "roadTaxInvoice"),
    SECOND_HAND_CAR_INVOICE("二手车发票", "10105", "usedCarInvoice"),
    PASSENGER_TRANSPORT_TICKET("客运车船票", "10505a", "shipInvoice"),
    TAXI_RECEIPT("出租车票", "10500", "taxiInvoice"),
    MACHINE_PRINTED_INVOICE("机打发票", "10400", "handwrittenInvoice"),
    OTHER_INVOICE("其他发票", "10900", "otherInvoice");

    private final String code;

    private final String value;

    private final String attr;

    InvoiceTypeEnum(String code, String value, String attr) {
        this.code = code;
        this.value = value;
        this.attr = attr;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    public String getAttr() {
        return attr;
    }

    public static String getValueByCode(String code) {
        for (InvoiceTypeEnum invoiceTypeEnum : InvoiceTypeEnum.values()) {
            if (invoiceTypeEnum.getCode().equals(code)) {
                return invoiceTypeEnum.getValue();
            }
        }
        return null;
    }

    public static String getAttrByCode(String code) {
        for (InvoiceTypeEnum invoiceTypeEnum : InvoiceTypeEnum.values()) {
            if (invoiceTypeEnum.getCode().equals(code)) {
                return invoiceTypeEnum.getAttr();
            }
        }
        return null;
    }

    public static String getCodeByValue(String value) {
        for (InvoiceTypeEnum invoiceTypeEnum : InvoiceTypeEnum.values()) {
            if (invoiceTypeEnum.getValue().equals(value)) {
                return invoiceTypeEnum.getCode();
            }
        }
        return null;
    }

    public static String getAttrByValue(String value) {
        for (InvoiceTypeEnum invoiceTypeEnum : InvoiceTypeEnum.values()) {
            if (invoiceTypeEnum.getValue().equals(value)) {
                return invoiceTypeEnum.getAttr();
            }
        }
        return null;
    }
}

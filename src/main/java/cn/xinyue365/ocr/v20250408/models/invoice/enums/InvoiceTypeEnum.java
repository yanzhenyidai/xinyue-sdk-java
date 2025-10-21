package cn.xinyue365.ocr.v20250408.models.invoice.enums;

/**
 * 发票类型枚举
 *
 * @author frank
 */
public enum InvoiceTypeEnum {

    ELECTRONIC_ORDINARY_INVOICE("电子普通发票", "10102"),
    DIGITAL_ELECTRONIC_ORDINARY_INVOICE("数电普通发票", "10108"),
    ORDINARY_INVOICE("普通发票", "10101"),
    SPECIAL_INVOICE("专用发票", "10100"),
    ELECTRONIC_SPECIAL_INVOICE("电子专用发票", "10100a"),
    DIGITAL_ELECTRONIC_SPECIAL_INVOICE("数电专用发票", "10107"),
    GENERAL_INVOICE("通用发票", "10101a"),
    TRAIN_TICKET("火车票", "10503"),
    QUOTA_INVOICE("定额发票", "10200"),
    MOTOR_VEHICLE_INVOICE("机动车销售统一发票", "10104"),
    AIR_TICKET_ITINERARY("机票行程单", "10506"),
    ROLL_INVOICE("卷票", "10103"),
    TAX_PAYMENT_CERTIFICATE("税收完税证明", "10902"),
    ROAD_BRIDGE_FEE_INVOICE("过路过桥费发票", "10507"),
    SECOND_HAND_CAR_INVOICE("二手车发票", "10105"),
    PASSENGER_TRANSPORT_TICKET("客运车船票", "10505a"),
    TAXI_RECEIPT("出租车票", "10500"),
    MACHINE_PRINTED_INVOICE("机打发票", "10400"),
    OTHER_INVOICE("其他发票", "10900");

    private final String code;

    private final String value;

    InvoiceTypeEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }

    public static String getValueByCode(String code) {
        for (InvoiceTypeEnum invoiceTypeEnum : InvoiceTypeEnum.values()) {
            if (invoiceTypeEnum.getCode().equals(code)) {
                return invoiceTypeEnum.getValue();
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
}

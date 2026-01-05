package cn.xinyue365.verify.v20260105.enums;

/**
 * 验真发票类型
 *
 * @author frank
 */
public enum VerifyInvoiceEnum {

    VAT_SPECIAL("01", "增值税专用发票"),
    VEHICLE_SALE("03", "机动车销售统一发票"),
    VAT_GENERAL("04", "增值税普通发票"),
    VAT_SPECIAL_ELECTRONIC("08", "增值税专用发票（电子）"),

    FULL_ELECTRIC("09", "全电发票"),
    FULL_ELECTRIC_PAPER_SPECIAL("0901", "全电纸质发票(增值税专用发票)"),
    FULL_ELECTRIC_PAPER_VEHICLE("0903", "全电纸质(机动车销售统一发票)"),
    FULL_ELECTRIC_PAPER_GENERAL("0904", "全电纸质发票(增值税普通发票)"),
    ELECTRONIC_GENERAL("0910", "电子发票（普通发票）"),
    FULL_ELECTRIC_PAPER_USED_CAR("0915", "全电纸质(二手车统一销售发票)"),
    ELECTRONIC_SPECIAL("0920", "电子发票（增值税专用发票）"),
    ELECTRONIC_VEHICLE("0930", "电子发票（机动车销售统一发票）"),
    ELECTRONIC_USED_CAR("0940", "电子发票（二手车销售统一发票)"),

    ELECTRONIC_TOLL("8208", "电子发票（通行费发票）"),
    VAT_GENERAL_ELECTRONIC("10", "增值税普通发票（电子）"),
    VAT_GENERAL_ROLL("11", "增值税普通发票（卷式）"),
    TOLL("14", "通行费发票"),
    USED_CAR("15", "二手车发票"),

    RAILWAY_TICKET("83", "电子发票（铁路电子客票）"),
    AIR_TICKET("61", "电子发票（航空运输电子客票行程单）");

    private final String code;
    private final String desc;

    VerifyInvoiceEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    /**
     * 根据发票类型编码获取枚举
     */
    public static VerifyInvoiceEnum getDescByCode(String code) {
        if (code == null) {
            return null;
        }
        for (VerifyInvoiceEnum value : values()) {
            if (value.code.equals(code)) {
                return value;
            }
        }
        return null;
    }
}

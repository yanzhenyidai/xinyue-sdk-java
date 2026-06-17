package cn.xinyue365.ocr.v20250408.models.invoice;

import cn.xinyue365.common.AbstractResponse;
import cn.xinyue365.common.annontation.MetaInfo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author frank
 */
@Builder
@MetaInfo(name = "发票识别信息返回")
public class InvoiceResponse extends AbstractResponse<InvoiceResponse.Data> {

    @Getter
    @Setter
    @MetaInfo(name = "发票识别信息")
    public static class Data implements Serializable {

        @MetaInfo(name = "发票数量")
        private int count;

        @MetaInfo(name = "发票列表")
        private List<InvoiceData> invoiceList;
    }

    @Setter
    @Getter
    @Builder
    @MetaInfo(name = "发票信息")
    public static class InvoiceData implements Serializable {

        @MetaInfo(name = "序号")
        private String index;

        @MetaInfo(name = "发票类型", remark = "大类信息可以参考：cn/xinyue365/ocr/v20250408/models/invoice/enums/InvoiceTypeEnum.java")
        private String type;

        @MetaInfo(name = "发票区域")
        private List<String> region = new ArrayList<>();

        @MetaInfo(name = "增值税发票信息", remark = "包括：电子普通发票、数电普通发票、普通发票、专用发票、电子专用发票、数电专用发票、通用发票")
        private VatInvoice vatInvoice;

        @MetaInfo(name = "机票发票信息")
        private AirInvoice airInvoice;

        @MetaInfo(name = "火车票发票信息")
        private TrainInvoice trainInvoice;

        @MetaInfo(name = "机打发票发票信息")
        private HandwrittenInvoice handwrittenInvoice;

        @MetaInfo(name = "卷票发票信息")
        private CouponInvoice couponInvoice;

        @MetaInfo(name = "出租车发票信息")
        private TaxiInvoice taxiInvoice;

        @MetaInfo(name = "定额发票信息")
        private QuotaInvoice quotaInvoice;

        @MetaInfo(name = "过路费发票信息")
        private RoadTaxInvoice roadTaxInvoice;

        @MetaInfo(name = "客运汽车发票信息")
        private PassengerCarInvoice passengerInvoice;

        @MetaInfo(name = "二手车发票信息")
        private UsedCarInvoice usedCarInvoice;

        @MetaInfo(name = "机动车发票信息")
        private MotorVehicleInvoice motorVehicleInvoice;

        @MetaInfo(name = "小票发票信息")
        private ReceiptInvoice receiptInvoice;

        @MetaInfo(name = "滴滴出行行程单")
        private TripInvoice tripInvoice;

        @MetaInfo(name = "完税证明")
        private TaxProofInvoice taxProofInvoice;

        @MetaInfo(name = "船票")
        private ShipInvoice shipInvoice;

        @MetaInfo(name = "其他发票")
        private OtherInvoice otherInvoice;
    }

    @Setter
    @Getter
    @Builder
    @MetaInfo(name = "增值税发票信息", remark = "包括：电子普通发票、数电普通发票、普通发票、专用发票、电子专用发票、数电专用发票、通用发票")
    public static class VatInvoice implements Serializable {

        @MetaInfo(name = "发票代码")
        private String code;

        @MetaInfo(name = "发票号码")
        private String number;

        @MetaInfo(name = "开票日期")
        private String date;

        @MetaInfo(name = "金额")
        private String pretaxAmount;

        @MetaInfo(name = "税额")
        private String tax;

        @MetaInfo(name = "校验码")
        private String checkCode;

        @MetaInfo(name = "合计金额")
        private String total;

        @MetaInfo(name = "销方名称")
        private String seller;

        @MetaInfo(name = "销方税号")
        private String sellerTaxId;

        @MetaInfo(name = "购方名称")
        private String buyer;

        @MetaInfo(name = "购方税号")
        private String buyerTaxId;

        @MetaInfo(name = "公司印章")
        private String companySeal;

        @MetaInfo(name = "联次信息", remark = "发票联、抵扣联")
        private String formType;

        @MetaInfo(name = "发票名称")
        private String formName;

        @MetaInfo(name = "发票类别")
        private String kind;

        @MetaInfo(name = "密文信息")
        private String ciphertext;

        @MetaInfo(name = "机器编号")
        private String machineCode;

        @MetaInfo(name = "收款人")
        private String receiptor;

        @MetaInfo(name = "复核人")
        private String reviewer;

        @MetaInfo(name = "开票人")
        private String issuer;

        @MetaInfo(name = "省")
        private String province;

        @MetaInfo(name = "市")
        private String city;

        @MetaInfo(name = "服务名称")
        private String serviceName;

        @MetaInfo(name = "备注")
        private String remark;

        @MetaInfo(name = "购方地址电话")
        private String buyerAddrTel;

        @MetaInfo(name = "购方银行账号")
        private String buyerBankAccount;

        @MetaInfo(name = "销方地址电话")
        private String sellerAddrTel;

        @MetaInfo(name = "销方银行账号")
        private String sellerBankAccount;

        @MetaInfo(name = "发票明细")
        private List<Item> items;
    }


    @Setter
    @Getter
    @Builder
    @MetaInfo(name = "机票信息")
    public static class AirInvoice implements Serializable {

        @MetaInfo(name = "旅客姓名")
        private String userName;

        @MetaInfo(name = "身份证号")
        private String userId;

        @MetaInfo(name = "电子客票号码")
        private String number;

        @MetaInfo(name = "验证码")
        private String checkCode;

        @MetaInfo(name = "填开日期")
        private String date;

        @MetaInfo(name = "销售单位代号")
        private String agentCode;

        @MetaInfo(name = "填开单位")
        private String issueBy;

        @MetaInfo(name = "票价")
        private String fare;

        @MetaInfo(name = "税费")
        private String tax;

        @MetaInfo(name = "燃油附加费")
        private String fuelSurcharge;

        @MetaInfo(name = "民航发展基金")
        private String caacDevelopmentFund;

        @MetaInfo(name = "保险")
        private String insurance;

        @MetaInfo(name = "合计")
        private String total;

        @MetaInfo(name = "发票类别")
        private String kind;

        @MetaInfo(name = "国内/国际航班发票标记")
        private String internationalFlag;

        @MetaInfo(name = "打印序号")
        private String printNumber;

        @MetaInfo(name = "其他税费")
        private String otherTax;

        @MetaInfo(name = "机票明细信息")
        private List<Flight> flights = new ArrayList<Flight>();
    }

    @Setter
    @Getter
    @Builder
    @MetaInfo(name = "火车票信息")
    public static class TrainInvoice implements Serializable {

        @MetaInfo(name = "号码")
        private String number;

        @MetaInfo(name = "乘车日期")
        private String date;

        @MetaInfo(name = "时间")
        private String time;

        @MetaInfo(name = "姓名")
        private String name;

        @MetaInfo(name = "出发站")
        private String stationGeton;

        @MetaInfo(name = "到达站")
        private String stationGetoff;

        @MetaInfo(name = "车次")
        private String trainNumber;

        @MetaInfo(name = "座位")
        private String seat;

        @MetaInfo(name = "金额")
        private String total;

        @MetaInfo(name = "发票类别")
        private String kind;

        @MetaInfo(name = "发票序号")
        private String serialNumber;

        @MetaInfo(name = "退票标记")
        private String refundMark;

        @MetaInfo(name = "身份证号")
        private String userId;
    }

    @Setter
    @Getter
    @Builder
    @MetaInfo(name = "机打信息")
    public static class HandwrittenInvoice implements Serializable {

        @MetaInfo(name = "发票代码")
        private String code;

        @MetaInfo(name = "发票号码")
        private String number;

        @MetaInfo(name = "开票日期")
        private String date;

        @MetaInfo(name = "开票时间")
        private String time;

        @MetaInfo(name = "校验码")
        private String checkCode;

        @MetaInfo(name = "发票类别")
        private String category;

        @MetaInfo(name = "合计金额")
        private String total;

        @MetaInfo(name = "销方名称")
        private String seller;

        @MetaInfo(name = "销方税号")
        private String sellerTaxId;

        @MetaInfo(name = "购方名称")
        private String buyer;

        @MetaInfo(name = "购方税号")
        private String buyerTaxId;

        @MetaInfo(name = "发票种类")
        private String kind;

        @MetaInfo(name = "省")
        private String province;

        @MetaInfo(name = "市")
        private String city;

        @MetaInfo(name = "公司章")
        private String companySeal;

        @MetaInfo(name = "明细")
        private List<Item> items = new ArrayList<>();

    }

    @Setter
    @Getter
    @Builder
    @MetaInfo(name = "卷票")
    public static class CouponInvoice implements Serializable {

        @MetaInfo(name = "发票代码")
        private String code;

        @MetaInfo(name = "发票号码")
        private String number;

        @MetaInfo(name = "开票日期")
        private String date;

        @MetaInfo(name = "校验码")
        private String checkCode;

        @MetaInfo(name = "销方名称")
        private String seller;

        @MetaInfo(name = "销方税号")
        private String sellerTaxId;

        @MetaInfo(name = "购方名称")
        private String buyer;

        @MetaInfo(name = "购方税号")
        private String buyerTaxId;

        @MetaInfo(name = "发票类别")
        private String category;

        @MetaInfo(name = "合计金额")
        private String total;

        @MetaInfo(name = "发票种类")
        private String kind;

        @MetaInfo(name = "省")
        private String province;

        @MetaInfo(name = "市")
        private String city;

        @MetaInfo(name = "公司章")
        private String companySeal;

        @MetaInfo(name = "服务名称")
        private String serviceName;

        @MetaInfo(name = "项目")
        private String itemNames;
    }

    @Setter
    @Getter
    @Builder
    @MetaInfo(name = "出租车发票")
    public static class TaxiInvoice implements Serializable {

        @MetaInfo(name = "发票代码")
        private String code;

        @MetaInfo(name = "发票号码")
        private String number;

        @MetaInfo(name = "开票日期")
        private String date;

        @MetaInfo(name = "上车时间")
        private String timeGeton;

        @MetaInfo(name = "下车时间")
        private String timeGetoff;

        @MetaInfo(name = "里程")
        private String mileage;

        @MetaInfo(name = "金额")
        private String total;

        @MetaInfo(name = "开票地点")
        private String place;

        @MetaInfo(name = "发票类别")
        private String kind;

        @MetaInfo(name = "省")
        private String province;

        @MetaInfo(name = "市")
        private String city;

        @MetaInfo(name = "车牌号码")
        private String licensePlate;
    }

    @Setter
    @Getter
    @Builder
    @MetaInfo(name = "定额发票")
    public static class QuotaInvoice implements Serializable {

        @MetaInfo(name = "发票代码")
        private String code;

        @MetaInfo(name = "发票号码")
        private String number;

        @MetaInfo(name = "合计金额")
        private String total;

        @MetaInfo(name = "发票类别")
        private String kind;

        @MetaInfo(name = "省")
        private String province;

        @MetaInfo(name = "市")
        private String city;

        @MetaInfo(name = "公司章")
        private String companySeal;
    }

    @Setter
    @Getter
    @Builder
    @MetaInfo(name = "过路费发票")
    public static class RoadTaxInvoice implements Serializable {

        @MetaInfo(name = "发票代码")
        private String code;

        @MetaInfo(name = "发票号码")
        private String number;

        @MetaInfo(name = "开票日期")
        private String date;

        @MetaInfo(name = "开票时间")
        private String time;

        @MetaInfo(name = "入口")
        private String entrance;

        @MetaInfo(name = "出口")
        private String exit;

        @MetaInfo(name = "合计金额")
        private String total;

        @MetaInfo(name = "发票种类")
        private String kind;

        @MetaInfo(name = "高速标志")
        private String highwayFlag;
    }

    @Setter
    @Getter
    @Builder
    @MetaInfo(name = "客运发票")
    public static class PassengerCarInvoice implements Serializable {

        @MetaInfo(name = "发票代码")
        private String code;

        @MetaInfo(name = "发票号码")
        private String number;

        @MetaInfo(name = "开票日期")
        private String date;

        @MetaInfo(name = "开票时间")
        private String time;

        @MetaInfo(name = "上车站")
        private String stationGeton;

        @MetaInfo(name = "下车站")
        private String stationGetoff;

        @MetaInfo(name = "合计金额")
        private String total;

        @MetaInfo(name = "乘车人")
        private String name;

        @MetaInfo(name = "发票种类")
        private String kind;

        @MetaInfo(name = "身份证号")
        private String userId;
    }

    @Setter
    @Getter
    @Builder
    @MetaInfo(name = "二手车发票")
    public static class UsedCarInvoice implements Serializable {

        @MetaInfo(name = "发票代码")
        private String code;

        @MetaInfo(name = "发票号码")
        private String number;

        @MetaInfo(name = "开票日期")
        private String date;

        @MetaInfo(name = "合计金额")
        private String total;

        @MetaInfo(name = "销方名称")
        private String seller;

        @MetaInfo(name = "销方税号")
        private String sellerId;

        @MetaInfo(name = "购方名称")
        private String buyer;

        @MetaInfo(name = "购方税号")
        private String buyerId;

        @MetaInfo(name = "公司名称")
        private String companyName;

        @MetaInfo(name = "公司税号")
        private String companyTaxId;

        @MetaInfo(name = "车牌号码")
        private String licensePlate;

        @MetaInfo(name = "车辆识别代号")
        private String registrationNumber;

        @MetaInfo(name = "车辆代码")
        private String carCode;

        @MetaInfo(name = "车辆型号")
        private String carModel;

        @MetaInfo(name = "发票种类")
        private String kind;

        @MetaInfo(name = "省")
        private String province;

        @MetaInfo(name = "市")
        private String city;
    }

    @Setter
    @Getter
    @Builder
    @MetaInfo(name = "机动车销售发票")
    public static class MotorVehicleInvoice implements Serializable {

        @MetaInfo(name = "发票代码")
        private String code;

        @MetaInfo(name = "发票号码")
        private String number;

        @MetaInfo(name = "机打代码")
        private String machineCode;

        @MetaInfo(name = "机打号码")
        private String machineNumber;

        @MetaInfo(name = "开票日期")
        private String date;

        @MetaInfo(name = "税前金额")
        private String pretaxAmount;

        @MetaInfo(name = "合计金额")
        private String total;

        @MetaInfo(name = "销方名称")
        private String seller;

        @MetaInfo(name = "销方税号")
        private String sellerTaxId;

        @MetaInfo(name = "购方名称")
        private String buyer;

        @MetaInfo(name = "购方税号")
        private String buyerId;

        @MetaInfo(name = "主管税务机关")
        private String taxAuthorities;

        @MetaInfo(name = "主管税务机关代码")
        private String taxAuthoritiesCode;

        @MetaInfo(name = "车辆识别代码/车架号")
        private String carCode;

        @MetaInfo(name = "车辆发动机号码")
        private String carEngineCode;

        @MetaInfo(name = "车辆型号")
        private String carModel;

        @MetaInfo(name = "车辆合格证编号")
        private String certificateNumber;

        @MetaInfo(name = "发票种类")
        private String kind;

        @MetaInfo(name = "省")
        private String province;

        @MetaInfo(name = "市")
        private String city;

        @MetaInfo(name = "税额")
        private String tax;

        @MetaInfo(name = "税率")
        private String taxRate;
    }

    @Setter
    @Getter
    @Builder
    @MetaInfo(name = "小票")
    public static class ReceiptInvoice implements Serializable {

        @MetaInfo(name = "门店名称")
        private String storeName;

        @MetaInfo(name = "日期")
        private String date;

        @MetaInfo(name = "时间")
        private String time;

        @MetaInfo(name = "小计金额")
        private String subtotal;

        @MetaInfo(name = "税")
        private String tax;

        @MetaInfo(name = "折扣")
        private String discount;

        @MetaInfo(name = "小费")
        private String tips;

        @MetaInfo(name = "合计金额")
        private String total;

        @MetaInfo(name = "币种")
        private String currencyCode;

        @MetaInfo(name = "消费类型")
        private String type;
    }

    @Setter
    @Getter
    @Builder
    @MetaInfo(name = "滴滴出行行程单")
    public static class TripInvoice implements Serializable {

        @MetaInfo(name = "开票日期")
        private String date;

        @MetaInfo(name = "行程开始时间")
        private String dateStart;

        @MetaInfo(name = "行程结束时间")
        private String dateEnd;

        @MetaInfo(name = "手机号码")
        private String phone;

        @MetaInfo(name = "合计金额")
        private String total;
    }

    @Setter
    @Getter
    @Builder
    @MetaInfo(name = "完税证明")
    public static class TaxProofInvoice implements Serializable {

        @MetaInfo(name = "发票号码")
        private String number;

        @MetaInfo(name = "合计金额")
        private String total;

        @MetaInfo(name = "购方名称")
        private String buyer;

        @MetaInfo(name = "购方税号")
        private String buyerTaxId;

        @MetaInfo(name = "开票日期")
        private String date;
    }

    @Setter
    @Getter
    @Builder
    @MetaInfo(name = "船票")
    public static class ShipInvoice implements Serializable {

        @MetaInfo(name = "发票代码")
        private String code;

        @MetaInfo(name = "发票号码")
        private String number;

        @MetaInfo(name = "开票日期")
        private String date;

        @MetaInfo(name = "开票时间")
        private String time;

        @MetaInfo(name = "出发站")
        private String stationGeton;

        @MetaInfo(name = "到达站")
        private String stationGetoff;

        @MetaInfo(name = "合计金额")
        private String total;

        @MetaInfo(name = "销方名称")
        private String name;

        @MetaInfo(name = "发票种类")
        private String kind;

        @MetaInfo(name = "省")
        private String province;

        @MetaInfo(name = "市")
        private String city;

        @MetaInfo(name = "币种")
        private String currencyCode;
    }

    @Setter
    @Getter
    @Builder
    @MetaInfo(name = "其他发票")
    public static class OtherInvoice implements Serializable {

        @MetaInfo(name = "开票日期")
        private String date;

        @MetaInfo(name = "发票代码")
        private String code;

        @MetaInfo(name = "发票号码")
        private String number;

        @MetaInfo(name = "合计金额")
        private String total;
    }

    @Setter
    @Getter
    @Builder
    @MetaInfo(name = "发票明细")
    public static class Item implements Serializable {
        // 发票
        @MetaInfo(name = "名称")
        private String name;

        @MetaInfo(name = "单位")
        private String unit;

        @MetaInfo(name = "数量")
        private String quantity;

        @MetaInfo(name = "单价")
        private String price;

        @MetaInfo(name = "税率")
        private String taxRate;

        @MetaInfo(name = "税额")
        private String tax;

        // 滴滴行程单
        @MetaInfo(name = "车辆类型")
        private String carType;

        @MetaInfo(name = "出发时间")
        private String timeGeton;

        @MetaInfo(name = "出发城市")
        private String city;

        @MetaInfo(name = "出发站点")
        private String stationGeton;

        @MetaInfo(name = "到达城市")
        private String stationGetoff;

        @MetaInfo(name = "里程")
        private String mileage;

        @MetaInfo(name = "合计金额")
        private String total;

    }

    @Setter
    @Getter
    @Builder
    @MetaInfo(name = "航班信息")
    public static class Flight implements Serializable {

        @MetaInfo(name = "出发地")
        private String from;

        @MetaInfo(name = "目的地")
        private String to;

        @MetaInfo(name = "航班号")
        private String flightNumber;

        @MetaInfo(name = "航班日期")
        private String date;

        @MetaInfo(name = "航班时间")
        private String time;

        @MetaInfo(name = "座位")
        private String seat;

        @MetaInfo(name = "承运人")
        private String carrier;
    }
}

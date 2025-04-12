package cn.xinyue365.ocr.v20250408.models.invoice;

import cn.xinyue365.common.AbstractResponse;
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
public class InvoiceResponse extends AbstractResponse<List<InvoiceResponse.Data>> {

    @Setter
    @Getter
    @Builder
    public static class Data implements Serializable {
        private String index;
        private String type;
        private List<String> region = new ArrayList<>();
        private VatInvoice vatInvoice;
        private AirInvoice airInvoice;
        private TrainInvoice trainInvoice;
        private HandwrittenInvoice handwrittenInvoice;
        private CouponInvoice couponInvoice;
        private TaxiInvoice taxiInvoice;
        private QuotaInvoice quotaInvoice;
        private RoadTaxInvoice roadTaxInvoice;
        private PassengerCarInvoice passengerInvoice;
        private UsedCarInvoice usedCarInvoice;
        private MotorVehicleInvoice motorVehicleInvoice;
        private ReceiptInvoice receiptInvoice;
        private TripInvoice tripInvoice;
        private TaxProofInvoice taxProofInvoice;
        private ShipInvoice shipInvoice;
    }

    // 发票
    @Setter
    @Getter
    @Builder
    public static class VatInvoice implements Serializable {
        private String code;
        private String number;
        private String date;
        private String pretaxAmount;
        private String tax;
        private String checkCode;
        private String total;
        private String seller;
        private String sellerTaxId;
        private String buyer;
        private String buyerTaxId;
        private String companySeal;
        private String formType;
        private String formName;
        private String kind;
        private String ciphertext;
        private String machineCode;
        private String receiptor;
        private String reviewer;
        private String issuer;
        private String province;
        private String city;
        private String serviceName;
        private String remark;
        private String buyerAddrTel;
        private String buyerBankAccount;
        private String sellerAddrTel;
        private String sellerBankAccount;

        private List<Item> items;
    }


    // 机票
    @Setter
    @Getter
    @Builder
    public static class AirInvoice implements Serializable {
        private String userName;
        private String userId;
        private String number;
        private String checkCode;
        private String date;
        private String agentcode;
        private String issueBy;
        private String fare;
        private String tax;
        private String fuelSurcharge;
        private String caacDevelopmentFund;
        private String insurance;
        private String total;
        private String kind;
        private String internationalFlag;
        private String printNumber;
        private String otherTax;
        private List<Flight> flights = new ArrayList<Flight>();
    }

    // 火车票
    @Setter
    @Getter
    @Builder
    public static class TrainInvoice implements Serializable {
        private String number;
        private String date;
        private String time;
        private String name;
        private String stationGeton;
        private String stationGetoff;
        private String trainNumber;
        private String seat;
        private String total;
        private String kind;
        private String serialNumber;
        private String refundMark;
        private String userId;
    }

    // 机打发票
    @Setter
    @Getter
    @Builder
    public static class HandwrittenInvoice implements Serializable {
        private String code;
        private String number;
        private String date;
        private String time;
        private String checkCode;
        private String category;
        private String total;
        private String seller;
        private String sellerTaxId;
        private String buyer;
        private String buyerTaxId;
        private String kind;
        private String province;
        private String city;
        private String companySeal;
    }

    // 卷票
    @Setter
    @Getter
    @Builder
    public static class CouponInvoice implements Serializable {
        private String code;
        private String number;
        private String date;
        private String checkCode;
        private String seller;
        private String sellerTaxId;
        private String buyer;
        private String buyerTaxId;
        private String category;
        private String total;
        private String kind;
        private String province;
        private String city;
        private String companySeal;
        private String serviceName;
        private String itemNames;
    }

    // 出租车
    @Setter
    @Getter
    @Builder
    public static class TaxiInvoice implements Serializable {
        private String code;
        private String number;
        private String date;
        private String timeGeton;
        private String timeGetoff;
        private String mileage;
        private String total;
        private String place;
        private String kind;
        private String province;
        private String city;
        private String licensePlate;
    }

    // 定额发票
    @Setter
    @Getter
    @Builder
    public static class QuotaInvoice implements Serializable {
        private String code;
        private String number;
        private String total;
        private String kind;
        private String province;
        private String city;
        private String companySeal;
    }

    // 过路费
    @Setter
    @Getter
    @Builder
    public static class RoadTaxInvoice implements Serializable {
        private String code;
        private String number;
        private String date;
        private String time;
        private String entrance;
        private String exit;
        private String total;
        private String kind;
        private String highwayFlag;
    }

    // 客运汽车
    @Setter
    @Getter
    @Builder
    public static class PassengerCarInvoice implements Serializable {
        private String code;
        private String number;
        private String date;
        private String time;
        private String stationGeton;
        private String stationGetoff;
        private String total;
        private String name;
        private String kind;
        private String userId;
    }

    // 二手车发票
    @Setter
    @Getter
    @Builder
    public static class UsedCarInvoice implements Serializable {
        private String code;
        private String number;
        private String date;
        private String total;
        private String seller;
        private String sellerId;
        private String buyer;
        private String buyerId;
        private String companyName;
        private String companyTaxId;
        private String licensePlate;
        private String registrationNumber;
        private String carCode;
        private String carModel;
        private String kind;
        private String province;
        private String city;
    }

    // 机动车销售统一发票
    @Setter
    @Getter
    @Builder
    public static class MotorVehicleInvoice implements Serializable {
        private String code;
        private String number;
        private String machineCode;
        private String machineNumber;
        private String date;
        private String pretaxAmount;
        private String total;
        private String seller;
        private String sellerTaxId;
        private String buyer;
        private String buyerId;
        private String taxAuthorities;
        private String taxAuthoritiesCode;
        private String carCode;
        private String carEngineCode;
        private String carModel;
        private String certificateNumber;
        private String kind;
        private String province;
        private String city;
        private String tax;
        private String taxRate;
    }

    // 小票
    @Setter
    @Getter
    @Builder
    public static class ReceiptInvoice implements Serializable {
        private String storeName;
        private String date;
        private String time;
        private String subtotal;
        private String tax;
        private String discount;
        private String tips;
        private String total;
        private String currencyCode;
        private String type;
    }

    // 滴滴出行行程单
    @Setter
    @Getter
    @Builder
    public static class TripInvoice implements Serializable {
        private String date;
        private String dateStart;
        private String dateEnd;
        private String phone;
        private String total;
    }

    // 完税证明
    @Setter
    @Getter
    @Builder
    public static class TaxProofInvoice implements Serializable {
        private String number;
        private String total;
        private String buyer;
        private String buyerTaxId;
        private String date;
    }

    // 船票
    @Setter
    @Getter
    @Builder
    public static class ShipInvoice implements Serializable {
        private String code;
        private String number;
        private String date;
        private String time;
        private String stationGeton;
        private String stationGetoff;
        private String total;
        private String name;
        private String kind;
        private String province;
        private String city;
        private String currencyCode;
    }

    @Setter
    @Getter
    @Builder
    public static class Item implements Serializable {
        // 发票
        private String name;
        private String unit;
        private String quantity;
        private String price;
        private String taxRate;
        private String tax;

        // 滴滴行程单
        private String carType;
        private String timeGeton;
        private String city;
        private String stationGeton;
        private String stationGetoff;
        private String mileage;
        private String total;

    }

    @Setter
    @Getter
    @Builder
    public static class Flight implements Serializable {
        private String from;
        private String to;
        private String flightNumber;
        private String date;
        private String time;
        private String seat;
        private String carrier;
    }
}

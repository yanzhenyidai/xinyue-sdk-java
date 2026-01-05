package cn.xinyue365.verify.v20260105.models;

import cn.xinyue365.common.AbstractResponse;
import cn.xinyue365.common.annontation.MetaInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
    public static class Invoice implements Serializable {

        @MetaInfo(name = "发票类型")
        private String fplx;

        @MetaInfo(name = "查验次数")
        private String times;

        @MetaInfo(name = "发票代码")
        private String fpdm;

        @MetaInfo(name = "发票号码")
        private String fphm;

        @MetaInfo(name = "开票日期")
        private String kprq;

        @MetaInfo(name = "发票状态代码")
        private String fpztDm;

        @MetaInfo(name = "发票状态标识")
        private String fpztBz;

        @MetaInfo(name = "校验码")
        private String jym;

        @MetaInfo(name = "税控码")
        private String skm;

        @MetaInfo(name = "设备/机器编号")
        private String sbbh;

        @MetaInfo(name = "开具类型")
        private String kjlx;

        @MetaInfo(name = "开票人")
        private String kpr;

        @MetaInfo(name = "作废人")
        private String zfr;

        @MetaInfo(name = "作废日期")
        private String zfrq;

        @MetaInfo(name = "地区")
        private String dq;

        @MetaInfo(name = "备注")
        private String bz;

        @MetaInfo(name = "清单标志")
        private String xhqdBz;

        @MetaInfo(name = "特殊票种代码")
        private String tspzDm;

        @MetaInfo(name = "通行费标志")
        private String txfbz;

        @MetaInfo(name = "业务类型")
        private String ywlx;

        @MetaInfo(name = "销方名称")
        private String xfmc;

        @MetaInfo(name = "销方识别号")
        private String xfsbh;

        @MetaInfo(name = "销方地址电话")
        private String xsfdzdh;

        @MetaInfo(name = "销方银行账号")
        private String xsfyhzh;

        @MetaInfo(name = "购方名称")
        private String gfmc;

        @MetaInfo(name = "购方识别号")
        private String gfsbh;

        @MetaInfo(name = "购方地址电话")
        private String gmfdzdh;

        @MetaInfo(name = "购方银行账号")
        private String gmfyhzh;

        @MetaInfo(name = "买方单位/个人代码")
        private String gfDm;

        @MetaInfo(name = "买方单位/个人名称")
        private String gfMc;

        @MetaInfo(name = "买方单位/个人地址")
        private String gfDz;

        @MetaInfo(name = "买方单位/个人电话")
        private String gfDh;

        @MetaInfo(name = "卖方单位/个人代码")
        private String xfDm;

        @MetaInfo(name = "卖方单位/个人名称")
        private String xfMc;

        @MetaInfo(name = "卖方单位/个人地址")
        private String xfDz;

        @MetaInfo(name = "卖方单位/个人电话")
        private String xfDh;

        @MetaInfo(name = "金额（不含税）")
        private String je;

        @MetaInfo(name = "税额")
        private String se;

        @MetaInfo(name = "价税合计")
        private String jshj;

        @MetaInfo(name = "价税合计（中文大写）")
        private String jshjcn;

        @MetaInfo(name = "税率或征收率")
        private String slv;

        @MetaInfo(name = "原始税率")
        private String ysslv;

        @MetaInfo(name = "增值税税额")
        private String zzsse;

        @MetaInfo(name = "原始增值税税额")
        private String yszzsse;

        @MetaInfo(name = "合计税额")
        private String hjse;

        @MetaInfo(name = "零税率标识")
        private String lslbs;

        @MetaInfo(name = "PDF版式文件链接")
        private String purl;

        @MetaInfo(name = "OFD版式文件链接")
        private String url;

        @MetaInfo(name = "主管税务机关代码")
        private String swjgDm;

        @MetaInfo(name = "主管税务机关名称")
        private String swjgMc;

        @MetaInfo(name = "完税凭证号码")
        private String wspzhm;

        @MetaInfo(name = "报税纳税人识别号")
        private String bsNsrsbh;

        @MetaInfo(name = "自行编码")
        private String zxbm;

        // -------- 机动车 / 二手车 --------

        @MetaInfo(name = "车辆类型")
        private String cllx;

        @MetaInfo(name = "厂牌型号")
        private String cpxh;

        @MetaInfo(name = "产地")
        private String cd;

        @MetaInfo(name = "合格证号")
        private String hgzh;

        @MetaInfo(name = "进口证明书号")
        private String jkzmsh;

        @MetaInfo(name = "商检单号")
        private String sjdh;

        @MetaInfo(name = "发动机号码")
        private String fdjhm;

        @MetaInfo(name = "车架号")
        private String cjhm;

        @MetaInfo(name = "车辆识别代码")
        private String clsbdm;

        @MetaInfo(name = "车牌号")
        private String cpzh;

        @MetaInfo(name = "登记证号")
        private String djzh;

        @MetaInfo(name = "吨位")
        private String dw;

        @MetaInfo(name = "限乘人数")
        private String xcrs;

        @MetaInfo(name = "车价合计")
        private String cjhj;

        @MetaInfo(name = "车价合计（中文大写）")
        private String cjhjcn;

        @MetaInfo(name = "销货单位名称")
        private String xhdwmc;

        @MetaInfo(name = "销货单位纳税人识别号")
        private String xhdwsbh;

        @MetaInfo(name = "地址")
        private String dz;

        @MetaInfo(name = "电话")
        private String dh;

        @MetaInfo(name = "开户银行")
        private String khyh;

        @MetaInfo(name = "账号")
        private String zh;

        // -------- 二手车市场 --------

        @MetaInfo(name = "二手车市场识别号")
        private String escSbh;

        @MetaInfo(name = "二手车市场名称")
        private String escMc;

        @MetaInfo(name = "二手车市场电话")
        private String escDh;

        @MetaInfo(name = "二手车市场地址")
        private String escDz;

        @MetaInfo(name = "二手车市场开户行账号")
        private String escYhzh;

        @MetaInfo(name = "开票方类型")
        private String kpfLx;

        @MetaInfo(name = "开票方纳税人识别号")
        private String kpfNsrsbh;

        // -------- 客运 / 电子客票 --------

        @MetaInfo(name = "国内国际标志")
        private String gngjbz;

        @MetaInfo(name = "电子客票号")
        private String dzkph;

        @MetaInfo(name = "电子客票号码")
        private String dzkphm;

        @MetaInfo(name = "车次")
        private String cc;

        @MetaInfo(name = "出发站")
        private String cfz;

        @MetaInfo(name = "到达站")
        private String ddz;

        @MetaInfo(name = "出发时间")
        private String cfsj;

        @MetaInfo(name = "乘车日期")
        private String ccrq;

        @MetaInfo(name = "席别")
        private String xb;

        @MetaInfo(name = "车厢")
        private String cx;

        @MetaInfo(name = "席位")
        private String xw;

        @MetaInfo(name = "乘客姓名")
        private String name;

        @MetaInfo(name = "证件号")
        private String zjh;

        @MetaInfo(name = "身份证号码")
        private String sfzhm;

        @MetaInfo(name = "证件号码")
        private String sfzjhm;

        @MetaInfo(name = "货物明细")
        private List<Hwmx> hwmx;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class Hwmx implements Serializable {

        @MetaInfo(name = "始发站")
        private String sfz;

        @MetaInfo(name = "目的站")
        private String mdz;

        @MetaInfo(name = "起飞时间")
        private String qfsj;

        @MetaInfo(name = "座位等级")
        private String zwdj;

        @MetaInfo(name = "客票等级")
        private String kpjb;

        @MetaInfo(name = "航段序号")
        private String hdxh;

        @MetaInfo(name = "承运人")
        private String cyr;

        @MetaInfo(name = "航班号")
        private String hbh;

        @MetaInfo(name = "明细序号")
        private Integer mxxh;

        @MetaInfo(name = "名称")
        private String mc;

        @MetaInfo(name = "规格型号")
        private String ggxh;

        @MetaInfo(name = "计量单位")
        private String jldw;

        @MetaInfo(name = "数量")
        private String sl;

        @MetaInfo(name = "单价")
        private String dj;

        @MetaInfo(name = "金额（不含税）")
        private String je;

        @MetaInfo(name = "税率")
        private String slv;

        @MetaInfo(name = "原始税率")
        private String ysslv;

        @MetaInfo(name = "税额")
        private String se;

        @MetaInfo(name = "原始税额")
        private String ysse;

        @MetaInfo(name = "零税率标识")
        private String lslbs;

        @MetaInfo(name = "商品编码")
        private String spbm;

        @MetaInfo(name = "通行日期起")
        private String txrqq;

        @MetaInfo(name = "通行日期止")
        private String txrqz;
    }
}

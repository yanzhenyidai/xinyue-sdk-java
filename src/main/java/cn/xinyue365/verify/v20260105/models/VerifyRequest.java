package cn.xinyue365.verify.v20260105.models;

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
    private String fpdm;

    @MetaInfo(name = "发票号码")
    private String fphm;

    @MetaInfo(name = "开票日期 yyyy-MM-dd")
    private String kprq;

    @MetaInfo(name = "校验码")
    private String jym;

    @MetaInfo(name = "电票为价税合计，纸质发票为不含税金额")
    private String je;

    @Override
    public String toJson() {
        return new Gson().toJson(this);
    }
}

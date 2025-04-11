package cn.xinyue365.common;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 授权相关
 *
 * @author frank
 * @version 1.0
 */
@Data
public class Credential implements Serializable {

    private String secretId;

    private String secretKey;

    public Credential(String secretId, String secretKey) {
        this.secretId = secretId;
        this.secretKey = secretKey;
    }
}

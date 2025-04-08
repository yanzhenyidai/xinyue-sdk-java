package cn.xinyue365.common;

import java.io.Serializable;

/**
 * 授权相关
 *
 * @author frank
 * @version 1.0
 * @date 2025-04-07 16:41
 */
public class Credential implements Serializable {

    private String secretId;

    private String secretKey;

    public Credential(String secretId, String secretKey) {
        this.secretId = secretId;
        this.secretKey = secretKey;
    }

    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}

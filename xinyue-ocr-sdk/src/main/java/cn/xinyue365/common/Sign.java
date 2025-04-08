package cn.xinyue365.common;

import cn.xinyue365.common.exception.XinyueSDKException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.TreeMap;


public class Sign {

    private static final Charset UTF8 = StandardCharsets.UTF_8;

    public static String sign(String secretKey, String sigStr, String sigMethod) throws XinyueSDKException {
        String sig = null;
        try {
            Mac mac = Mac.getInstance(sigMethod);
            byte[] hash;
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(UTF8), mac.getAlgorithm());

            mac.init(secretKeySpec);
            hash = mac.doFinal(sigStr.getBytes(UTF8));
            sig = DatatypeConverter.printBase64Binary(hash);
        } catch (Exception e) {
            throw new XinyueSDKException(e.getClass().getName() + "-" + e.getMessage());
        }
        return sig;
    }

    public static String makeSignPlainText(TreeMap<String, String> requestParams, String reqMethod, String host, String path) {

        String retStr = "";
        retStr += reqMethod;
        retStr += host;
        retStr += path;
        retStr += buildParamStr(requestParams, reqMethod);
        return retStr;
    }

    protected static String buildParamStr(TreeMap<String, String> requestParams, String requestMethod) {

        StringBuilder retStr = new StringBuilder();
        for (String key : requestParams.keySet()) {
            String value = requestParams.get(key);
            if (retStr.length() == 0) {
                retStr.append('?');
            } else {
                retStr.append('&');
            }
            retStr.append(key.replace("_", ".")).append('=').append(value);
        }
        return retStr.toString();
    }

    public static String sha256Hex(String s) throws XinyueSDKException {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new XinyueSDKException("SHA-256 is not supported." + e.getMessage());
        }
        byte[] d = md.digest(s.getBytes(UTF8));
        return DatatypeConverter.printHexBinary(d).toLowerCase();
    }

    public static String sha256Hex(byte[] b) throws XinyueSDKException {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new XinyueSDKException("SHA-256 is not supported." + e.getMessage());
        }
        byte[] d = md.digest(b);
        return DatatypeConverter.printHexBinary(d).toLowerCase();
    }

    public static byte[] hmac256(byte[] key, String msg) throws XinyueSDKException {
        Mac mac;
        try {
            mac = Mac.getInstance("HmacSHA256");
        } catch (NoSuchAlgorithmException e) {
            throw new XinyueSDKException("HmacSHA256 is not supported." + e.getMessage());
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, mac.getAlgorithm());
        try {
            mac.init(secretKeySpec);
        } catch (InvalidKeyException e) {
            throw new XinyueSDKException(e.getClass().getName() + "-" + e.getMessage());
        }
        return mac.doFinal(msg.getBytes(UTF8));
    }
}

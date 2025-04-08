package cn.xinyue365.common.exception;

/**
 * @author frank
 * @version 1.0
 * @date 2025-04-08 14:08
 */
public class SDKException extends RuntimeException {

    public SDKException(String message) {
        super(message);
    }

    public SDKException(String message, Throwable cause) {
        super(message, cause);
    }
}

package cn.xinyue365.common.exception;

/**
 * @author frank
 * @version 1.0
 */
public class SDKException extends RuntimeException {

    public SDKException(String message) {
        super(message);
    }

    public SDKException(String message, Throwable cause) {
        super(message, cause);
    }
}

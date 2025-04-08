package cn.xinyue365.common.exception;

/**
 * 通用异常处理
 *
 * @author frank
 * @version 1.0
 * @date 2025-04-08 10:50
 */
public class XinyueSDKException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * UUID of the request, it will be empty if request is not fulfilled.
     */
    private String requestId;

    /**
     * Error code, When API returns a failure, it must have an error code.
     */
    private String errorCode;

    public XinyueSDKException(String message, Throwable cause) {
        super(message, cause);
    }

    public XinyueSDKException(String message) {
        this(message, "");
    }

    public XinyueSDKException(String message, String requestId) {
        this(message, requestId, "");
    }

    public XinyueSDKException(String message, String requestId, String errorCode) {
        super(message);
        this.requestId = requestId;
        this.errorCode = errorCode;
    }

    public String getRequestId() {
        return requestId;
    }

    /**
     * Get error code
     *
     * @return A string represents error code
     */
    public String getErrorCode() {
        return errorCode;
    }

    public String toString() {
        String msg = "[XinyueSDKException]"
            + "code: "
            + this.getErrorCode()
            + " message:"
            + this.getMessage()
            + " requestId:"
            + this.getRequestId();
        if (getCause() != null) {
            msg += " cause:" + getCause().toString();
        }
        return msg;
    }
}

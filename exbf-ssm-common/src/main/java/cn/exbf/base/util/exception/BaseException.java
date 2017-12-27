package cn.exbf.base.util.exception;

import com.sun.xml.internal.ws.api.model.ExceptionType;

/**
 * 描述:
 * 异常父类
 *
 * @author ShenFang
 * @date 2017/12/26 22:07
 */
public class BaseException extends AbstractNestedRuntimeException {

    private static final long serialVersionUID = 4615583694170472296L;
    private int errorCode;
    private String code;
    private String friendlyMessage = "";
    private Object[] messageArgs;
    private String defaultFriendlyMessage;
    private ExceptionType expType;

    public BaseException() {
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String logMsg) {
        super(logMsg);
    }

    public BaseException(String code, Throwable cause) {
        super(cause);
        this.code = code;
    }

    public BaseException(String code, Throwable cause, Object[] messageArgs) {
        super(cause);
        this.code = code;
        if (messageArgs != null) {
            this.messageArgs = messageArgs.clone();
        }
    }

    public BaseException(String code, String logMsg) {
        super(logMsg);
        this.code = code;
    }

    public BaseException(String code, String logMsg, Object[] messageArgs) {
        super(logMsg);
        this.code = code;
        if (messageArgs != null) {
            this.messageArgs = messageArgs.clone();
        }
    }

    public BaseException(String code, String logMsg, Throwable cause) {
        super(logMsg, cause);
        this.code = code;
    }

    public BaseException(String code, String logMsg, Throwable cause, Object[] messageArgs) {
        super(logMsg, cause);
        this.code = code;
        if (messageArgs != null) {
            this.messageArgs = messageArgs.clone();
        }
    }

    public BaseException(String code, Throwable cause, String defaultFriendlyMessage) {
        super(cause);
        this.code = code;
        this.defaultFriendlyMessage = defaultFriendlyMessage;
    }

    public BaseException(String code, Throwable cause, Object[] messageArgs, String defaultFriendlyMessage) {
        super(cause);
        this.code = code;
        if (messageArgs != null) {
            this.messageArgs = messageArgs.clone();
        }
        this.defaultFriendlyMessage = defaultFriendlyMessage;
    }

    public BaseException(String code, String logMsg, String defaultFriendlyMessage) {
        super(logMsg);
        this.code = code;
        this.defaultFriendlyMessage = defaultFriendlyMessage;
    }

    public BaseException(String code, String logMsg, Object[] messageArgs, String defaultFriendlyMessage) {
        super(logMsg);
        this.code = code;
        if (messageArgs != null) {
            this.messageArgs = messageArgs.clone();
        }
        this.defaultFriendlyMessage = defaultFriendlyMessage;
    }

    public BaseException(String code, String logMsg, Throwable cause, String defaultFriendlyMessage) {
        super(logMsg, cause);
        this.code = code;
        this.defaultFriendlyMessage = defaultFriendlyMessage;
    }

    public BaseException(String code, String logMsg, Throwable cause, Object[] messageArgs,
                         String defaultFriendlyMessage) {
        super(logMsg, cause);
        this.code = code;
        if (messageArgs != null) {
            this.messageArgs = messageArgs.clone();
        }
        this.defaultFriendlyMessage = defaultFriendlyMessage;
    }

    public BaseException(String code, Throwable cause, Object[] messageArgs, ExceptionType expType) {
        super(cause);
        this.code = code;
        if (messageArgs != null) {
            this.messageArgs = messageArgs.clone();
        }
        this.expType = expType;
    }

    public String getFriendlyMessage() {
        return this.friendlyMessage;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public void setFriendlyMessage(String friendlyMessage) {
        this.friendlyMessage = friendlyMessage;
    }

    public Object[] getMessageArgs() {
        return this.messageArgs;
    }

    public void setMessageArgs(Object[] messageArgs) {
        if (messageArgs != null) {
            this.messageArgs = messageArgs.clone();
        }
    }

    public String getDefaultFriendlyMessage() {
        return this.defaultFriendlyMessage;
    }

    public void setDefaultFriendlyMessage(String defaultFriendlyMessage) {
        this.defaultFriendlyMessage = defaultFriendlyMessage;
    }

    public ExceptionType getExpType() {
        return this.expType;
    }

    public void setExpType(ExceptionType expType) {
        this.expType = expType;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

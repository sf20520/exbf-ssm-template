package cn.exbf.base.util.exception;

import cn.exbf.base.util.AbstractExbfExceptionUtils;

/**
 * 描述:
 * 运行时抽象类
 *
 * @author ShenFang
 * @date 2017/12/26 22:08
 */
public abstract class AbstractNestedRuntimeException extends RuntimeException {

    private static final long serialVersionUID = 470806785656560169L;

    static {
        AbstractExbfExceptionUtils.class.getName();
    }

    private Throwable cause;

    public AbstractNestedRuntimeException() {
    }

    /**
     * @param msg
     */
    public AbstractNestedRuntimeException(String msg) {
        super(msg);
    }

    public AbstractNestedRuntimeException(Throwable cause) {
        super(cause);
    }

    public AbstractNestedRuntimeException(String msg, Throwable cause) {
        super(msg, cause);
        this.cause = cause;
    }

    /**
     * 描述：
     * 获取异常信息
     *
     * @return java.lang.String
     * @author ShenFang
     * @date 2017/12/26 22:29
     */
    @Override
    public String getMessage() {
        return AbstractExbfExceptionUtils.buildMessage(super.getMessage(), getCause());
    }

    /**
     * 描述：
     * 获取原始异常栈
     *
     * @return java.lang.Throwable
     * @author ShenFang
     * @date 2017/12/26 22:33
     */
    public Throwable getRootCause() {
        Throwable rootCause = null;
        Throwable cause = getCause();
        while (cause != null && cause != rootCause) {
            rootCause = cause;
            cause = cause.getCause();
        }
        return rootCause;
    }

    public Throwable getMostSpecificCause() {
        Throwable rootCause = getRootCause();
        return rootCause != null ? rootCause : this;
    }

    public boolean contains(Class<?> exType){
        if(exType==null){
            return false;
        }
        if (exType.isInstance(this)){
            return true;
        }
        Throwable cause =getCause();
        if (cause==this){
            return false;
        }
        if (cause instanceof BaseException){
            return ((AbstractNestedRuntimeException)cause).contains(exType);
        }else {
            while (cause!=null){
                if (exType.isInstance(cause)){
                    return true;
                }
                if(cause.getCause()==cause){
                    break;
                }
                cause=cause.getCause();
            }
            return false;
        }
    }

}

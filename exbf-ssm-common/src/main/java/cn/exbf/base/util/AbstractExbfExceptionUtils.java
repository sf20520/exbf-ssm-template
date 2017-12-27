package cn.exbf.base.util;

/**
 * 描述:
 * 异常信息工具类
 *
 * @author ShenFang
 * @date 2017/12/26 22:11
 */
public abstract class AbstractExbfExceptionUtils {

    /**
     * 描述：
     *      根据指定信息和异常栈创建完整异常信息
     * @param	message 指定信息
     * @param	cause  异常栈
     * @return  java.lang.String    完整异常信息
     * @author  ShenFang
     * @date    2017/12/26 22:16
     */
    public static String buildMessage(String message, Throwable cause){
        if (cause != null){
            StringBuffer sb =new StringBuffer();
            if (message !=null){
                sb.append(message).append(";");
            }
            sb.append("nested exception is ").append(cause);
            return sb.toString();
        }else {
            return message;
        }
    }
}

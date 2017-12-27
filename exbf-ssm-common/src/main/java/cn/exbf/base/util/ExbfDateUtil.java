package cn.exbf.base.util;

import cn.exbf.base.util.exception.BaseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;
import java.util.Date;

/**
 * 描述:
 * 日期工具类
 *
 * @author ShenFang
 * @date 2017/12/26 17:05
 */
public class ExbfDateUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(ExbfDateUtil.class);

    /**
     * 私有构造方法
     */
    private ExbfDateUtil(){
        super();
    }

    public static Date parseDate(Long millis){
        try {
            Calendar calendar =Calendar.getInstance();
            calendar.setTimeInMillis(millis);
            return calendar.getTime();
        } catch (Exception e) {
            LOGGER.error("时间转换异常"+e.getMessage());
            throw new BaseException("时间转换出错",e);
        }
    }
}

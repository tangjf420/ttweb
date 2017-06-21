package com.tangjf.framework.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * 时间工具类
 * 
 * @version 1.0
 * @author tangjf
 * @date 2017年5月12日 下午11:12:45
 */
public class DateUtil {

    public final static String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";

    public final static String DEFAULT_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    public final static String FORMAT_FULL_SEQ = "yyyyMMddHHmmssSSS";

    public final static String FORMAT_YYYY = "yyyy";

    public final static String FORMAT_YYYYMM = "yyyyMM";

    public final static String FORMAT_YYYYMMDD = "yyyyMMdd";

    public static Date currentDate() {
        return new Date();
    }

    public static DateFormat getFormat(String format) {
        return new SimpleDateFormat(format);
    }

    public static String formatDate(Date date) {
        if (Objects.isNull(date)) {
            return StringUtil.BLANK_STR;
        }
        return getFormat(DEFAULT_DATE_FORMAT).format(date);
    }

    public static String formatTime(Date date) {
        if (Objects.isNull(date)) {
            return StringUtil.BLANK_STR;
        }
        return getFormat(DEFAULT_TIME_FORMAT).format(date);
    }

}

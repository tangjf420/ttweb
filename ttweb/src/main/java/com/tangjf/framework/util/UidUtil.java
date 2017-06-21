package com.tangjf.framework.util;

import java.util.UUID;

/**
 * ID生成工具类
 * 
 * @version 1.0
 * @author tangjf
 * @date 2017年5月15日 下午2:35:52
 */
public class UidUtil {

    /** 空串"" */
    private final static String EMPTY_STR = "";

    /** - hyphen 连字号 */
    private final static String HYPHEN = "-";

    /**
     * 生成32位UUID
     * 
     * @return
     */
    public static String getUUID32() {
        return UUID.randomUUID().toString().replaceAll(HYPHEN, EMPTY_STR);
    }

    public static void main(String[] args) {
        System.out.println(UidUtil.getUUID32());
    }

}

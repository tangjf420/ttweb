package com.tangjf.ttweb.utils;

/**
 * 字符串工具类
 * 
 * @version 1.0
 * @author tangjf
 * @date 2017年4月24日 下午10:14:29
 */
public class StringUtil {

	/** 空字符串"" */
	public final static String EMPTY_STR = "";

	/**
	 * 判断是否为空串（null,""和" " 都返回 true）
	 * 
	 * @param strS
	 * @return
	 */
	public static boolean isBlank(String str) {
		return str == null || str.trim().length() == 0;
	}

	/**
	 * 判断是否为空字符
	 * 
	 * @Title: isNotBlank
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param str
	 * @return
	 */
	public static boolean isNotBlank(String str) {
		return !isBlank(str);
	}
}

package com.tangjf.ttweb.util;

import java.util.Objects;

import javax.servlet.http.Cookie;

import com.tangjf.framework.util.StringUtil;

/**
 * Cook操作工具类
 * 
 * @version:v1.0
 * @author: tangjf
 * @date: 2017年4月26日 下午2:48:34
 */
public class CookieUtil {

    private static final String DEFAULT_DOMAIN = ".tangjunfeng.xin";

    private static final String DEFAULT_PATH = "/";

    /**
     * 根据名称获取Cookie对象
     * 
     * @param name
     * @return
     */
    public static Cookie getCookie(String name) {
        if (StringUtil.isBlank(name)) {
            return null;
        }
        Cookie cookies[] = HttpServletUtil.getCookies();
        if (Objects.isNull(cookies)) {
            return null;
        }
        for (int i = 0; i < cookies.length; i++) {
            if (name.equals(cookies[i].getName())) {
                return cookies[i];
            }
        }

        return null;
    }

    /**
     * 根据名称获取Cookie值
     * 
     * @param name
     * @return
     */
    public static String getCookieValue(String name) {
        Cookie cookie = getCookie(name);
        if (Objects.isNull(cookie)) {
            return null;
        }
        return cookie.getValue();
    }

    /**
     * 删除cookie
     * 
     * @param request
     * @param response
     * @param cookie
     */
    public static void delCookie(Cookie cookie) {
        if (cookie != null) {
            cookie.setPath(DEFAULT_PATH);
            cookie.setValue(StringUtil.BLANK_STR);
            cookie.setMaxAge(0);
            HttpServletUtil.getResponse().addCookie(cookie);
        }
    }

    /**
     * 设置cookie
     * 
     * @param name
     * @param value
     */
    public static void setCookie(String name, String value) {
        setCookie(name, value, 0x278d00);
    }

    /**
     * 设置cookie
     * 
     * @param name
     * @param value
     * @param maxAge
     */
    public static void setCookie(String name, String value, int maxAge) {
        if (StringUtil.isBlank(name) || StringUtil.isBlank(value)) {
            return;
        }
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(maxAge);
        cookie.setPath(DEFAULT_PATH);
        cookie.setDomain(DEFAULT_DOMAIN);
        HttpServletUtil.getResponse().addCookie(cookie);
    }

}
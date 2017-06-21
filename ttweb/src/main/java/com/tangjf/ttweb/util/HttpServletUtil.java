package com.tangjf.ttweb.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class HttpServletUtil {

    /**
     * 获取 ServletRequestAttributes
     * 
     * @return ServletRequestAttributes
     */
    private static ServletRequestAttributes getRequestAttributes() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes());
    }

    /**
     * 获取 HttpServletRequest
     * 
     * @return HttpServletRequest
     */
    public static HttpServletRequest getRequest() {
        return getRequestAttributes().getRequest();
    }

    /**
     * 获取 HttpSession
     * 
     * @return HttpSession
     */
    public static HttpSession getSession() {
        return getRequest().getSession();
    }

    /**
     * 获取 Cookie数组
     * 
     * @return Cookies数组
     */
    public static Cookie[] getCookies() {
        return getRequest().getCookies();
    }

    /**
     * 获取 HttpServletResponse
     * 
     * @return HttpServletResponse
     */
    public static HttpServletResponse getResponse() {
        return getRequestAttributes().getResponse();
    }
}

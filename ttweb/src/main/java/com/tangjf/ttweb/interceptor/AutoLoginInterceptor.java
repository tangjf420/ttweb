package com.tangjf.ttweb.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 自动登录
 * 
 * @version:v1.0
 * @author: tangjf
 * @date: 2017年4月26日 下午2:44:25
 *
 */
public class AutoLoginInterceptor extends HandlerInterceptorAdapter {

    public static final Logger logger = LoggerFactory.getLogger(AutoLoginInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info(request.getServletPath());
        return super.preHandle(request, response, handler);
    }

}

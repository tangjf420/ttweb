package com.tangjf.ttweb.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 判断是否有权限访问
 * 
 * @version:v1.0
 * @author: tangjf
 * @date: 2017年4月26日 上午10:06:16
 *
 */
public class PermissionInterceptor extends HandlerInterceptorAdapter {

	public static final Logger logger = LoggerFactory.getLogger(PermissionInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		logger.info(request.getServletPath());
		return super.preHandle(request, response, handler);
	}

}

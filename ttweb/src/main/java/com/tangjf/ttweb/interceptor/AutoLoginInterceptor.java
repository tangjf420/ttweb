package com.tangjf.ttweb.interceptor;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.alibaba.fastjson.JSON;
import com.tangjf.constant.Constant;
import com.tangjf.framework.result.OperationResult;
import com.tangjf.framework.util.StringUtil;
import com.tangjf.member.dto.Member;
import com.tangjf.member.request.LoginRequest;
import com.tangjf.member.service.IMemberService;
import com.tangjf.ttweb.util.CookieUtil;

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

    @Autowired
    private IMemberService memberService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {
        Member member = (Member) request.getSession().getAttribute(Constant.SESSION_LOGIN_MEMBER);
        if (Objects.isNull(member)) {
            String userName = CookieUtil.getCookieValue(Constant.COOKIE_LOGIN_USER_NAME);
            String password = CookieUtil.getCookieValue(Constant.COOKIE_LOGIN_PASSWORD);
            if (StringUtil.isNotBlank(userName) && StringUtil.isNotBlank(password)) {
                LoginRequest loginRequest = new LoginRequest();
                loginRequest.setUserName(userName);
                loginRequest.setPassword(password);
                OperationResult result = this.memberService.login(loginRequest);
                if (logger.isInfoEnabled()) {
                    logger.info("自动登录->{}", JSON.toJSON(result));
                }
            }
        }
        logger.info(request.getRequestURI());
        return super.preHandle(request, response, handler);
    }

}

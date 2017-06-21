package com.tangjf.ttweb.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tangjf.framework.result.OperationResult;
import com.tangjf.member.request.LoginRequest;
import com.tangjf.member.service.IMemberService;
import com.tangjf.ttweb.base.controller.BaseController;

/**
 * 
 * @version 1.0
 * @author tangjf
 * @date 2017年4月26日 下午4:50:56
 */
@Controller
@RequestMapping("/auth/login")
public class LoginController extends BaseController {

    @Autowired
    private IMemberService memberService;

    /**
     * 迁移到登录页面
     * 
     * @param model
     * @param ref
     * @return
     */
    @RequestMapping(value = "/goLogin", method = {RequestMethod.GET})
    public String goLogin(Model model, String ref) {
        return "auth/login";
    }

    /**
     * 登录
     * 
     * @param userName 用户名
     * @param password 密码
     * @return
     */
    @RequestMapping(value = "/doLogin", method = {RequestMethod.POST})
    @ResponseBody
    public OperationResult doLogin(String userName, String password) {

        LoginRequest request = new LoginRequest();
        request.setUserName(userName);
        request.setPassword(password);
        return this.memberService.login(request);
    }
}

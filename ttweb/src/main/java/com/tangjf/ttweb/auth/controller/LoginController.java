package com.tangjf.ttweb.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tangjf.member.service.IMemberService;
import com.tangjf.ttweb.base.controller.BaseController;
import com.tangjf.ttweb.base.response.BaseResponse;

/**
 * 
 * @version 1.0
 * @author tangjf
 * @date 2017年4月26日 下午4:50:56
 */
@RequestMapping("/auth/login")
@Controller
public class LoginController extends BaseController {

    @Autowired
    private IMemberService memberService;

    @RequestMapping(value = "/goLogin", method = {RequestMethod.GET})
    public String goLogin() {
        return "auth/login";
    }

    @RequestMapping(value = "/doLogin", method = {RequestMethod.POST})
    @ResponseBody
    public BaseResponse doLogin(String userName, String password) {

        BaseResponse response = new BaseResponse();
        boolean result = this.memberService.login(userName, password);
        if (result) {
            response.setSuccess(true);
        } else {
            response.setMsg("登录失败！！！");
        }
        return response;
    }
}

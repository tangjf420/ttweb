package com.tangjf.ttweb.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tangjf.ttweb.base.controller.BaseController;
import com.tangjf.ttweb.base.response.BaseResponse;

@RequestMapping("/auth/login")
@Controller
public class LoginController extends BaseController {

	@RequestMapping(value = "/goLogin", method = { RequestMethod.GET })
	public String goLogin() {
		return "auth/login";
	}

	@RequestMapping(value = "/doLogin", method = { RequestMethod.POST })
	@ResponseBody
	public BaseResponse doLogin(String userName, String passWord) {

		BaseResponse response = new BaseResponse();

		return response;
	}
}

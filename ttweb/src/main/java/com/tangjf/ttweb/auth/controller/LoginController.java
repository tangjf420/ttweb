package com.tangjf.ttweb.auth.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/auth/login")
@Controller
public class LoginController {

	@RequestMapping(value = "/goLogin", method = { RequestMethod.GET })
	public String goLogin() {
		return "auth/login";
	}

	@RequestMapping(value = "/doLogin", method = { RequestMethod.POST })
	@ResponseBody
	public Map<String, Object> doLogin(String userName, String passWord) {

		Map<String, Object> resultMap = new HashMap<>();
		resultMap.put("userName", userName);
		resultMap.put("passWord", passWord);

		return resultMap;
	}
}

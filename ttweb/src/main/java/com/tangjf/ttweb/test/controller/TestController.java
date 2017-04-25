package com.tangjf.ttweb.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/index")
	public String index() {
		return "/test/index";
	}

	@RequestMapping("/freeMark")
	public String freeMark(Model model) {
		model.addAttribute("name", "tangjf");
		return "/test/freeMark";
	}

	@RequestMapping("/error")
	public String error() {
		return "/error/error";
	}

}

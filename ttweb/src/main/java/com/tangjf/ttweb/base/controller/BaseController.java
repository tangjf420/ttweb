package com.tangjf.ttweb.base.controller;

import org.springframework.ui.Model;

import com.tangjf.ttweb.util.StringUtil;

/**
 * Controller基础类
 * 
 * @version 1.0
 * @author tangjf
 * @date 2017年4月24日 下午10:03:42
 */
public class BaseController {

	/**
	 * 返回错误画面
	 * 
	 * @param model
	 * @param msg
	 *            错误信息
	 * @return
	 */
	protected String resultErrorPage(Model model, String msg) {
		if (StringUtil.isNotBlank(msg)) {
			model.addAttribute("msg", msg);
		}
		return "error/error";
	}

}

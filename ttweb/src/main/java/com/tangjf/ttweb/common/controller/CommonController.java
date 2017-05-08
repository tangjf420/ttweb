package com.tangjf.ttweb.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tangjf.ttweb.base.controller.BaseController;

/**
 * 共通处理Controller类
 * 
 * @version 1.0
 * @author tangjf
 * @date 2017年5月3日 下午6:23:46
 */
@Controller
@RequestMapping("/common")
public class CommonController extends BaseController {

    @RequestMapping("/error")
    public String error(Model model, String code, String msg) {
        System.out.println(code);
        System.out.println(msg);
        return "/error/error";
    }
}

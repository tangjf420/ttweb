package com.tangjf.ttweb.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tangjf.ttweb.base.controller.BaseController;

/**
 * 错误处理Controller类
 * 
 * @version 1.0
 * @author tangjf
 * @date 2017年5月3日 下午6:23:46
 */
@Controller
public class ErrorController extends BaseController {

    /**
     * 迁移到错误页面
     * 
     * @param model
     * @param code
     * @param msg
     * @return
     */
    @RequestMapping("/error")
    public String error(Model model, String code, String msg) {
        return super.resultErrorPage(model, msg);
    }
}

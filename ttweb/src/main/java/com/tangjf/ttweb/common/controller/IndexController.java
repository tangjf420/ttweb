package com.tangjf.ttweb.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tangjf.ttweb.base.controller.BaseController;

/**
 * 主页处理Controller类
 * 
 * @version:v1.0
 * @author: tangjf
 * @date: 2017年5月11日 下午2:17:40
 */
@Controller
public class IndexController extends BaseController {

    /**
     * 迁移到主页
     * 
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "/index/index";
    }

    /**
     * 迁移到记账本首页
     * 
     * @return
     */
    @RequestMapping("/tallyIndex")
    public String tallyIndex() {
        return "/index/tallyIndex";
    }

    /**
     * 迁移到会员中心首页
     * 
     * @return
     */
    @RequestMapping("/memberIndex")
    public String memberIndex() {
        return "/index/memberIndex";
    }
}

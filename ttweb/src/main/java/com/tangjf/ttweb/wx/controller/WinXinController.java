package com.tangjf.ttweb.wx.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.tangjf.ttweb.base.controller.BaseController;

/**
 * 微信请求处理Controller
 * 
 * @version 1.0
 * @author tangjf
 * @date 2017年6月19日 下午2:23:29
 */
@Controller
@RequestMapping("/wx")
public class WinXinController extends BaseController {

    /**
     * 微信验证处理
     * 
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "handler", method = RequestMethod.GET)
    @ResponseBody
    public String doGetHandler(HttpServletRequest request, HttpServletResponse response) {

        logger.info(JSON.toJSONString(request.getParameterMap()));
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");

        return echostr;
    }

    /**
     * 微信消息处理
     * 
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "handler", method = RequestMethod.POST)
    @ResponseBody
    public String doPostHandler(HttpServletRequest request, HttpServletResponse response) {
        logger.info(JSON.toJSONString(request.getParameterMap()));

        return "";
    }
}

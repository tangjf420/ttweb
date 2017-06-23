package com.tangjf.ttweb.wx.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tangjf.ttweb.wx.util.MyWebchatHandler;

import io.github.elkan1788.mpsdk4j.mvc.WechatWebSupport;
import io.github.elkan1788.mpsdk4j.vo.MPAccount;

/**
 * 微信请求处理Controller
 * 
 * @version 1.0
 * @author tangjf
 * @date 2017年6月19日 下午2:23:29
 */
@Controller
@RequestMapping("/wx")
public class WeiXinController extends WechatWebSupport {

    protected Logger logger = LoggerFactory.getLogger(WeiXinController.class);

    @Value("${wx.appId}")
    private String appId;

    @Value("${wx.appSecret}")
    private String appSecret;

    @Value("${wx.token}")
    private String token;

    @Value("${wx.aesKey}")
    private String aesKey;

    @Override
    public void init() {
        MPAccount mpAccount = new MPAccount();
        // 修改为实际的公众号信息,可以在开发者栏目中查看
        mpAccount.setAppId(appId);
        mpAccount.setAppSecret(appSecret);
        mpAccount.setToken(token);
        mpAccount.setAESKey(aesKey);
        _wk.setMpAct(mpAccount);
        _wk.setWechatHandler(new MyWebchatHandler());
        super.init();
    }

    /**
     * 与微信服务器互动
     * 
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "interact", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public void interact(HttpServletRequest request, HttpServletResponse response) {
        try {
            super.interact(request, response);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

}

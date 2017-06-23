package com.tangjf.ttweb.wx.util;

import java.util.ArrayList;
import java.util.List;

import io.github.elkan1788.mpsdk4j.core.WechatDefHandler;
import io.github.elkan1788.mpsdk4j.vo.event.BasicEvent;
import io.github.elkan1788.mpsdk4j.vo.message.Article;
import io.github.elkan1788.mpsdk4j.vo.message.BasicMsg;
import io.github.elkan1788.mpsdk4j.vo.message.NewsMsg;
import io.github.elkan1788.mpsdk4j.vo.message.TextMsg;

public class MyWebchatHandler extends WechatDefHandler {

    @Override
    public BasicMsg text(TextMsg msg) {
        List<Article> articles = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            Article article = new Article();
            article.setTitle("title + " + msg.getContent() + i);
            article.setDescription("description + " + msg.getContent() + i);
            article.setPicUrl("https://mp.weixin.qq.com/misc/getheadimg?fakeid=3012000940&token=603519187&lang=zh_CN");
            article.setUrl("http://www.url" + i + ".com");
            articles.add(article);
        }
        NewsMsg newsMsg = new NewsMsg(msg);
        newsMsg.setArticles(articles);
        return newsMsg;
    }

    @Override
    public BasicMsg eSub(BasicEvent event) {
        TextMsg text_msg = new TextMsg(event);
        text_msg.setContent("欢迎关注，亿万大奖兑换码：BDS2D6EUI4C！！！");
        return text_msg;
    }

}

<#-- 公共的页面元素  2017-1-13 

****************************************
			注意写好注释
****************************************
-->

<#--
	公共的顶部logo
	name: 		head
	参数
	cityName:	城市名
-->
<#macro head>
	<div class="member-top-height">
	    <div class="member-top fix">
	        <ul class="member-top-subnav">
	            <li><a href="">首页</a></li>
	            <li><a href="">搭建</a></li>
	            <li><a href="">部落</a></li>
	            <li><a href="">竞赛</a></li>
	        </ul>
	  
		  	<!-- 登录 注册 -->
	        <div class="member-top-right">
	        	<div class="in-top-btnBox" id="head_login_off">
					<a href="javascript:;" class="n-btn ico-lg">登录</a> 
					<a href="javascript:;"	class="n-btn ico-register">注册</a>
				</div>
	        </div>
			<!-- 登录后 -->
	        <div class="hide" id="head_login_success">
	            <div class="member-top-right">
	                <div class="member-msg" id="Unread">
	                    <a id="messageOfDetailTopPage"><img src="/images/xiaoxi.png" id="message"/></a>
	                </div>
	                <a class="member-name" onclick="toUserCenter();">
	                    <i class="avatar"><img src=""/> </i>
	                    <span class="name" onclick="toUserCenter();"></span>
	                </a>
	                <a class="icon-exit" style="margin-right:11px;" target="_blank" href="${skshopDomain}/shopcart/goshopcart">我的购物车</a>
	                <a href="javascript:;" id="loginOff" class="icon-exit">退出</a>
	            </div>
	        </div>
	  
	    </div>
	</div>
</#macro>
<#macro shopcartHead>
	<div class="mz-top-height">
	    <div class="mz-top-fixed">
	        <div class="mz-top">
	            <a href="/" class="logo">司空</a>
	            <span class="extra">购物车</span>
	            <!--<div class="cart-icon"><span class="sum">12</span></div>-->
	        </div>
	    </div>
	</div>
</#macro>


<#--
	公共的底部菜单
	name: 		footer
	参数
	basePath：	项目路径 ${Session.basePath}
	num:    	
	注：把页面的跳转路径补全
-->
<#macro footer>
	<div class="in-footer">
    <div class="footlinks">
        <div class="in-list-width">
            <div class="footlink">
                <h3>友情链接</h3>
                <a href="">万华化学集团</a>
                <a href="">万华生态板业</a>
                <a href="">因格科技</a>
            </div>
        </div>
    </div>
    <div class="footcolumn">
        <div class="in-list-width">
            <div class="pl15 pr15">
                <div class="">
                    <div class="w-all">
                        <ul class="help-ul">
                            <li>
                                <h5>关于司空</h5>
                                <span>司空简介</span>
                                <span>战略合作</span>
                                <span>诚聘英才</span>
                                <span>联系我们</span>
                            </li>
                            <li>
                                <h5>服务保障</h5>
                                <span>全程管家服务</span>
                                <span>免费量房设计</span>
                                <span>本地化上门送装</span>
                                <span>360度用户体验</span>
                                <span>品牌正品保障</span>
                            </li>
                            <li>
                                <h5>支付配送</h5>
                                <span>本地配送</span>
                                <span>支付方式</span>
                                <span>发票说明</span>
                                <span>免息分期</span>
                            </li>
                            <li>
                                <h5>使用帮助</h5>
                                <span>新手指南</span>
                                <span>常见问题</span>
                                <span>装修流程</span>
                            </li>
                        </ul>
                    </div>
                    <div class="contact">
                        <div class="">
                            <span class="mr20 f14 c25262C">联系我们</span><a href="" class="btn-a-1">在线客服</a>
                        </div>
                        <div class="mobile mt15 tc fix">
                            <div class="fl">
                                <img src="/images/mz/BD-100-100.jpg">
                                <p class="mt5">微信订阅</p>
                            </div>
                            <div class="fl ml30">
                                <img src="/images/mz/sk-100-100.jpg">
                                <p class="mt5">BD合作</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="foot-ft">
        <div class="footmenu">
            <span>司空部落</span>
            <span class="ml20">加入我们</span>
            <span class="ml20">会员注册</span>
            <span class="ml20">法律声明</span>
        </div>
        <div class="tc mt20">Copyright © 2016 Skong Technology Co., Ltd. 粤ICP备16044969号-1</div>
    </div>
</div>
</#macro>



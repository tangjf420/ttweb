<#import "../macro/jsCssMacro.ftl" as jsCss/>
<#import "../macro/commonMacro.ftl" as common/>
<html>
<head>
    <@common.meta />
    <title>登录</title>
    <@jsCss.baseJsAndCss />
    <@jsCss.importJs 'js/auth/login.js'/>
</head>
<body>
    <div class="container" id="container">
        <div class="page">
            <div class="page__bd">
                <div class="weui-cells__title">登录</div>
                <div class="weui-cells weui-cells_form">
                    <div class="weui-cell">
                        <div class="weui-cell__bd">
                            <input id="userName" class="weui-input" type="text" placeholder="用户名"/>
                        </div>
                    </div>
                    <div class="weui-cell">
                        <div class="weui-cell__bd">
                            <input id="password" class="weui-input" type="password" placeholder="密码"/>
                        </div>
                    </div>
                </div>
                <div class="weui-btn-area">
                    <a id="doLogin" class="weui-btn weui-btn_primary" href="javascript:" id="showTooltips">登录</a>
                </div>
            </div>
        </div>
    </div>
</body>
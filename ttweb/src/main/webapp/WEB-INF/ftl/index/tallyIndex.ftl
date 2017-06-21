<#import "../macro/jsCssMacro.ftl" as jsCss/>
<#import "../macro/commonMacro.ftl" as common/>
<!DOCTYPE html>
<html>
<head>
    <@common.meta />
    <title>登录</title>
    <@jsCss.baseJsAndCss />
    <@jsCss.importJs 'js/auth/login.js'/>
</head>
<body ontouchstart>
    <div class="container" id="container">
        <div class="page">
            tallyIndex.ftl
        </div>
    </div>
    <@common.footer />
</body>
</html>
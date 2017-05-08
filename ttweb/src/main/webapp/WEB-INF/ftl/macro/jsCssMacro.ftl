
<#-- 版本号，修改js、css后避免缓存请修改 -->
<#assign version='1.0.0'/>
<#assign basePath=request.contextPath/>

<#-- 引入基本的JS和CSS文件  -->
<#macro baseJsAndCss>
    <link rel="stylesheet" href="${basePath!''}/css/weui.css?version=${version}">
    <script type="text/javascript" src="${basePath!''}/js/jquery-1.8.3.min.js?version=${version}"></script>
    <script type="text/javascript" src="${basePath!''}/js/utils.js?version=${version}"></script>
</#macro>

<#-- 引入工具类JS文件 -->
<#macro utilsJs>
    <script type="text/javascript" src="${basePath!''}/js/utils.js?version=${version}"></script>
</#macro>

<#-- 引入自定义JS文件，路径前不要加斜杠 -->
<#macro importJs jsPath>
    <script type="text/javascript" src="${basePath!''}/${jsPath}?version=${version}"></script>
</#macro>

<#-- 引入自定义CSS文件，路径前不要加斜杠 -->
<#macro importCss cssPath>
    <link rel="stylesheet" href="${basePath!''}/${cssPath}?version=${version}">
</#macro>

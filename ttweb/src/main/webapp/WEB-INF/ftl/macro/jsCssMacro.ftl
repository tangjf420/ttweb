
<#-- 版本号，修改js、css后避免缓存请修改 -->
<#assign version='1.0.0'/>
<#assign basePath='${base.contextPath}'/>

<#macro style>
	<link rel="stylesheet" href="${basePath!''}/css/weui.min.css?version=${version}">
</#macro>
<#macro js>
	<script type="text/javascript" src="${basePath!''}/js/jquery-1.8.3.min.js?version=${version}"></script>
</#macro>




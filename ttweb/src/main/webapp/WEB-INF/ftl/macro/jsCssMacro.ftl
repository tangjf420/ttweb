
<#-- 版本号，修改js、css后避免缓存请修改 -->
<#assign version='1.0.0'/>
<#assign basePath=request.contextPath/>

<#macro css>
	<link rel="stylesheet" href="${basePath!''}/css/weui.css?version=${version}">
</#macro>
<#macro js jsFileNames = ''>
	<script type="text/javascript" src="${basePath!''}/js/jquery-1.8.3.min.js?version=${version}"></script>
	<script type="text/javascript" src="${basePath!''}/js/common.js?version=${version}"></script>

	<#list jsFileNames?split(",") as jsFileName>
		<#if jsFileName == 'login'>
			<script type="text/javascript" src="${basePath!''}/js/auth/login.js?version=${version}"></script>
		</#if>
	</#list> 
</#macro>




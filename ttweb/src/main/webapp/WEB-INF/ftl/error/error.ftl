<#import "../macro/jsCssMacro.ftl" as jsCss/>
<#import "../macro/commonMacro.ftl" as common/>
<!DOCTYPE html>
<html>
<head>
	<@common.meta />
	<title>登录</title>
	<@jsCss.baseJsAndCss />
</head>
<body>
	<div class="container" id="container">
		<div class="page msg_warn js_show">
		    <div class="weui-msg">
		        <div class="weui-msg__icon-area"><i class="weui-icon-warn weui-icon_msg"></i></div>
		        <div class="weui-msg__text-area">
		            <h2 class="weui-msg__title">操作失败</h2>
		            <p class="weui-msg__desc">内容详情，可根据实际需要安排，如果换行则不超过规定长度，居中展现<a href="javascript:void(0);">文字链接</a></p>
		        </div>
		        <div class="weui-msg__opr-area">
		            <p class="weui-btn-area">
		                <a href="javascript:history.back();" class="weui-btn weui-btn_primary">返回上级</a>
		                <a href="javascript:history.back();" class="weui-btn weui-btn_default">返回主页</a>
		            </p>
		        </div>
		    </div>
		</div>
	</div>
</body>
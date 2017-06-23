<#import "../macro/jsCssMacro.ftl" as cssAndJs/>
<#import "../macro/commonMacro.ftl" as common/>
<!DOCTYPE html>
<html>
<head>
	<@common.meta />
	<title>TT WEB</title>
	<@cssAndJs.baseJsAndCss />
</head>
<body>
<div class="page tabbar js_show">
    <div class="page__bd" style="height: 100%;">
        <div class="weui-tab">
            <div class="weui-tab__panel">

            </div>
            <div class="weui-tabbar">
                <a href="javascript:;" class="weui-tabbar__item weui-bar__item_on" data-linkurl="tallyIndex">
                    <span style="display: inline-block;position: relative;">
                        <img src="../images/icon_tabbar.png" alt="" class="weui-tabbar__icon">
                    </span>
                    <p class="weui-tabbar__label">记账本</p>
                </a>
                <!--
                <a href="javascript:;" class="weui-tabbar__item">
                    <img src="../images/icon_tabbar.png" alt="" class="weui-tabbar__icon">
                    <p class="weui-tabbar__label">通讯录</p>
                </a>
                <a href="javascript:;" class="weui-tabbar__item">
                    <span style="display: inline-block;position: relative;">
                        <img src="../images/icon_tabbar.png" alt="" class="weui-tabbar__icon">
                        <span class="weui-badge weui-badge_dot" style="position: absolute;top: 0;right: -6px;"></span>
                    </span>
                    <p class="weui-tabbar__label">发现</p>
                </a>
                -->
                <a href="javascript:;" class="weui-tabbar__item" data-linkurl="memberIndex">
                    <img src="../images/icon_tabbar.png" alt="" class="weui-tabbar__icon">
                    <p class="weui-tabbar__label">我</p>
                </a>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    $(function(){
        $('.weui-tabbar__item').on('click', function () {
            $(this).addClass('weui-bar__item_on').siblings('.weui-bar__item_on').removeClass('weui-bar__item_on');
        	$('.weui-tab__panel').load($(this).data('linkurl'));
        });
    });
</script>
</body>
var StringUtil = {

    /** 空白字符 */
    BLANK_STR : '',

    /**
     * 判断字符串是否为空
     * 
     * @param str
     *            字符串
     * @returns true：空，false：不为空
     */
    isBlank : function(str) {
        return !str;
    },
    /**
     * 如果为空返回默认字符
     * 
     * @param str
     *            字符串
     * @param deaultVal
     *            默认字符
     * @returns
     */
    isNullDefaultVal : function(str, deaultVal) {
        if (!StringUtil.isBlank(str)) {
            return str;
        }

        if (StringUtil.isBlank(deaultVal)) {
            return StringUtil.BLANK_STR;
        }

        return deaultVal;
    }
};

var Ajax = {
    /**
     * Ajax POST方式提交
     * 
     * @param url
     *            请求URL
     * @param data
     *            请求参数
     * @param success
     *            请求成功后回调方法（发生错误会统一拦截）
     */
    post : function(url, data, success) {
        $.ajax({
            type : 'POST',
            dataType : 'JSON',
            asyn : false,
            url : url,
            data : data,
            success : function(data) {
                if (true == data.success) {
                    success(data);
                } else {
                    if ('nonLogin' == data.code) {
                        window.location.href = '/auth/login/goLogin';
                    } else {
                        MessageBox.showToptips(data.msg);
                    }
                }
            }
        });
    }
};

var URL = {
    /**
     * 获取URL的参数部分
     * 
     * @returns
     */
    getParamsStr : function() {
        // 获取URL，并用?分割(url + ? + 参数)
        var urlSplit = window.location.href.split("?");
        if (urlSplit.length > 1) {
            return urlSplit[1];
        }
        return StringUtil.BLANK_STR;
    },
    /**
     * 获取参数数组
     * 
     * @returns {Array}
     */
    getParamsArray : function() {
        var paramsArray = new Array();
        // 获取参数部分，并用&分割多个参数（a=1 & b=2）
        var paramsSplit = URL.getParamsStr().split("&");
        for (var i = 0; i < paramsSplit.length; i++) {
            // 使用=分割每个参数，获取name和value
            var paramSplit = paramsSplit[i].split("=");
            paramsArray[paramSplit[0]] = paramSplit[1];
        }
        return paramsArray;
    },
    /**
     * 根据参数名，获取参数值
     * 
     * @param name
     *            参数名
     * @returns
     */
    getParamByName : function(name) {
        return URL.getParamsArray()[name];
    }
}

var MessageBox = {
    /**
     * 以提示的方式显示消息
     * 
     * @param msg
     *            消息内容
     */
    showToptips : function(msg) {

        var $tooltips = $('<div class="weui-toptips weui-toptips_warn js_tooltips" style="display: block;">'
                + msg + '</div>');
        $('body').prepend($tooltips);

        // toptips的fixed, 如果有`animation`, `position: fixed`不生效
        $('.page.cell').removeClass('slideIn');

        // 两秒后移除消息提示
        setTimeout(function() {
            $tooltips.remove();
        }, 2000);
    },
    showToast : function(msg) {

        var $toast = $('<div id="toast" style="opacity: 1; display: none;">'
                + '<div class="weui-mask_transparent"></div>'
                + '<div class="weui-toast">'
                + '<i class="weui-icon-success-no-circle weui-icon_toast"></i>'
                + '<p class="weui-toast__content">' + msg + '</p>' + '</div>'
                + '</div>');
        $('body').append($toast);

        $toast.fadeIn(100);
        // 两秒后移除消息提示
        setTimeout(function() {
            $toast.fadeOut(100);
            $toast.remove();
        }, 2000);
    }

};
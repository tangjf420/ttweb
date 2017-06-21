$(function() {
    $('#doLogin').on('click', function() {
        var userName = $('#userName').val();
        var password = $('#password').val();
        if (StringUtil.isBlank(userName)) {
            MessageBox.showToptips('用户名不能为空');
            return false;
        }
        if (StringUtil.isBlank(password)) {
            MessageBox.showToptips('密码不能为空');
            return false;
        }

        Ajax.post('/auth/login/doLogin', {
            userName : userName,
            password : password
        }, function(data) {
            MessageBox.showToast('登录成功');
            var ref = URL.getParamByName('ref');
            window.location.href=StringUtil.isNullDefaultVal(ref, "/");
        })
    });
})

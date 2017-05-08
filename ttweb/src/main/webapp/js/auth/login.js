$(function() {
    $('#doLogin').on('click', function() {
        var userName = $('#userName').val();
        var password = $('#password').val();
        if (StringUtil.isBlank(userName)) {
            alert('用户名不能为空！');
            return false;
        }
        if (StringUtil.isBlank(password)) {
            alert('密码不能为空！');
            return false;
        }

        $.ajax({
            type : 'POST',
            dataType : 'JSON',
            asyn : false,
            url : '/auth/login/doLogin',
            data : {
                userName : userName,
                password : password
            },
            success : function(data) {
                alert(data);
            }
        })
    });
})

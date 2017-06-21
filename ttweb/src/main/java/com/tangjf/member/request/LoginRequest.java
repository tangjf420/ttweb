package com.tangjf.member.request;

import java.io.Serializable;

/**
 * 登录请求参数对象
 * 
 * @version:v1.0
 * @author: tangjf
 * @date: 2017年5月10日 下午7:29:18
 */
public class LoginRequest implements Serializable {

    private static final long serialVersionUID = 5978042585592338222L;

    /** 用户名 */
    private String userName;

    /** 密码 */
    private String password;

    /**
     * 获取 用户名
     * 
     * @return 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设定 用户名
     * 
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取 密码
     * 
     * @return 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设定 密码
     * 
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

}

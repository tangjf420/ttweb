package com.tangjf.framework.enums;

/**
 * 操作返回枚举类
 * 
 * @version:v1.0
 * @author: tangjf
 * @date: 2017年5月11日 下午6:22:11
 */
public enum EnumResultCode {

    /** "00000", "OK" */
    SUCCESS("00000", "OK"),

    /** "10000", "系统错误" */
    ERROR("10000", "系统错误"),
    /** "10001", "参数错误" */
    ERROR_PARAM("10001", "参数错误"),
    /** "10002", "业务错误" */
    ERROR_BUSINESS("10002", "业务错误"),
    /** "10003", "验证码错误" */
    ERROR_SECURITY_CODE("10003", "验证码错误"),

    /** "20000", "请登录" */
    LOGIN_AGAIN("20000", "请登录"),
    /** "20001", "用户不存在" */
    LOGIN_USER_NON_EXIST("20001", "用户不存在"),
    /** "20002", "用户已被禁用" */
    LOGIN_USER_DISABLE("20002", "用户已被禁用"),
    /** "20003", "该用户没有权限登录" */
    LOGIN_USER_NON_PERMISSION("20003", "该用户没有权限登录"),
    /** "20004", "密码错误" */
    LOGIN_PASSWORD_ERROR("20004", "密码错误"),

    /** "30000", "没有权限进行这个操作" */
    OPERATION_NON_PERMISSION("30000", "没有权限进行这个操作"),
    /** "30001", "禁止重复提交" */
    OPERATION_REPETITION("30001", "禁止重复提交"),
    /** "30002", "您的操作过于频繁，请稍后再试" */
    OPERATION_FREQUENTLY("30002", "您的操作过于频繁，请稍后再试"),

    /** "40000", "包含XSS攻击的字符" */
    ATTACK_XSS("40000", "包含XSS攻击的字符"),
    /** "40001", "请不要尝试注入" */
    ATTACK_SQL("40001", "请不要尝试注入");

    /** 错误编码 */
    private String code;

    /** 错误信息 */
    private String msg;

    EnumResultCode(
        String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 获取 错误编码
     * 
     * @return 错误编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 获取 错误信息
     * 
     * @return 错误信息
     */
    public String getMsg() {
        return msg;
    }
}

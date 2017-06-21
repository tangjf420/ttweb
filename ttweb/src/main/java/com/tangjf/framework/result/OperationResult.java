package com.tangjf.framework.result;

import java.io.Serializable;

import com.tangjf.framework.enums.EnumResultCode;

/**
 * 操作结果返回公共对象
 * 
 * @version 1.0
 * @author tangjf
 * @date 2017年5月9日 上午11:21:49
 */
public class OperationResult implements Serializable {

    private static final long serialVersionUID = -7659654422163799734L;

    /** 操作结果 */
    private boolean success;

    /** code */
    private String code;

    /** 错误信息 */
    private String msg;

    public OperationResult() {
    }

    public OperationResult(
        boolean success, String code, String msg) {
        this.success = success;
        this.code = code;
        this.msg = msg;

    }

    protected void set(EnumResultCode resultCode) {
        this.set(EnumResultCode.SUCCESS.equals(resultCode), resultCode.getCode(), resultCode.getMsg());
    }

    protected void set(boolean success, String code, String msg) {
        this.success = success;
        this.code = code;
        this.msg = msg;

    }

    /**
     * 成功
     */
    public OperationResult success() {
        this.set(EnumResultCode.SUCCESS);
        return this;
    }

    /**
     * 错误
     * 
     * @param resultCode 错误编码枚举类
     */
    public OperationResult error(EnumResultCode resultCode) {
        this.set(resultCode);
        return this;
    }

    /**
     * 错误
     * 
     * @param resultCode 错误编码枚举类
     */
    public OperationResult error(String msg) {
        this.set(false, EnumResultCode.ERROR_BUSINESS.getCode(), msg);
        return this;
    }

    /**
     * 异常
     * 
     * @return
     */
    public OperationResult exception() {
        this.set(EnumResultCode.ERROR);
        return this;
    }

    /**
     * 获取 操作结果
     * 
     * @return 操作结果
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * 获取 code
     * 
     * @return code
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

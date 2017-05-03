package com.tangjf.ttweb.base.response;

import java.io.Serializable;

public class BaseResponse implements Serializable {

    private static final long serialVersionUID = -4405852880612183574L;

    /** 操作结果 */
    private boolean success;
    /** code */
    private String code;
    /** 错误信息 */
    private String msg;

    /**
     * 获取 操作结果
     * 
     * @return 操作结果
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * 设定 操作结果
     * 
     * @param success
     *            操作结果
     */
    public void setSuccess(boolean success) {
        this.success = success;
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
     * 设定 code
     * 
     * @param code
     *            code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取 错误信息
     * 
     * @return 错误信息
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设定 错误信息
     * 
     * @param msg
     *            错误信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

}

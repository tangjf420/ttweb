package com.tangjf.member.enums;

/**
 * 会员状态枚举类
 * 
 * @version:v1.0
 * @author: tangjf
 * @date: 2017年5月11日 下午4:00:54
 */
public enum EnumMemberStatus {

    /** "01", "禁用" */
    DISABLE("01", "禁用"),
    /** "02", "启用" */
    NORMAL("02", "启用");

    /** 编码 */
    private String code;

    /** 名称 */
    private String name;

    EnumMemberStatus(
        String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 获取 编码
     * 
     * @return 编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 获取 名称
     * 
     * @return 名称
     */
    public String getName() {
        return name;
    }
}

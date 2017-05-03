package com.tangjf.tally.dto;

import java.io.Serializable;
import java.util.Date;

public class TallyType implements Serializable {
    /** 类型主键 */
    private String typeId;

    /** 名称 */
    private String nickName;

    /** 图标 */
    private String icon;

    /** 收支类型（01 收入，02 支出） */
    private String fundType;

    /** 是否系统定义（0 自定义，1 系统定义 不可以删除修改） */
    private String ifSys;

    /** 自定义类型 会员ID */
    private String memberId;

    /** 显示顺序 */
    private Integer sortNum;

    /** 创建时间 */
    private Date createTime;

    /** 创建人 */
    private String creater;

    /** 修改时间 */
    private Date modifyTime;

    /** 修改人 */
    private String modifier;

    /** 是否删除（1 已删除，0 未删除） */
    private String ifDel;

    private static final long serialVersionUID = 1L;

    /**
     * 获取 类型主键
     * 
     * @return 类型主键
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * 设定 类型主键
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取 名称
     * 
     * @return 名称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设定 名称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取 图标
     * 
     * @return 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设定 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * 获取 收支类型（01 收入，02 支出）
     * 
     * @return 收支类型（01 收入，02 支出）
     */
    public String getFundType() {
        return fundType;
    }

    /**
     * 设定 收支类型（01 收入，02 支出）
     */
    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    /**
     * 获取 是否系统定义（0 自定义，1 系统定义 不可以删除修改）
     * 
     * @return 是否系统定义（0 自定义，1 系统定义 不可以删除修改）
     */
    public String getIfSys() {
        return ifSys;
    }

    /**
     * 设定 是否系统定义（0 自定义，1 系统定义 不可以删除修改）
     */
    public void setIfSys(String ifSys) {
        this.ifSys = ifSys;
    }

    /**
     * 获取 自定义类型 会员ID
     * 
     * @return 自定义类型 会员ID
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * 设定 自定义类型 会员ID
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * 获取 显示顺序
     * 
     * @return 显示顺序
     */
    public Integer getSortNum() {
        return sortNum;
    }

    /**
     * 设定 显示顺序
     */
    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    /**
     * 获取 创建时间
     * 
     * @return 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设定 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 创建人
     * 
     * @return 创建人
     */
    public String getCreater() {
        return creater;
    }

    /**
     * 设定 创建人
     */
    public void setCreater(String creater) {
        this.creater = creater;
    }

    /**
     * 获取 修改时间
     * 
     * @return 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设定 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取 修改人
     * 
     * @return 修改人
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 设定 修改人
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    /**
     * 获取 是否删除（1 已删除，0 未删除）
     * 
     * @return 是否删除（1 已删除，0 未删除）
     */
    public String getIfDel() {
        return ifDel;
    }

    /**
     * 设定 是否删除（1 已删除，0 未删除）
     */
    public void setIfDel(String ifDel) {
        this.ifDel = ifDel;
    }
}
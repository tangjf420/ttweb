package com.tangjf.sys.dto;

import java.io.Serializable;
import java.util.Date;

public class SysConfig implements Serializable {
    /** 配置主键 */
    private String configId;

    /** 配置标识 */
    private String configLabel;

    /** 配置值 */
    private String configValue;

    /** 配置说明 */
    private String remark;

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
     * 获取 配置主键
     * 
     * @return 配置主键
     */
    public String getConfigId() {
        return configId;
    }

    /**
     * 设定 配置主键
     */
    public void setConfigId(String configId) {
        this.configId = configId;
    }

    /**
     * 获取 配置标识
     * 
     * @return 配置标识
     */
    public String getConfigLabel() {
        return configLabel;
    }

    /**
     * 设定 配置标识
     */
    public void setConfigLabel(String configLabel) {
        this.configLabel = configLabel;
    }

    /**
     * 获取 配置值
     * 
     * @return 配置值
     */
    public String getConfigValue() {
        return configValue;
    }

    /**
     * 设定 配置值
     */
    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    /**
     * 获取 配置说明
     * 
     * @return 配置说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设定 配置说明
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
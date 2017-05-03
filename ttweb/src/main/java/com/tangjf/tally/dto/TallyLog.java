package com.tangjf.tally.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TallyLog implements Serializable {
    /** 流水主键 */
    private String logId;

    /** 流水日期 */
    private Date logTime;

    /** 收支类型（01 收入，02 支出） */
    private String fundType;

    /** 类型ID */
    private String typeId;

    /** 金额 */
    private BigDecimal amount;

    /** 备注 */
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
     * 获取 流水主键
     * 
     * @return 流水主键
     */
    public String getLogId() {
        return logId;
    }

    /**
     * 设定 流水主键
     */
    public void setLogId(String logId) {
        this.logId = logId;
    }

    /**
     * 获取 流水日期
     * 
     * @return 流水日期
     */
    public Date getLogTime() {
        return logTime;
    }

    /**
     * 设定 流水日期
     */
    public void setLogTime(Date logTime) {
        this.logTime = logTime;
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
     * 获取 类型ID
     * 
     * @return 类型ID
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * 设定 类型ID
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取 金额
     * 
     * @return 金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设定 金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取 备注
     * 
     * @return 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设定 备注
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
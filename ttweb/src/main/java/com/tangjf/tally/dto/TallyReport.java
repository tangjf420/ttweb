package com.tangjf.tally.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TallyReport implements Serializable {
    /** 报表主键 */
    private String reportId;

    /** 报表类型（01日报，02周报，03月报） */
    private String reportType;

    /** 年 */
    private String calendarY;

    /** 月 */
    private String calendarM;

    /** 周 */
    private String calendarW;

    /** 日期 */
    private Date dateStart;

    /** 日期结束 */
    private Date dateEnd;

    /** 收入金额 */
    private BigDecimal inAmount;

    /** 支出金额 */
    private BigDecimal outAmount;

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
     * 获取 报表主键
     * 
     * @return 报表主键
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * 设定 报表主键
     */
    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    /**
     * 获取 报表类型（01日报，02周报，03月报）
     * 
     * @return 报表类型（01日报，02周报，03月报）
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * 设定 报表类型（01日报，02周报，03月报）
     */
    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    /**
     * 获取 年
     * 
     * @return 年
     */
    public String getCalendarY() {
        return calendarY;
    }

    /**
     * 设定 年
     */
    public void setCalendarY(String calendarY) {
        this.calendarY = calendarY;
    }

    /**
     * 获取 月
     * 
     * @return 月
     */
    public String getCalendarM() {
        return calendarM;
    }

    /**
     * 设定 月
     */
    public void setCalendarM(String calendarM) {
        this.calendarM = calendarM;
    }

    /**
     * 获取 周
     * 
     * @return 周
     */
    public String getCalendarW() {
        return calendarW;
    }

    /**
     * 设定 周
     */
    public void setCalendarW(String calendarW) {
        this.calendarW = calendarW;
    }

    /**
     * 获取 日期
     * 
     * @return 日期
     */
    public Date getDateStart() {
        return dateStart;
    }

    /**
     * 设定 日期
     */
    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    /**
     * 获取 日期结束
     * 
     * @return 日期结束
     */
    public Date getDateEnd() {
        return dateEnd;
    }

    /**
     * 设定 日期结束
     */
    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    /**
     * 获取 收入金额
     * 
     * @return 收入金额
     */
    public BigDecimal getInAmount() {
        return inAmount;
    }

    /**
     * 设定 收入金额
     */
    public void setInAmount(BigDecimal inAmount) {
        this.inAmount = inAmount;
    }

    /**
     * 获取 支出金额
     * 
     * @return 支出金额
     */
    public BigDecimal getOutAmount() {
        return outAmount;
    }

    /**
     * 设定 支出金额
     */
    public void setOutAmount(BigDecimal outAmount) {
        this.outAmount = outAmount;
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
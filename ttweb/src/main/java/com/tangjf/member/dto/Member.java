package com.tangjf.member.dto;

import java.io.Serializable;
import java.util.Date;

public class Member implements Serializable {
    /** 会员主键 */
    private String memberId;

    /** 昵称 */
    private String nickname;

    /** 01 普通用户，02 管理员 */
    private String memberType;

    /** 登录名称 */
    private String userName;

    /** 密码 */
    private String password;

    /** 邮箱 */
    private String email;

    /** 邮箱是否认证（0-否，1-是） */
    private String ifAuthEmail;

    /** 手机号 */
    private String cellphone;

    /** 手机号是否认证（0-否，1-是） */
    private String ifAuthPhone;

    /** 头像 */
    private String avatar;

    /** 性别 */
    private String gender;

    /** 注册时间 */
    private Date registerTime;

    /** 上次登录时间 */
    private Date lastLoginTime;

    /** 状态（01-禁用，02-启用） */
    private String status;

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
     * 获取 会员主键
     * 
     * @return 会员主键
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * 设定 会员主键
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    /**
     * 获取 昵称
     * 
     * @return 昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 设定 昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 获取 01 普通用户，02 管理员
     * 
     * @return 01 普通用户，02 管理员
     */
    public String getMemberType() {
        return memberType;
    }

    /**
     * 设定 01 普通用户，02 管理员
     */
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    /**
     * 获取 登录名称
     * 
     * @return 登录名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设定 登录名称
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
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取 邮箱
     * 
     * @return 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设定 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取 邮箱是否认证（0-否，1-是）
     * 
     * @return 邮箱是否认证（0-否，1-是）
     */
    public String getIfAuthEmail() {
        return ifAuthEmail;
    }

    /**
     * 设定 邮箱是否认证（0-否，1-是）
     */
    public void setIfAuthEmail(String ifAuthEmail) {
        this.ifAuthEmail = ifAuthEmail;
    }

    /**
     * 获取 手机号
     * 
     * @return 手机号
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * 设定 手机号
     */
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    /**
     * 获取 手机号是否认证（0-否，1-是）
     * 
     * @return 手机号是否认证（0-否，1-是）
     */
    public String getIfAuthPhone() {
        return ifAuthPhone;
    }

    /**
     * 设定 手机号是否认证（0-否，1-是）
     */
    public void setIfAuthPhone(String ifAuthPhone) {
        this.ifAuthPhone = ifAuthPhone;
    }

    /**
     * 获取 头像
     * 
     * @return 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设定 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取 性别
     * 
     * @return 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设定 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取 注册时间
     * 
     * @return 注册时间
     */
    public Date getRegisterTime() {
        return registerTime;
    }

    /**
     * 设定 注册时间
     */
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * 获取 上次登录时间
     * 
     * @return 上次登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设定 上次登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取 状态（01-禁用，02-启用）
     * 
     * @return 状态（01-禁用，02-启用）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设定 状态（01-禁用，02-启用）
     */
    public void setStatus(String status) {
        this.status = status;
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
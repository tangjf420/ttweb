package com.tangjf.member.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tangjf.constant.Constant;
import com.tangjf.framework.enums.EnumResultCode;
import com.tangjf.framework.result.OperationResult;
import com.tangjf.framework.service.BaseService;
import com.tangjf.framework.util.DateUtil;
import com.tangjf.member.dao.MemberMapper;
import com.tangjf.member.dto.Member;
import com.tangjf.member.enums.EnumMemberStatus;
import com.tangjf.member.request.LoginRequest;
import com.tangjf.member.service.IMemberService;
import com.tangjf.ttweb.util.CookieUtil;
import com.tangjf.ttweb.util.HttpServletUtil;

/**
 * 会员管理实现类
 * 
 * @version 1.0
 * @author tangjf
 * @date 2017年5月3日 下午3:54:12
 */
@Service
public class MemberServiceImpl extends BaseService implements IMemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public OperationResult login(LoginRequest request) {

        OperationResult result = new OperationResult();
        // 获取用户信息
        Member query = new Member();
        query.setUserName(request.getUserName());
        query.setIfDel(Constant.CODE_NO);
        List<Member> members = this.memberMapper.queryList(query);
        // 校验用户是否存在
        if (members == null || members.isEmpty()) {
            return result.error(EnumResultCode.LOGIN_USER_NON_EXIST);
        }
        Member member = members.get(0);
        // 校验是否被禁用
        if (!EnumMemberStatus.NORMAL.getCode().equals(member.getStatus())) {
            return result.error(EnumResultCode.LOGIN_USER_DISABLE);
        }
        // 校验密码
        if (!member.getPassword().equals(request.getPassword())) {
            return result.error(EnumResultCode.LOGIN_PASSWORD_ERROR);
        }

        // 更会员的最后一次登录时间
        Member updMember = new Member();
        updMember.setMemberId(member.getMemberId());
        updMember.setLastLoginTime(DateUtil.currentDate());
        this.memberMapper.update(updMember);

        // 将登录会员信息写入Session
        HttpServletUtil.getSession().setAttribute(Constant.SESSION_LOGIN_MEMBER, member);
        // 将登录用户名密码写入Cookie
        CookieUtil.setCookie(Constant.COOKIE_LOGIN_USER_NAME, request.getUserName());
        CookieUtil.setCookie(Constant.COOKIE_LOGIN_PASSWORD, request.getPassword());

        return result.success();
    }

}

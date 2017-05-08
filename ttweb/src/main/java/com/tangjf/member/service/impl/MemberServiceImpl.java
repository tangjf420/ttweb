package com.tangjf.member.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tangjf.base.service.BaseService;
import com.tangjf.member.dao.MemberMapper;
import com.tangjf.member.dto.Member;
import com.tangjf.member.service.IMemberService;

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
    public boolean login(String userName, String password) {
        this.logger.info("userName:{},password:{}", userName, password);
        Member query = new Member();
        query.setUserName(userName);
        query.setPassword(password);
        List<Member> members = this.memberMapper.queryList(query);
        return members != null && !members.isEmpty();
    }

}

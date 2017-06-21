package com.tangjf.member.service;

import com.tangjf.framework.result.OperationResult;
import com.tangjf.member.request.LoginRequest;

/**
 * 会员管理接口类
 * 
 * @version 1.0
 * @author tangjf
 * @date 2017年5月3日 下午3:53:56
 */
public interface IMemberService {

    /**
     * 登录
     * 
     * @param request
     * @return
     */
    OperationResult login(LoginRequest request);

}

package com.study.service;

import com.study.domain.entity.UserInfo;
import com.study.domain.model.userinfo.UserLoginInputBean;
import com.study.domain.model.userinfo.UserLoginResultBean;

/**
 * UserInfoService
 *
 * @author sunyueqiao
 * @date 2018/9/9 20:18
 */
public interface UserInfoService {
    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    UserInfo getUserInfo(long userId);

    /**
     * 获取用户信息
     * @param userName
     * @return
     */
    UserInfo getUserInfo(String userName);

    /**
     * 用户登录
     * @param inputBean
     * @return
     */
    UserLoginResultBean userLogin(UserLoginInputBean inputBean);
}

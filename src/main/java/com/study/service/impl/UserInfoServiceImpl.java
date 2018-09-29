package com.study.service.impl;

import com.study.domain.entity.UserInfo;
import com.study.domain.entity.UserInfoExample;
import com.study.domain.model.userinfo.UserLoginInputBean;
import com.study.domain.model.userinfo.UserLoginResultBean;
import com.study.repository.UserInfoMapper;
import com.study.service.UserInfoService;
import com.study.utils.character.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserInfoServiceImpl
 *
 * @author sunyueqiao
 * @date 2018/9/9 20:18
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public UserInfo getUserInfo(long userId) {
        return this.userInfoMapper.selectByPrimaryKey(userId);
    }

    /**
     * 获取用户信息
     *
     * @param userName
     * @return
     */
    public UserInfo getUserInfo(String userName) {
        UserInfo userInfo;
        if (StringUtils.stringIsMobile(userName)) {
            userInfo = this.getUserByMobile(userName);
        } else if (StringUtils.stringIsEmail(userName)) {
            userInfo = this.getUserByEmail(userName);
        } else {
            userInfo = this.getUserByUserName(userName);
        }
        return userInfo;
    }

    /**
     * 用户登录
     *
     * @param inputBean
     * @return
     */
    public UserLoginResultBean userLogin(UserLoginInputBean inputBean) {
        UserLoginResultBean userLoginResultBean = new UserLoginResultBean();
        UserInfo userInfo = this.getUserInfo(inputBean.getUserName());
        if (null == userInfo || userInfo.getUserId() < 1) {
            userLoginResultBean.setSuccess(false);
            userLoginResultBean.setMessage("用户不存在");
            return userLoginResultBean;
        }

        if (inputBean.getPassWord().equals(inputBean.getPassWord())) {
            userLoginResultBean.setSuccess(true);
        } else {
            userLoginResultBean.setSuccess(false);
            userLoginResultBean.setMessage("密码错误");
        }
        return userLoginResultBean;
    }

    private UserInfo getUserByMobile(String mobile) {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andMobileEqualTo(mobile);
        List<UserInfo> list = this.userInfoMapper.selectByExample(userInfoExample);
        return this.findUserInfoFirst(list);
    }

    private UserInfo getUserByUserName(String userName) {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andUserNameEqualTo(userName);
        List<UserInfo> list = this.userInfoMapper.selectByExample(userInfoExample);
        return findUserInfoFirst(list);
    }

    private UserInfo getUserByEmail(String email) {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andEmailEqualTo(email);
        List<UserInfo> list = this.userInfoMapper.selectByExample(userInfoExample);
        return findUserInfoFirst(list);
    }

    private UserInfo findUserInfoFirst(List<UserInfo> list) {
        if (list.size() < 1) {
            return null;
        }

        return list.get(0);
    }
}

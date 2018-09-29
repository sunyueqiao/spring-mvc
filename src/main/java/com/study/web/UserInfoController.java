package com.study.web;

import com.study.domain.entity.UserInfo;
import com.study.domain.model.ResponseResult;
import com.study.domain.model.userinfo.UserLoginResultBean;
import com.study.service.UserInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author sunyueqiao
 * @date 2018/9/29
 */
@Controller
@RequestMapping("/user")
public class UserInfoController extends BaseController {
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseResult<UserLoginResultBean> userLogin(@RequestBody UserInfo userInfo) {
        UserLoginResultBean resultBean = new UserLoginResultBean();
        ResponseResult<UserLoginResultBean> result = super.createError(resultBean);
        if (null == userInfo || StringUtils.isEmpty(userInfo.getUserName()) ||
                StringUtils.isEmpty(userInfo.getUserPassword())) {
            result.setMessage("账号密码不能为空");
            return result;
        }


        return result;
    }
}

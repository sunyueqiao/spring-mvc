package com.study.web;

import com.study.domain.entity.UserInfo;
import com.study.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * DefaultController
 *
 * @author sunyueqiao
 * @date 2018/7/6 10:01
 */
@Controller
@RequestMapping("/default")
public class DefaultController {
    /**
     *
     */
    private final static Logger LOGGER = LoggerFactory.getLogger(DefaultController.class);
    /**
     *
     */
    @Autowired
    public UserInfoService userInfoService;
    @Resource
    public Environment standardEnvironment;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index() {
        String name = "default/index";
        LOGGER.info("hello world! logback");
        LOGGER.info(this.standardEnvironment.getActiveProfiles()[0]);
        ModelAndView model = new ModelAndView(name);
        UserInfo userInfo = this.userInfoService.getUserInfo(1);
        if (userInfo != null) {
            model.addObject("msg", "hello world! by spring mvc");
            model.addObject("userCount", userInfo.getUserName());
        }

        return model;
    }
}

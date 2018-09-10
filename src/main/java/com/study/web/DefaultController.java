package com.study.web;

import com.study.service.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * DefaultController
 *
 * @author sunyueqiao
 * @date 2018/7/6 10:01
 */
@Controller
@RequestMapping("/default")
public class DefaultController {
    private Logger logger = LoggerFactory.getLogger(DefaultController.class);
    @Autowired
    public UserInfo userInfo;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index() {
        String name = "default/index";
        logger.info("hello world! logback");
        ModelAndView model = new ModelAndView(name);
        model.addObject("msg", "hello world! by spring mvc");
        model.addObject("userCount", this.userInfo.count());
        return model;
    }
}

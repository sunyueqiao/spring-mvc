package com.study.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        String name="";
        logger.info("hello world! logback");
        model.addAttribute("msg", "hello world! by spring mvc");
        return "default/index";
    }
}

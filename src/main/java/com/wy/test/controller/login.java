package com.wy.test.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wenyang
 * @description TODO
 * @since 2019/12/30 23:30
 */
//@Api(tags = "登录测试")
//@Controller
//public class login {
//
//    @RequestMapping("/wy")
//    public String login() {
//        return "/login";
//    }
//
//
//
//}
    @Controller
    @RequestMapping("/")
    public class login {

      public ModelAndView index() {
        return new ModelAndView("login");
    }

}

package com.wy.test.controller;

import com.wy.test.entity.SysUser;
import com.wy.test.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    SysUserService sysUserService;

    //默认到登录页面
    public ModelAndView defultLogin() {
        return new ModelAndView("login");
    }

    //注册界面
    @RequestMapping("/register")//注册
    public String register() {
        return "register";
    }

    //登录页面
    @RequestMapping("login")
    public String login(){
        return "login";
    }

    //进入主界面
    @RequestMapping("index")
    public String index(){
        return "index";
    }


    @RequestMapping(value = "/userlogin", method = RequestMethod.POST)//登录获取用户信息存到seccion
    public String  login(@RequestBody SysUser sysUser, HttpServletRequest request){

        System.out.println("我进来了");
        SysUser user = sysUserService.getUser(sysUser);
        if (user == null){
            return  "public/false";
        }
        HttpSession session =  request.getSession();
        session.setAttribute("username",sysUser.getUsername());
        session.setAttribute("password",sysUser.getPassword());
        return "index";
    }




/**
* @author wenyang
* @description TODO
* @since 2019/12/30 23:30
*/
//@Api(tags = "登录测试")
//@Controller
//public class LoginController {
//
//    @RequestMapping("/wy")
//    public String LoginController() {
//        return "/LoginController";
//    }
//}

}

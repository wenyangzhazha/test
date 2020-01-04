package com.wy.test.controller;

import com.wy.test.entity.SysUser;
import com.wy.test.util.ShiroUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description 用户登录
 * @Author Sans
 * @CreateTime 2019/6/17 15:21
 */
@RestController
@RequestMapping("/user")
@Api(tags = "登录测试")
@Controller
public class UserLoginController {

//    /**
//     * 登录
//     * @Author Sans
//     * @CreateTime 2019/6/20 9:21
//     */
//    @PostMapping(value = "/LoginController")
//    @ApiOperation(value="用户登录")
//    public String LoginController(){  //@RequestBody SysUser SysUser
//        Map<String,Object> map = new HashMap<>();
//        //进行身份验证
//        try{
//            //验证身份和登陆
//            Subject subject = SecurityUtils.getSubject();
////            UsernamePasswordToken token = new UsernamePasswordToken(SysUser.getUsername(), SysUser.getPassword());
//            //进行登录操作
////            subject.LoginController(token);
//        }catch (IncorrectCredentialsException e) {
//            map.put("code",500);
//            map.put("msg","用户不存在或者密码错误");
////            return map;
//        } catch (LockedAccountException e) {
//            map.put("code",500);
//            map.put("msg","登录失败，该用户已被冻结");
////            return map;
//        } catch (AuthenticationException e) {
//            map.put("code",500);
//            map.put("msg","该用户不存在");
////            return map;
//        } catch (Exception e) {
//            map.put("code",500);
//            map.put("msg","未知异常");
////            return map;
//        }
//        System.out.println("11111111111111111111");
//        map.put("code",0);
//        map.put("msg","登录成功");
//        map.put("token", ShiroUtils.getSession().getId().toString());
//        return "LoginController";
//    }
//    /**
//     * 未登录
//     * @Author Sans
//     * @CreateTime 2019/6/20 9:22
//     */
//    @PostMapping("/unauth")
//    public Map<String,Object> unauth(){
//        Map<String,Object> map = new HashMap<>();
//        map.put("code",500);
//        map.put("msg","未登录");
//        return map;
//    }


//    @RequestMapping("/wy")
//    public String LoginController() {
//        return "/login2";
//    }

}
package org.yang.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yang.main.service.LoginService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @Resource
    private LoginService loginServiceImpl;
    @RequestMapping("login")
    public String login(String examNumber,String password ){

        return null;
    }
    @RequestMapping("adminlogin")
    public String adminlogin(){
        return "adminlogin";
    }
    @RequestMapping("adminloginverify")
    @ResponseBody
    public String adminloginverify(String id,String password, HttpServletRequest request){
        return loginServiceImpl.adminLogin(id,password,request);
    }
}

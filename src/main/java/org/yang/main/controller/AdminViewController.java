package org.yang.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yang.main.pojo.Menu;
import org.yang.main.service.AdminViewService;
import org.yang.main.service.HomeService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("adminview")
public class AdminViewController {

    @Resource
    private AdminViewService adminViewServiceImpl;

    @RequestMapping("adminmenu")
    public String adminmenu(){
        return "adminmenu";
    }

    @RequestMapping("menumanager")
    public String menumanager(Model model){
        model.addAttribute("dadMenuList",adminViewServiceImpl.getDadMenu());
        model.addAttribute("allMenuList",adminViewServiceImpl.getAllMenu());
        return "menumanager";
    }

    @RequestMapping("menu")
    public String menu(Model model, HttpServletRequest request){
        model.addAttribute("menuList",adminViewServiceImpl.getMenuByAdmin(request));
        return "menu";
    }




}

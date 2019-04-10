package org.yang.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.yang.main.service.HomeService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("adminview")
public class AdminViewController {
    @Resource
    private HomeService homeServiceImpl;
    @RequestMapping("adminmenu")
    public String adminmenu(Model model, HttpServletRequest request){
        model.addAttribute("menuList",homeServiceImpl.getMenuByAdmin(request));
        model.addAttribute("firstMenu",homeServiceImpl.getMenuByAdmin(request).get(0));
        model.addAttribute("allMenuList",homeServiceImpl.getAllMenu());
        return "adminmenu";
    }
    @RequestMapping("privilegemanagement")
    public String privilegemanagement(){
        return "privilegemanagement";
    }
    @RequestMapping("rolemanagement")
    public String rolemanagement(){
        return "rolemanagement";
    }

}

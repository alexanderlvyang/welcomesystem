package org.yang.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yang.main.pojo.Menu;
import org.yang.main.service.MenuManagerService;

import javax.annotation.Resource;

@Controller
@RequestMapping("menumanager")
public class MenuManagerController {

    @Resource
    private MenuManagerService menuManagerServiceImpl;

    @RequestMapping("getIdByName")
    @ResponseBody
    public String getIdByName(String name){
        return menuManagerServiceImpl.selectIdByName(name);
    }

    @RequestMapping("addMenu")
    @ResponseBody
    public String addMenu(Menu menu){
        return menuManagerServiceImpl.addMenu(menu);
    }

    @RequestMapping("delMenuById")
    @ResponseBody
    public String delMenuById(int id,int pid){
        return menuManagerServiceImpl.delMenuById(id,pid);
    }

    @RequestMapping("selectMenuById")
    @ResponseBody
    public Object selectMenuById(int id){
        return menuManagerServiceImpl.selectMenuById(id);
    }

    @RequestMapping("updateMenuById")
    @ResponseBody
    public String updateMenuById(Menu menu){
        return menuManagerServiceImpl.updateMenuById(menu);
    }
}

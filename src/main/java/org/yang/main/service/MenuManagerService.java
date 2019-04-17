package org.yang.main.service;

import org.yang.main.pojo.Menu;

import java.util.List;

public interface MenuManagerService {

    String selectIdByName(String name);
    String addMenu(Menu menu);
    String delMenuById(int id,int pid);
    Menu selectMenuById(int id);
    String updateMenuById(Menu menu);
}

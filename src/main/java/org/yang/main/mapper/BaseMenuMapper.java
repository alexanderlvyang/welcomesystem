package org.yang.main.mapper;

import org.yang.main.pojo.Admin;
import org.yang.main.pojo.Menu;

import java.util.List;

public interface BaseMenuMapper {
    List<Menu> selectMenuByAdmin(Admin admin);
    List<Menu> selectAllMenu();
}

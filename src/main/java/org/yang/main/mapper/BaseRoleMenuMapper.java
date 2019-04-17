package org.yang.main.mapper;

import org.apache.ibatis.annotations.Param;
import org.yang.main.pojo.RoleMenu;

public interface BaseRoleMenuMapper {
    int addRoleMenu(RoleMenu roleMenu);
    int delRoleMenun(@Param("id")int id);
}

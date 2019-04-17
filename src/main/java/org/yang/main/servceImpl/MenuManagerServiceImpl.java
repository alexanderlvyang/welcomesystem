package org.yang.main.servceImpl;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yang.main.mapper.MenuMapper;
import org.yang.main.mapper.RoleMenuMapper;
import org.yang.main.pojo.Menu;
import org.yang.main.pojo.RoleMenu;
import org.yang.main.service.MenuManagerService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MenuManagerServiceImpl implements MenuManagerService {
    @Resource
    private MenuMapper menuMapper;
    @Resource
    private RoleMenuMapper roleMenuMapper;

    @Override
    public String selectIdByName(String name) {
        return menuMapper.selectIdByName(name);
    }

    @Override
    @Transactional
    public String addMenu(Menu menu) {
        int isAdd=menuMapper.addMenu(menu);
        int id=menu.getId();
        RoleMenu roleMenu=new RoleMenu();
        roleMenu.setMenuid(id);
        roleMenu.setRoleid(1);
        int isRoleMenu = roleMenuMapper.addRoleMenu(roleMenu);
        if(isAdd==1&&isRoleMenu==1){
            return "添加成功";
        }else{
            throw new RuntimeException("添加失败");
        }
    }


    @Override
    public String delMenuById(int id,int pid) {
        int isDel=menuMapper.delMenuById(id);
        int delRoleMenuid=0;
        int delRoleMenupid=0;
        if(pid==0){
            delRoleMenuid=roleMenuMapper.delRoleMenun(id);
            delRoleMenupid=roleMenuMapper.delRoleMenun(pid);
        }
        if(isDel>=1&&(delRoleMenuid>=1||delRoleMenupid>=1)){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }

    @Override
    public Menu selectMenuById(int id) {
        return menuMapper.selectMenuById(id);
    }

    @Override
    public String updateMenuById(Menu menu) {
        int isUpt=menuMapper.updateMenuById(menu);
        if(isUpt==1){
            return "更新成功";
        }else{
            return "更新失败";
        }
    }
}

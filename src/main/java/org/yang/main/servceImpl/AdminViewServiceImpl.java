package org.yang.main.servceImpl;

import org.springframework.stereotype.Service;
import org.yang.main.mapper.MenuMapper;
import org.yang.main.pojo.Admin;
import org.yang.main.pojo.Menu;
import org.yang.main.service.AdminViewService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Service
public class AdminViewServiceImpl implements AdminViewService {
    @Resource
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getDadMenu() {
        return menuMapper.selectDadMenu();
    }

    @Override
    public List<Menu> getMenuByAdmin(HttpServletRequest request) {
        Admin loginAdmin = (Admin)request.getSession().getAttribute("admin");
        return menuMapper.selectMenuByAdmin(loginAdmin);
    }

    @Override
    public List<Menu> getAllMenu() {
        return menuMapper.selectAllMenu();
    }


}

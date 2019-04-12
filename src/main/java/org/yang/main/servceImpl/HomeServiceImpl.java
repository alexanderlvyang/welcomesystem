package org.yang.main.servceImpl;

import org.springframework.stereotype.Service;
import org.yang.main.mapper.MenuMapper;
import org.yang.main.pojo.Admin;
import org.yang.main.pojo.Menu;
import org.yang.main.service.HomeService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Service
public class HomeServiceImpl implements HomeService {
    @Resource
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getAllMenu() {
        return menuMapper.selectAllMenu();
    }

    @Override
    public List<Menu> getMenuByAdmin(HttpServletRequest request) {
        Admin loginAdmin = (Admin)request.getSession().getAttribute("admin");
        System.out.println(menuMapper.selectMenuByAdmin(loginAdmin));
        return menuMapper.selectMenuByAdmin(loginAdmin);
    }

}

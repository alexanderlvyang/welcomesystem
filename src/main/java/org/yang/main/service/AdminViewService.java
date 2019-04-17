package org.yang.main.service;

import org.springframework.stereotype.Service;
import org.yang.main.pojo.Menu;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface AdminViewService{
    List<Menu> getDadMenu();
    List<Menu> getAllMenu();
    List<Menu> getMenuByAdmin(HttpServletRequest request);

}

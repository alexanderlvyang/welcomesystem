package org.yang.main.servceImpl;

import org.springframework.stereotype.Service;
import org.yang.main.mapper.AdminMapper;
import org.yang.main.pojo.Admin;
import org.yang.main.service.LoginService;
import org.yang.main.tool.Constant;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private AdminMapper adminMapper;
    @Override
    public String adminLogin(String id, String password, HttpServletRequest request) {
        Admin admin=new Admin();
        admin.setId(id);
        admin.setPassword(password);
        Admin selectByAdmin = adminMapper.selectByAdmin(admin);
        if(selectByAdmin!=null){
            request.getSession().setAttribute("admin",selectByAdmin);
            return Constant.IS_EXIST;
        }else{
            return Constant.NOT_IS_EXIST;
        }
    }
}

package org.yang.main.service;

import javax.servlet.http.HttpServletRequest;

public interface LoginService {
    String adminLogin(String id,String password ,HttpServletRequest request);
}

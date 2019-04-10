package org.yang.main.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "AdminFilter",urlPatterns = "/adminview/*")
public class AdminFilter implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request=(HttpServletRequest)req;
        HttpServletResponse response=(HttpServletResponse)resp;
            if (request.getSession().getAttribute("admin") == null) {
                response.sendRedirect("/adminlogin");
            } else {
                chain.doFilter(req, resp);
            }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}

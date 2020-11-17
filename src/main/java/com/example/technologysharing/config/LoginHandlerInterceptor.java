package com.example.technologysharing.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author MrWang
 * @Date 2020/10/7 18:35
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //用户登陆成功后，应该有自己的session
        Object session = request.getSession().getAttribute("LoginUser");
//        String reqURL = request.getRequestURL().toString();
//        if (reqURL == "http://121.196.100.176:8080/swagger-ui.html" || reqURL == "http://localhost:8080/swagger-ui.html"){
//            return true;
//        }else
//        if (session == null) {
//            request.setAttribute("msg", "权限不够，请先登录");
//            request.getRequestDispatcher("/index.html").forward(request, response);
//            return false;
//        } else {
//            return true;
//        }
        return true;


    }

}

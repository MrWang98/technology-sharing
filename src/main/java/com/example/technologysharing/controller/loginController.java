package com.example.technologysharing.controller;


import com.example.technologysharing.pojo.AdminAccount;
import com.example.technologysharing.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @Author MrWang
 * @Date 2020/10/7 18:19
 */
@Controller
public class loginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session) {
        AdminAccount adminAccount = null;
        adminAccount = loginService.loadAdminAccountByName(username);
        String adminPassword = adminAccount.getPassword();
        if(adminAccount.getPassword().equals(password)){
            session.setAttribute("LoginUser", username);
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg", "用户名或密码错误");
            return "index";
        }

        //        //如果用户名和密码正确
//        if ("admin".equals(username) && "123456".equals(password)) {
//            session.setAttribute("LoginUser", username);
//            return "redirect:/main.html";//重定向搭配main.html页面，跳转到dashboard页面
//        }
//        //如果用户名或者密码不正确
//        else {
//            model.addAttribute("msg", "用户名或者密码错误");//显示错误信息
//            return "index";//跳转到首页
//        }
    }

}

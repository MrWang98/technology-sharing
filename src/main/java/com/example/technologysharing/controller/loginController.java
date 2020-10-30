package com.example.technologysharing.controller;


import com.example.technologysharing.pojo.AdminAccount;
import com.example.technologysharing.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "登录相关接口")
@Controller
public class loginController {

    @Autowired
    private LoginService loginService;

    @ApiOperation(value = "登录验证")
    @RequestMapping(value = "/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model, HttpSession session) {
        AdminAccount adminAccount = null;
        adminAccount = loginService.loadAdminAccountByName(username);
        if(adminAccount.getPassword().equals(password)){
            session.setAttribute("LoginUser", username);
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg", "用户名或密码错误");
            return "index";
        }
    }

}

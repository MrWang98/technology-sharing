package com.example.technologysharing.controller;

import com.example.technologysharing.mapper.AnnouncementMapper;
import com.example.technologysharing.mapper.UserAccountMapper;
import com.example.technologysharing.pojo.Announcement;
import com.example.technologysharing.service.AddService;
import com.example.technologysharing.vo.AnnouncementVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Collection;

/**
 * @Author MrWang
 * @Date 2020/10/7 19:38
 */
@Api(tags = "管理员相关接口")
@Controller
public class AdminAccountController {
    @Autowired
    private UserAccountMapper userAccountMapper;

    @Autowired
    private AnnouncementMapper announcementMapper;

    @Autowired
    private AddService addService;

    @ApiOperation(value = "查看公告")
    @RequestMapping("/emps")
    public String list(Model model, HttpSession session) {
        if(session!=null){
            String name = (String) session.getAttribute("LoginUser");
            Collection<Announcement> announcements = addService.loadAnnouncementByAdminName(name);
            model.addAttribute("anncouncements", announcements);
            return "emp/list";//返回到list页面
        }else {
            return null;
        }
    }

    @ApiOperation(value = "添加公告")
    @GetMapping("/add")
    public String add(Model model) {
        return "emp/add";//返回到添加员工页面
    }

    @ApiOperation(value = "编辑公告")
    @PostMapping("/add")
    public String addAnnouncement(AnnouncementVO vo, HttpSession session) throws Exception{
        String name = null;
        if(session!=null){
            name = (String) session.getAttribute("LoginUser");

        }else {
            return null;
        }
        if(vo ==null) {
            System.out.println("employee is null");
        } else{
            addService.addAnnouncementByAdminName(name, vo);

        }
        return "redirect:/emps";//重定向到/emps,刷新列表,返回到list页面
    }


}

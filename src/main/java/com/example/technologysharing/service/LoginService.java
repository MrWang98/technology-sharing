package com.example.technologysharing.service;


import com.example.technologysharing.pojo.AdminAccount;

/**
 * @Author MrWang
 * @Date 2020/10/24 10:09
 */
public interface LoginService {
    public AdminAccount loadAdminAccountByName(String name);
}

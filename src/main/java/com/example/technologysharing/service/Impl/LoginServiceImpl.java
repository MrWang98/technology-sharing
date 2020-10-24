package com.example.technologysharing.service.Impl;

import com.example.technologysharing.mapper.AdminAccountMapper;
import com.example.technologysharing.pojo.AdminAccount;
import com.example.technologysharing.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author MrWang
 * @Date 2020/10/24 10:10
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private AdminAccountMapper adminAccountMapper;

    @Override
    public AdminAccount loadAdminAccountByName(String name) {
        AdminAccount adminAccount = null;
        try{
            adminAccount = adminAccountMapper.selectByAdminName(name);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return adminAccount;
    }
}

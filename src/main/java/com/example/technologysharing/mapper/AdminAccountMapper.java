package com.example.technologysharing.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.technologysharing.pojo.AdminAccount;

/**
 * @Author MrWang
 * @Date 2020/10/24 9:55
 */
public interface AdminAccountMapper {
    AdminAccount selectByAdminName(String name);
}

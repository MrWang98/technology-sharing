package com.example.technologysharing.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author MrWang
 * @Date 2020/10/7 16:36
 */
//员工表
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminAccount{
    private Integer id;
    private String name;
    private String password;
    private Boolean onLine;
}

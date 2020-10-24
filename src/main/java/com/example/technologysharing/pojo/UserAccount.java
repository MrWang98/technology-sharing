package com.example.technologysharing.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author MrWang
 * @Date 2020/10/24 15:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccount {
    private Integer id;
    private String name;
    private String password;
    private Boolean onLine;
}

package com.example.technologysharing.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author MrWang
 * @Date 2020/10/24 15:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Announcement {
    private Integer id;
    private String title;
    private String content;
    private Date publishTime;
    private Integer writterId;
}

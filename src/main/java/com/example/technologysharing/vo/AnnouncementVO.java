package com.example.technologysharing.vo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author MrWang
 * @Date 2020/10/24 18:09
 */
@Data
@Accessors(chain = true)
public class AnnouncementVO {

    private String title;

    private String content;
}

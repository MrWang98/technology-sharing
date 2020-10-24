package com.example.technologysharing.service;

import com.example.technologysharing.pojo.Announcement;
import com.example.technologysharing.vo.AnnouncementVO;

import java.util.List;

/**
 * @Author MrWang
 * @Date 2020/10/24 10:09
 */
public interface AddService {
    List<Announcement> loadAnnouncementByAdminName(String name);

    void addAnnouncementByAdminName(String name, AnnouncementVO vo);
}

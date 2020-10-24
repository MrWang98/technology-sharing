package com.example.technologysharing.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.technologysharing.pojo.Announcement;
import com.example.technologysharing.vo.AnnouncementVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author MrWang
 * @Date 2020/10/24 15:58
 */
public interface AnnouncementMapper {
    List<Announcement> selectAnnouncementByAdminId(Integer id);

    void addAnnouncementByAdminId(@Param("id") Integer id, @Param("title") String title, @Param("content") String content);
}

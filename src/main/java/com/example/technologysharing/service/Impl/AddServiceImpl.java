package com.example.technologysharing.service.Impl;

import com.example.technologysharing.mapper.AdminAccountMapper;
import com.example.technologysharing.mapper.AnnouncementMapper;
import com.example.technologysharing.pojo.AdminAccount;
import com.example.technologysharing.pojo.Announcement;
import com.example.technologysharing.service.AddService;
import com.example.technologysharing.vo.AnnouncementVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author MrWang
 * @Date 2020/10/24 10:10
 */
@Service
public class AddServiceImpl implements AddService {
    @Autowired
    private AdminAccountMapper adminAccountMapper;

    @Autowired
    private AnnouncementMapper announcementMapper;

    public void addAnnouncemnetByAdminId(Integer id){
//        AdminAccount adminAccount = adminAccountMapper.selectOne(new QueryWrapper<AdminAccount>().eq("id", id));

    }

    @Override
    public List<Announcement> loadAnnouncementByAdminName(String name) {
        AdminAccount adminAccount = adminAccountMapper.selectByAdminName(name);
        return announcementMapper.selectAnnouncementByAdminId(adminAccount.getId());
    }

    @Override
    public void addAnnouncementByAdminName(String name, AnnouncementVO vo){
        Integer id = adminAccountMapper.selectByAdminName(name).getId();
        announcementMapper.addAnnouncementByAdminId(id,vo.getTitle(),vo.getContent());
    }
}

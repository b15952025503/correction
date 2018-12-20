package com.community.demo.dao;

import com.community.demo.entity.Announcement;
import com.community.demo.entity.AnnouncementExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface AnnouncementMapper {
    long countByExample(AnnouncementExample example);

    int deleteByExample(AnnouncementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Announcement record);

    int insertSelective(Announcement record);

    List<Announcement> selectByExample(AnnouncementExample example);

    Announcement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Announcement record, @Param("example") AnnouncementExample example);

    int updateByExample(@Param("record") Announcement record, @Param("example") AnnouncementExample example);

    int updateByPrimaryKeySelective(Announcement record);

    int updateByPrimaryKey(Announcement record);
}
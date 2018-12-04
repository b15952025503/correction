package com.community.demo.dao;

import com.community.demo.entity.Rectification;
import com.community.demo.entity.RectificationExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RectificationMapper {
    long countByExample(RectificationExample example);

    int deleteByExample(RectificationExample example);

    int deleteByPrimaryKey(String rno);

    int insert(Rectification record);

    int insertSelective(Rectification record);

    List<Rectification> selectByExample(RectificationExample example);

    Rectification selectByPrimaryKey(String rno);

    int updateByExampleSelective(@Param("record") Rectification record, @Param("example") RectificationExample example);

    int updateByExample(@Param("record") Rectification record, @Param("example") RectificationExample example);

    int updateByPrimaryKeySelective(Rectification record);

    int updateByPrimaryKey(Rectification record);

    public List<Map<String, Rectification>> queryAll();
}
package com.community.demo.dao;

import com.community.demo.entity.Rectflag;
import com.community.demo.entity.RectflagExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RectflagMapper {
    long countByExample(RectflagExample example);

    int deleteByExample(RectflagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Rectflag record);

    int insertSelective(Rectflag record);

    List<Rectflag> selectByExample(RectflagExample example);

    Rectflag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Rectflag record, @Param("example") RectflagExample example);

    int updateByExample(@Param("record") Rectflag record, @Param("example") RectflagExample example);

    int updateByPrimaryKeySelective(Rectflag record);

    int updateByPrimaryKey(Rectflag record);
}
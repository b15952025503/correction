package com.community.demo.dao;

import com.community.demo.entity.Politics;
import com.community.demo.entity.PoliticsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PoliticsMapper {
    long countByExample(PoliticsExample example);

    int deleteByExample(PoliticsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Politics record);

    int insertSelective(Politics record);

    List<Politics> selectByExample(PoliticsExample example);

    Politics selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Politics record, @Param("example") PoliticsExample example);

    int updateByExample(@Param("record") Politics record, @Param("example") PoliticsExample example);

    int updateByPrimaryKeySelective(Politics record);

    int updateByPrimaryKey(Politics record);
}
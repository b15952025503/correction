package com.community.demo.dao;

import com.community.demo.entity.PerformCategory;
import com.community.demo.entity.PerformCategoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PerformCategoryMapper {
    long countByExample(PerformCategoryExample example);

    int deleteByExample(PerformCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PerformCategory record);

    int insertSelective(PerformCategory record);

    List<PerformCategory> selectByExample(PerformCategoryExample example);

    PerformCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PerformCategory record, @Param("example") PerformCategoryExample example);

    int updateByExample(@Param("record") PerformCategory record, @Param("example") PerformCategoryExample example);

    int updateByPrimaryKeySelective(PerformCategory record);

    int updateByPrimaryKey(PerformCategory record);
}
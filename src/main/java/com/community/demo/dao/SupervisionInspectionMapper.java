package com.community.demo.dao;

import com.community.demo.entity.SupervisionInspection;
import com.community.demo.entity.SupervisionInspectionExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SupervisionInspectionMapper {
    long countByExample(SupervisionInspectionExample example);

    int deleteByExample(SupervisionInspectionExample example);

    int deleteByPrimaryKey(Integer suid);

    int insert(SupervisionInspection record);

    int insertSelective(SupervisionInspection record);

    List<SupervisionInspection> selectByExample(SupervisionInspectionExample example);

    SupervisionInspection selectByPrimaryKey(Integer suid);

    int updateByExampleSelective(@Param("record") SupervisionInspection record, @Param("example") SupervisionInspectionExample example);

    int updateByExample(@Param("record") SupervisionInspection record, @Param("example") SupervisionInspectionExample example);

    int updateByPrimaryKeySelective(SupervisionInspection record);

    int updateByPrimaryKey(SupervisionInspection record);
}
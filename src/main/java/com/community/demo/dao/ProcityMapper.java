package com.community.demo.dao;

import com.community.demo.entity.Procity;
import com.community.demo.entity.ProcityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProcityMapper {
    long countByExample(ProcityExample example);

    int deleteByExample(ProcityExample example);

    int deleteByPrimaryKey(String pccode);

    int insert(Procity record);

    int insertSelective(Procity record);

    List<Procity> selectByExample(ProcityExample example);

    Procity selectByPrimaryKey(String pccode);

    Procity selectparentCode(String parentCode);
    int updateByExampleSelective(@Param("record") Procity record, @Param("example") ProcityExample example);

    int updateByExample(@Param("record") Procity record, @Param("example") ProcityExample example);

    int updateByPrimaryKeySelective(Procity record);

    int updateByPrimaryKey(Procity record);

    @Select("select pcCode,pcName,parentCode,pcType from proCity where parentCode=#{param}")
    Procity select(String parentCode);

  /*  @Select("select pcCode,pcName,parentCode,pcType from proCity where parentCode='1'")
    int selectid();*/
}
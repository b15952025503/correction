package com.community.demo.dao;

import com.community.demo.entity.Regulatory;
import com.community.demo.entity.RegulatoryExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface RegulatoryMapper {
    long countByExample(RegulatoryExample example);

    int deleteByExample(RegulatoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Regulatory record);

    int insertSelective(Regulatory record);

    List<Regulatory> selectByExample(RegulatoryExample example);

    Regulatory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Regulatory record, @Param("example") RegulatoryExample example);

    int updateByExample(@Param("record") Regulatory record, @Param("example") RegulatoryExample example);

    int updateByPrimaryKeySelective(Regulatory record);

    int updateByPrimaryKey(Regulatory record);


    @Select("select rg.name name,count(*) value from regulatory rg join rectification r on rg.id=r.rid group by rg.name")
    List<Map<String, Object>> queryRG();

}
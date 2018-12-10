package com.community.demo.dao;

import com.community.demo.entity.Loginfo1;
import com.community.demo.entity.Loginfo1Example;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface Loginfo1Mapper {
    long countByExample(Loginfo1Example example);

    int deleteByExample(Loginfo1Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Loginfo1 record);

    int insertSelective(Loginfo1 record);

    List<Loginfo1> selectByExample(Loginfo1Example example);

    Loginfo1 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Loginfo1 record, @Param("example") Loginfo1Example example);

    int updateByExample(@Param("record") Loginfo1 record, @Param("example") Loginfo1Example example);

    int updateByPrimaryKeySelective(Loginfo1 record);

    int updateByPrimaryKey(Loginfo1 record);


    List<Map<String,Object>> query();
}
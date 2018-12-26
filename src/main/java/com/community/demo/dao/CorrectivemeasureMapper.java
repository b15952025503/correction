package com.community.demo.dao;

import com.community.demo.entity.Correctivemeasure;
import com.community.demo.entity.CorrectivemeasureExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CorrectivemeasureMapper {
    long countByExample(CorrectivemeasureExample example);

    int deleteByExample(CorrectivemeasureExample example);

    int deleteByPrimaryKey(String correctivid);

    int insert(Correctivemeasure record);

    int insertSelective(Correctivemeasure record);

    List<Correctivemeasure> selectByExample(CorrectivemeasureExample example);

    Correctivemeasure selectByPrimaryKey(String correctivid);

    int updateByExampleSelective(@Param("record") Correctivemeasure record, @Param("example") CorrectivemeasureExample example);

    int updateByExample(@Param("record") Correctivemeasure record, @Param("example") CorrectivemeasureExample example);

    int updateByPrimaryKeySelective(Correctivemeasure record);

    int updateByPrimaryKey(Correctivemeasure record);

    //ID自增
    @Select("select concat('C00',max(cast(SUBSTRING(correctivid,2)+1  as UNSIGNED  INTEGER)))" +
            " from correctivemeasure")
    String increment();

    @Select("select r.photo,r.rname,c.* from  rectification r\n" +
            "LEFT JOIN correctivemeasure c\n" +
            "on r.rno=c.rno")
    public List<Map<String,Object>> queryAll();
}
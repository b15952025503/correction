package com.community.demo.dao;

import com.community.demo.entity.Judgment;
import com.community.demo.entity.JudgmentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface JudgmentMapper {
    long countByExample(JudgmentExample example);

    int deleteByExample(JudgmentExample example);

    int deleteByPrimaryKey(String jno);

    int insert(Judgment record);

    int insertSelective(Judgment record);

    List<Judgment> selectByExample(JudgmentExample example);

    Judgment selectByPrimaryKey(String jno);

    int updateByExampleSelective(@Param("record") Judgment record, @Param("example") JudgmentExample example);

    int updateByExample(@Param("record") Judgment record, @Param("example") JudgmentExample example);

    int updateByPrimaryKeySelective(Judgment record);

    int updateByPrimaryKey(Judgment record);
    //自动生成ID
    @Select("select concat('j'," +
            " (case  when SUBSTRING(max(jNo),2,8)=DATE_FORMAT(now(),'%Y%m%d') then SUBSTRING(max(jNo),2,11)+1  else concat(DATE_FORMAT(now(),'%Y%m%d'),'001')\n" +
            "end)) from judgment;")
    String increment();

    @Select("select * from judgment order by jNo desc limit 1")
    public Judgment querybyd();


}
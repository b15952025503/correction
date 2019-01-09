package com.community.demo.dao;

import com.community.demo.entity.Exam;
import com.community.demo.entity.ExamExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ExamMapper {
    long countByExample(ExamExample example);

    int deleteByExample(ExamExample example);

    int deleteByPrimaryKey(Integer emid);

    int insert(Exam record);

    int insertSelective(Exam record);

    List<Exam> selectByExample(ExamExample example);

    Exam selectByPrimaryKey(Integer emid);

    int updateByExampleSelective(@Param("record") Exam record, @Param("example") ExamExample example);

    int updateByExample(@Param("record") Exam record, @Param("example") ExamExample example);

    int updateByPrimaryKeySelective(Exam record);

    int updateByPrimaryKey(Exam record);
}
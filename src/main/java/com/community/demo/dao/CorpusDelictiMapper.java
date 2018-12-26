package com.community.demo.dao;

import com.community.demo.entity.CorpusDelicti;
import com.community.demo.entity.CorpusDelictiExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CorpusDelictiMapper {
    long countByExample(CorpusDelictiExample example);

    int deleteByExample(CorpusDelictiExample example);

    int deleteByPrimaryKey(Integer cd);

    int insert(CorpusDelicti record);

    int insertSelective(CorpusDelicti record);

    List<CorpusDelicti> selectByExample(CorpusDelictiExample example);

    CorpusDelicti selectByPrimaryKey(Integer cd);

    int updateByExampleSelective(@Param("record") CorpusDelicti record, @Param("example") CorpusDelictiExample example);

    int updateByExample(@Param("record") CorpusDelicti record, @Param("example") CorpusDelictiExample example);

    int updateByPrimaryKeySelective(CorpusDelicti record);

    int updateByPrimaryKey(CorpusDelicti record);
}
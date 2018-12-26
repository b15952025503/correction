package com.community.demo.dao;

import com.community.demo.entity.TpMz;
import com.community.demo.entity.TpMzExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TpMzMapper {
    long countByExample(TpMzExample example);

    int deleteByExample(TpMzExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TpMz record);

    int insertSelective(TpMz record);

    List<TpMz> selectByExample(TpMzExample example);

    TpMz selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TpMz record, @Param("example") TpMzExample example);

    int updateByExample(@Param("record") TpMz record, @Param("example") TpMzExample example);

    int updateByPrimaryKeySelective(TpMz record);

    int updateByPrimaryKey(TpMz record);
}
package com.community.demo.dao;

import com.community.demo.entity.AuthorityManagement;
import com.community.demo.entity.AuthorityManagementExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AuthorityManagementMapper {
    long countByExample(AuthorityManagementExample example);

    int deleteByExample(AuthorityManagementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthorityManagement record);

    int insertSelective(AuthorityManagement record);

    List<AuthorityManagement> selectByExample(AuthorityManagementExample example);

    AuthorityManagement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthorityManagement record, @Param("example") AuthorityManagementExample example);

    int updateByExample(@Param("record") AuthorityManagement record, @Param("example") AuthorityManagementExample example);

    int updateByPrimaryKeySelective(AuthorityManagement record);

    int updateByPrimaryKey(AuthorityManagement record);


    public AuthorityManagement findAll();
    public AuthorityManagement findbyID(Integer cid);


}
package com.community.demo.dao;

import com.community.demo.entity.Rectification;
import com.community.demo.entity.RectificationExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RectificationMapper {
    long countByExample(RectificationExample example);

    int deleteByExample(RectificationExample example);

    int deleteByPrimaryKey(String rno);

    int insert(Rectification record);

    int insertSelective(Rectification record);

    List<Rectification> selectByExample(RectificationExample example);

    Rectification selectByPrimaryKey(String rno);

    int updateByExampleSelective(@Param("record") Rectification record, @Param("example") RectificationExample example);

    int updateByExample(@Param("record") Rectification record, @Param("example") RectificationExample example);

    int updateByPrimaryKeySelective(Rectification record);

    int updateByPrimaryKey(Rectification record);

    public List<Map<String, Rectification>> queryAll(String name);


    public List<Map<String, Object>> queryInfo();

    public  List<Map<String,Rectification>> queryById(String rno);
    //ID自增
    @Select("select concat('r'," +
            "(case  when SUBSTRING(max(rNo),2,8)=DATE_FORMAT(now(),'%Y%m%d') then SUBSTRING(max(rNo),2,11)+1  else concat(DATE_FORMAT(now(),'%Y%m%d'),'001')" +
            " end)) from Rectification;")
    String increment();
    //查询最新一条ID
    @Select("select * from Rectification order by rNo desc limit 1")
    public Rectification query();

    //手机号存在性校验
    @Select("select * from rectification where phone=#{param1}")
    public List<Map<String,Object>>  phone(String phone);

    //身份证存在性校验
    @Select("select * from rectification where idcard=#{param1}")
    public List<Map<String,Object>> idcard(String idcard);

    //按条件查询
    @Select("select * from rectification where idcard=#{param1}")
    public Rectification rectification(String idcard);
}
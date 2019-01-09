package com.community.demo.dao;

import com.community.demo.entity.*;

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

    //按条件查询
    public Map<String,Object> queryById(String rno);
    //按条件查询监督考察
    @Select("SELECT r.rNo,r.idcard,r.rname,s.suid,s.rNO,e.ename,s.sudate,s.sudatetwo,s.suEvent,s.suResult,s.suStatic\n" +
            "FROM\n" +
            "rectification r\n" +
            "join supervision_inspection s\n" +
            "ON r.rNo=s.rNo\n" +
            "join employees e\n" +
            "on s.eNo=e.eNo where r.rno=#{param1}")
    public SupervisionInspection querySuid(String rno);
    //
    @Select("select rNo,rname,idcard from rectification where rNO=#{param1}")
    public Map<String, Object> queryreid(String rno);
    //按条件查询教育矫正
    @Select("SELECT r.rNo,r.idcard,r.rname,c.correctivid,c.rNO,c.correctivdate,c.correctivdatetwo,c.correctivname,c.correctivresult,c.flag\n" +
            "FROM\n" +
            "rectification r\n" +
            "join correctivemeasure c\n" +
            "ON r.rNo=c.rNo\n" +
            "where r.rNO=#{param1}")
    public Correctivemeasure querycorrid(String rno);
    //按条件查询考试评分
    @Select("SELECT r.rNo,r.idcard,r.rname,em.emid,em.rNo,em.emdate,em.emfraction,emflag\n" +
            "FROM\n" +
            "rectification r\n" +
            "join exam em\n" +
            "ON r.rNo=em.rNo\n" +
            "where r.rNO=#{param1}")
    public Exam queryemid(String rno);
}
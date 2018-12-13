package com.community.demo.controller;

import com.community.demo.dao.*;
import com.community.demo.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("Rectifications")
public class RectificationsControler {
    @Autowired
    RectificationMapper rectificationMapper;
    //监管级别下拉框
    @Autowired
    RegulatoryMapper regulatoryMapper;
    //民族下拉框
    @Autowired
    TpMzMapper tpMzMapper;
    //文化程度下拉框
    @Autowired
    EducationMapper educationMapper;
    //政治面貌下拉框
    @Autowired
    PoliticsMapper politicsMapper;
    //执行类别下拉框
    @Autowired
    PerformCategoryMapper performCategoryMapper;
    //矫正状态下拉框
    @Autowired
    RectflagMapper rectflagMapper;
    //省市级联下拉框
    @Autowired
    ProcityMapper procityMapper;
    //判决时局部刷新
    @Autowired
    JudgmentMapper judgmentMapper;
    @RequestMapping("/li")
    public  String getConstsTypeByid(ModelMap model){
        ProcityExample procityExample=new ProcityExample();

        ProcityExample.Criteria criteria = procityExample.createCriteria();
        criteria.andParentcodeEqualTo("1");
        List<Procity> procities = procityMapper.selectByExample(procityExample);
        System.out.println("省"+procities);
        model.addAttribute("procities",procities);
        return "RectificationAdd";
    }



    @RequestMapping("/l")
    public String getConstsTypeBycode(HttpServletRequest request, HttpServletResponse response, Model model){
        System.out.println("进入");
      String  consts =request.getParameter("consts_id");
        System.out.println("按条件查询"+consts);

        ProcityExample procityExample=new  ProcityExample();
        ProcityExample.Criteria criteria = procityExample.createCriteria();
        criteria.andParentcodeEqualTo(consts);
        List<Procity> constsType = procityMapper.selectByExample(procityExample);
        System.out.println("市"+constsType);
        model.addAttribute("constsType",constsType);

        return "RectificationAdd::contype";
    }
    @RequestMapping("regulatoryMapper")
    public String licourse(Model model){
        //监管级别下拉框
        List<Regulatory> regulatories=regulatoryMapper.selectByExample(null);
        model.addAttribute("regulatories",regulatories);
        //民族下拉框
        List<TpMz> tpMzs=tpMzMapper.selectByExample(null);
        model.addAttribute("tpMz",tpMzs);
        //文化程度下拉框
        List<Education> educations=educationMapper.selectByExample(null);
        model.addAttribute("educations",educations);
        //政治面貌下拉框
        List<Politics> politics=politicsMapper.selectByExample(null);
        model.addAttribute("politics",politics);
        //执行类别下拉框
        List<PerformCategory> performCategories=performCategoryMapper.selectByExample(null);
        model.addAttribute("performCategories",performCategories);
        //矫正状态下拉框
        List<Rectflag> rectflags= rectflagMapper.selectByExample(null);
        model.addAttribute("rectflags",rectflags);
        //省市级联下拉框
        Procity procity=procityMapper.selectparentCode(null);
        model.addAttribute("procity",procity);
        //局部刷新
        Judgment judgment=judgmentMapper.selectByPrimaryKey(null);
        model.addAttribute("judgment",judgment);
        return "RectificationAdd";
    }
    @RequestMapping("add")
    public String add(MultipartFile photos , Rectification rectification){
        //判决书添加
        Judgment judgments=new Judgment();
         judgments.setJno(judgmentMapper.increment());
        judgmentMapper.insert(judgments);
        //基本信息添加
        rectification.setRno(rectificationMapper.increment());
        String fileName=photos.getOriginalFilename();
        System.out.println(fileName);
        File newfile=null;
        String newFileName=null;
        try {
            if(!"".equals(fileName)){
                //1.获取文件后缀   lastIndexOf获取名字的最后一个"."
                Integer index=fileName.lastIndexOf(".");
                String suffix=fileName.substring(index);
                //2.重命名
                newFileName= UUID.randomUUID().toString()+suffix;
                System.out.println(newFileName);
                //3.获取保存路径
                newfile=new File("D:/upload/" + newFileName);
                //4. transferTo 另存为（复制）
                photos.transferTo(newfile);
            }
        } catch (Exception e) {
            return "error";
        }
        System.out.println(newFileName);
        rectification.setPhoto(newFileName);
        rectification.setjNo(judgmentMapper.increment());
        rectificationMapper.insert(rectification);
        System.out.println(rectification);

        return "redirect:regulatoryMapper";
    }
}

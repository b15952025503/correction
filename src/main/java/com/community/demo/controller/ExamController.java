package com.community.demo.controller;

import com.community.demo.dao.ExamMapper;
import com.community.demo.dao.RectificationMapper;
import com.community.demo.entity.Exam;
import com.community.demo.entity.Rectification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("Exams")
public class ExamController {
    @Autowired
    RectificationMapper rectificationMapper;
    @Autowired
    ExamMapper examMapper;
    @RequestMapping("queryIdcard")
    @ResponseBody
    public Rectification show(String idcard){
        Rectification list= rectificationMapper.rectification(idcard);
        System.out.println(list);
        return list;
    }
    //跳转分数添加页面
    @RequestMapping("show")
    public String query(String idcard, Model model){
        model.addAttribute("idcard",idcard);
        return "ExamAdd";
    }
    //执行添加
    @RequestMapping("add")
    public String add(Exam exam){
        examMapper.insert(exam);
        System.out.println(exam);
        return "redirect:/archivesQuery";
    }
}

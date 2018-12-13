package com.community.demo.controller;

import com.community.demo.dao.JudgmentMapper;
import com.community.demo.entity.Judgment;
import com.community.demo.entity.JudgmentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("jc")
public class JudgmentController {
    @Autowired
    JudgmentMapper dao;
    @RequestMapping("query")
    public String getList(Model mo) {
        List<Judgment> jud=dao.selectByExample(null);
        mo.addAttribute("jud",jud);
        System.out.println(jud);
        return "jlist";
    }
    @RequestMapping("insert")
    public String insert(){
        return "jadd";
    }
    @RequestMapping("add")
    public String insert2(Judgment record){
        //Id设置为自增
        record.setJno(dao.increment());
        dao.insert(record);
        System.out.println(record);
        return "jlist";
    }
}

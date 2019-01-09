package com.community.demo.controller;

import com.community.demo.dao.RectificationMapper;
import com.community.demo.dao.SupervisionInspectionMapper;
import com.community.demo.entity.Rectification;
import com.community.demo.entity.SupervisionInspection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/SupervisionInspections")
public class SupervisionInspectionController {
    @Autowired
    SupervisionInspectionMapper supervisionInspectionMapper;
    @Autowired
    RectificationMapper rectificationMapper;

    @RequestMapping("queryIdcard")
    @ResponseBody
    public Rectification show(String idcard){
        Rectification list= rectificationMapper.rectification(idcard);
        System.out.println(list);
        return list;
    }
    //跳转添加页面
    @RequestMapping("show")
    public String query(String idcard, Model model){
        model.addAttribute("idcard",idcard);
        return "SupervisionInspectionAdd";
    }
    //执行添加语句
    @RequestMapping("add")
    public String add(SupervisionInspection supervisionInspection, Rectification rectification){
        supervisionInspectionMapper.insert(supervisionInspection);
        System.out.println(supervisionInspection);
       return "redirect:/archivesQuery";
    }
    //跳转修改页面
    @RequestMapping("updateShow")
    public String updateShow(int suid,Model model){
        SupervisionInspection list=supervisionInspectionMapper.selectByPrimaryKey(suid);
        model.addAttribute("list",list);
        return "SupervisionInspectionUpdate";
    }
    //执行修改页面
    @RequestMapping("update")
    public String update(SupervisionInspection supervisionInspection){
        supervisionInspectionMapper.updateByPrimaryKey(supervisionInspection);
        System.out.println(supervisionInspection);
        return "redirect:/archivesQuery";
    }
}


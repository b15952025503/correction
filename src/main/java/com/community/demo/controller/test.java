package com.community.demo.controller;


import com.community.demo.dao.AuthorityManagementMapper;
import com.community.demo.dao.RectificationMapper;
import com.community.demo.entity.AuthorityManagement;
import com.community.demo.entity.AuthorityManagementExample;
import com.community.demo.entity.Rectification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class test {
    @Autowired
    AuthorityManagementMapper am;
    @Autowired
    RectificationMapper rm;
    //添加权限信息到model内
    @RequestMapping("t1")
    public String t1(Model model) {
        AuthorityManagementExample authorityManagementExample = new AuthorityManagementExample();
        AuthorityManagementExample.Criteria criteria = authorityManagementExample.createCriteria();
        List<AuthorityManagement> authorityManagements = am.selectByExample(authorityManagementExample);
        model.addAttribute("list", authorityManagements);
        return "t1";
    }

    //主页面
    @RequestMapping("t2")
    public String t2(Model model) {
        AuthorityManagement all = am.findAll();
        model.addAttribute("list",all);
        return "index";
    }

    // 查询所有犯人信息
    @RequestMapping("home.html")
    public String RectificationQuery(Model model){
        List<Map<String,Object>> list = rm.queryAll();
        model.addAttribute("list",list);
        System.out.println(list);
        return  "home";
    }


}

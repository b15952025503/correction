package com.community.demo.controller;


import com.community.demo.dao.AuthorityManagementMapper;
import com.community.demo.dao.RectificationMapper;
import com.community.demo.entity.AuthorityManagement;
import com.community.demo.entity.AuthorityManagementExample;
import com.community.demo.entity.Rectification;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class Home {
    @Autowired
    AuthorityManagementMapper am;
    @Autowired
    RectificationMapper rm;
    //添加权限信息到model内
    @RequestMapping("/t1")
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
    Integer totalPage;
    // 查询所有犯人信息
    @RequestMapping("home.html")
    public String RectificationQuery(@RequestParam(value="pn",defaultValue="1") Integer pn, Model model){

        PageHelper.startPage(pn,10);
        List<Map<String, Rectification>> maps = rm.queryAll(null);
        System.out.println(maps);
        PageInfo<Map<String, Rectification>> page=new PageInfo<Map<String, Rectification>>(maps);
        model.addAttribute("PageInfo",page);
        totalPage=page.getPages();
        return  "home";
    }
    public Integer pn=1;
    //分页查询
    @RequestMapping("query")
    public String queryAll(String Num,Model model,String name){


        if(Num!=null){
            if(Num.equals("add")){
                ++pn;
            }
            if(Num.equals("sub")){
                --pn;
            }
            if(Num.equals("first")){
                pn=1;
            }
            if(Num.equals("end")){
                pn=totalPage;
            }
        }
        System.out.println(pn);
        PageHelper.startPage(pn,10 );
        List<Map<String, Rectification>> maps = rm.queryAll(name);
        System.out.println(maps);
        PageInfo<Map<String, Rectification>> page=new PageInfo<Map<String, Rectification>>(maps);
        model.addAttribute("PageInfo",page);

        return "home::table_refresh";
    }

}

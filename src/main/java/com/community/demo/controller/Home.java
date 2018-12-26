package com.community.demo.controller;


import com.community.demo.dao.*;
import com.community.demo.entity.*;
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
    AnnouncementMapper anm;

    @Autowired
    RectificationMapper rm;

    @Autowired
    PerformCategoryMapper pcm;

    @Autowired
    RegulatoryMapper rgm;
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

    /**
     * 主页面
     * @param model
     * @return
     */
    @RequestMapping("index.html")
    public String index(Model model) {
        AuthorityManagement all = am.findAll();
        model.addAttribute("list",all);
        return "index";
    }
    Integer totalPage;
    /**
     *  查询所有犯人信息
      */
    @RequestMapping("home.html")
    public String RectificationQuery(@RequestParam(value="pn",defaultValue="1") Integer pn, Model model){
        PageHelper.startPage(pn,10);
        List<Map<String, Rectification>> maps = rm.queryAll(null);
        List<Announcement> announcements = anm.selectByExample(null);
        PageInfo<Map<String, Rectification>> page=new PageInfo<Map<String, Rectification>>(maps);
        List<Map<String, Object>> map1 = rgm.queryRG();
        System.out.println(map1);
        model.addAttribute("jgjb",map1);
        model.addAttribute("PageInfo",page);
        model.addAttribute("announcements",announcements);
        List<PerformCategory> performCategories = pcm.selectByExample(null);
        model.addAttribute("performCategories",performCategories);
        totalPage=page.getPages();
        return "home";
    }
    public Integer pn=1;

    /**
     *分页查询
     * @param Num
     * @param model
     * @param name
     * @return
     */
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
        PageHelper.startPage(pn,10 );
        List<Map<String, Rectification>> maps = rm.queryAll(name);
        PageInfo<Map<String, Rectification>> page=new PageInfo<Map<String, Rectification>>(maps);
        model.addAttribute("PageInfo",page);

        return "archivesQuery::table_refresh";
    }


    /**
     * 集合修改
     * @param l  集合
     * @return
     */
    @RequestMapping("update")
    public String update(Rectification l){
        for(Rectification r:l.getList()){
            System.out.println(r.getRno()+r.getSex()+r.getPcid()+r.getRid());
            rm.updateByPrimaryKeySelective(r);
        }
        return "redirect:archivesQuery";
    }

    @RequestMapping("login")
    @ResponseBody
    public String login(){
        return "验证成功";
    }

    /**
     * 档案查询
     * @param pn
     * @param model
     * @return
     */
    @RequestMapping("archivesQuery")
    public String archivesQuery(@RequestParam(value="pn",defaultValue="1") Integer pn, Model model){
        PageHelper.startPage(pn,10);
        List<Map<String, Rectification>> maps = rm.queryAll(null);
        List<Announcement> announcements = anm.selectByExample(null);
        PageInfo<Map<String, Rectification>> page=new PageInfo<Map<String, Rectification>>(maps);
        model.addAttribute("PageInfo",page);
        model.addAttribute("announcements",announcements);
        List<PerformCategory> performCategories = pcm.selectByExample(null);
        model.addAttribute("performCategories",performCategories);
        totalPage=page.getPages();
        return "archivesQuery";
    }

    /**
     * 查询矫正人员状态信息
     * @return
     */
    @ResponseBody
    @RequestMapping("queryStruts")
    public List queryStruts(){
        List<Map<String, Object>> struts = rm.queryStruts();
        return struts;
    }




}

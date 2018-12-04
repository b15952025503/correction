package com.community.demo.controller;

import com.community.demo.dao.RectificationMapper;
import com.community.demo.entity.Rectification;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


//角色控制层
@Controller
@RequestMapping("RectificationController")
public class RectificationController {


    @Autowired
    RectificationMapper rm;
    @RequestMapping("query")
    public String queryAll(@RequestParam(value="pn",defaultValue="1") Integer pn,Model model){
        PageHelper.startPage(pn,5);
        List<Map<String, Rectification>> maps = rm.queryAll();
        System.out.println(maps);
        PageInfo<Map<String, Rectification>> page=new PageInfo<Map<String, Rectification>>(maps);
        model.addAttribute("PageInfo",page);
        System.out.println(page);
        return "t1";
    }

}

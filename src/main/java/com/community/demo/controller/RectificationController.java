package com.community.demo.controller;

import com.community.demo.dao.RectificationMapper;
import com.community.demo.entity.Rectification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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


   /* @RequestMapping("home.html")
    public String RectificationQuery(Model model){
        List<Map<String,Object>> list = rm.queryAll();
        model.addAttribute("list",list);
        return  "home";
    }*/

}

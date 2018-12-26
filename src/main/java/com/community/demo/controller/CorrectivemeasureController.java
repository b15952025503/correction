package com.community.demo.controller;

import com.community.demo.dao.CorrectivemeasureMapper;
import com.community.demo.dao.RectificationMapper;
import com.community.demo.entity.Correctivemeasure;
import com.community.demo.entity.Rectification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("Correctivemeasures")
public class CorrectivemeasureController {
    @Autowired
    RectificationMapper rectificationMapper;
    @Autowired
    CorrectivemeasureMapper correctivemeasureMapper;
    @RequestMapping("query")
    @ResponseBody
    public Rectification show(String idcard){
        Rectification list= rectificationMapper.rectification(idcard);
        return list;
    }
    @RequestMapping("show")
    public String Correctivemeasure(){

        /*List<Correctivemeasure> list=correctivemeasureMapper.selectByPrimaryKey(idcard);*/
        return "correctivemeasureAdd";
    }
    @RequestMapping("add")
    public String add(Correctivemeasure correctivemeasure){
        //ID自增
        correctivemeasure.setCorrectivid(correctivemeasureMapper.increment());
        correctivemeasureMapper.insert(correctivemeasure);
        System.out.println(correctivemeasure);
        return "redirect:Correctivemeasures/show";
    }

    @RequestMapping("queryAll")
    @ResponseBody
    public Map<String,Object>  queryAll(Model model,Correctivemeasure correctivemeasure){
        List<Map<String,Object>> queryAll= correctivemeasureMapper.queryAll();
        Map<String,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("data",queryAll);
        return map;

    }
}

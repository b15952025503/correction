package com.community.demo.controller;


import com.community.demo.dao.Loginfo1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("logInfo")
public class LogInfoController {

    @Autowired
    Loginfo1Mapper lm;

    /**
     * 日志查询
     * @param model
     */
    @RequestMapping("query")
    public String query(Model model){
        List<Map<String, Object>> query = lm.query();
        model.addAttribute("logInfo",query);
        return "home::log_refresh";
    }
}

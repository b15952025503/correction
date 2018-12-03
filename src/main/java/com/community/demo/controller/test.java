package com.community.demo.controller;


import com.community.demo.dao.AuthorityManagementMapper;
import com.community.demo.entity.AuthorityManagement;
import com.community.demo.entity.AuthorityManagementExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class test {
    @Autowired
    AuthorityManagementMapper am;

    @RequestMapping("t1")
    public String t1(Model model) {
        AuthorityManagementExample authorityManagementExample = new AuthorityManagementExample();
        AuthorityManagementExample.Criteria criteria = authorityManagementExample.createCriteria();
        List<AuthorityManagement> authorityManagements = am.selectByExample(authorityManagementExample);
        model.addAttribute("list", authorityManagements);
        return "t1";
    }


    @RequestMapping("t2")
    public String t2(Model model) {
        AuthorityManagement all = am.findAll();
        model.addAttribute("list",all);
        return "index";
    }




}

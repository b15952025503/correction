package com.community.demo.controller;

import com.community.demo.dao.ProcityMapper;
import com.community.demo.entity.Procity;
import com.community.demo.entity.ProcityExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("test")
public class testController {
    @Autowired
    ProcityMapper procityMapper;

    @RequestMapping("ss")
    public String cs(){
        List<Procity> procities = procityMapper.selectByExample(null);
        System.out.println(procities);
        return "p";
    }


    @RequestMapping("t")
    public String sele(Model model){
        ProcityExample procityExample=new ProcityExample();

        ProcityExample.Criteria criteria = procityExample.createCriteria();
        criteria.andParentcodeEqualTo("1");
        List<Procity> procities = procityMapper.selectByExample(procityExample);
        System.out.println("省"+procities);
        model.addAttribute("procities",procities);
        return "list";
    }
    @RequestMapping("/l")
    public String se(HttpServletRequest request, HttpServletResponse response, Model model){
        System.out.println("进入");
        String  consts =request.getParameter("consts_id");
        System.out.println("按条件查询"+consts);

        ProcityExample procityExample=new  ProcityExample();
        ProcityExample.Criteria criteria = procityExample.createCriteria();
        criteria.andParentcodeEqualTo(consts);
        List<Procity> constsType = procityMapper.selectByExample(procityExample);
        System.out.println("市"+constsType);
        model.addAttribute("constsType",constsType);

        return "list::contype";
    }
}

package com.community.demo.controller;



import com.community.demo.dao.RectificationMapper;
import com.community.demo.entity.Rectification;
import com.community.demo.utils.PdfUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@Controller
@RequestMapping(value = "/pdf")
public class PdfController {
    @Autowired
    private FreeMarkerConfigurer configurer;

    /**
     * pdf预览
     *
     *
     * @param response HttpServletResponse
     */
    @Autowired
    RectificationMapper rm;
    @RequestMapping(value = "/preview")
    public void preview(HttpServletRequest req, HttpServletResponse response,String rno) {
        // 构造freemarker模板引擎参数,listVars.size()个数对应pdf页数
        List<Map<String,Object>> listVars = new ArrayList<>();
        List<Map<String, Rectification>> maps = rm.queryById(rno);
        Map<String,Object> variables = new HashMap<>();
        variables.put("title","社区服刑人员登记表");
        listVars.add(variables);
        Map<String, Object> stringObjectMap = listVars.get(0);
        stringObjectMap.put("map",maps);
        System.out.println(listVars);
        PdfUtils.preview(configurer,"pdfPage.ftl",listVars,response);
    }


    @RequestMapping(value = "/accessory")
    public void accessory(HttpServletRequest req, HttpServletResponse response) {
        // 构造freemarker模板引擎参数,listVars.size()个数对应pdf页数
        List<Map<String, Object>> maps = rm.queryInfo();
        Map<String,Object> variables = new HashMap<>();
        variables.put("title","社区服刑人员档案信息");
        maps.add(variables);
        System.out.println(maps);
        PdfUtils.preview(configurer,"accessory.ftl",maps,response);
    }

    /**
     * pdf下载
     *
     * @param request  HttpServletRequest
     * @param response HttpServletResponse
     */
    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public void download(HttpServletRequest request, HttpServletResponse response) {
        Map<String,Object> map=new HashMap<>();
        List<Map<String,Object>> listVars = new ArrayList<>();
        Map<String,Object> variables = new HashMap<>();
        variables.put("title","社会矫正人员基本信息!");
        listVars.add(variables);
        PdfUtils.download(configurer,"pdfPage.ftl",listVars,response,"测试中文.pdf");
    }
}

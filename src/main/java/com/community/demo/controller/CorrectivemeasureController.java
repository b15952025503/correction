package com.community.demo.controller;

import com.community.demo.dao.CorrectivemeasureMapper;
import com.community.demo.dao.RectificationMapper;
import com.community.demo.entity.Correctivemeasure;
import com.community.demo.entity.Exam;
import com.community.demo.entity.Rectification;
import com.community.demo.entity.SupervisionInspection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//矫正措施
@Controller
@RequestMapping("/Correctivemeasures")
public class CorrectivemeasureController {
    @Autowired
    RectificationMapper rectificationMapper;
    @Autowired
    CorrectivemeasureMapper correctivemeasureMapper;
    @RequestMapping("query")
    @ResponseBody
    public Rectification show(String idcard){
        Rectification list= rectificationMapper.rectification(idcard);
        System.out.println(list);
        return list;
    }

    /**
     * 跳转到添加页面
     * @return
     */
    @RequestMapping("show")
    public String Correctivemeasure(String idcard,Model model){
        model.addAttribute("idcard",idcard);
        return "correctivemeasureAdd";
    }

    /**
     * 教育矫正添加
     * @param correctivemeasure
     * @return
     */
    @RequestMapping("add ")
    public String add(Correctivemeasure correctivemeasure,Rectification rectification){
        //ID自增
        correctivemeasure.setCorrectivid(correctivemeasureMapper.increment());
        correctivemeasureMapper.insert(correctivemeasure);
        System.out.println(correctivemeasure);
        return "redirect:/archivesQuery";
    }
    @RequestMapping("queryid")
    public String queryid(String rno,Model model){


       /* Map<String,Object> list=correctivemeasureMapper.queryById(rno);

        model.addAttribute("correctivemeasure",list);*/
        Map<String,Object> re=correctivemeasureMapper.queryreid(rno);
        model.addAttribute("re",re);
        System.out.println(re);
        SupervisionInspection su=correctivemeasureMapper.querySuid(rno);
        model.addAttribute("su",su);
        System.out.println("su:"+su);
        Correctivemeasure corr=correctivemeasureMapper.querycorrid(rno);
        model.addAttribute("corr",corr);
        System.out.println("corr:"+corr);
        Exam em=correctivemeasureMapper.queryemid(rno);
        model.addAttribute("em",em);
        System.out.println("em:"+em);
        return "Recitiquallid";
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
    //跳转修改页面
    @RequestMapping("updateShow")
    public String updateShow(String correctivid,Model model){
      Correctivemeasure list=correctivemeasureMapper.selectByPrimaryKey(correctivid);
      model.addAttribute("list",list);
      return "correctivemeasureUpdate";
    }
    //执行修改语句
    @RequestMapping("update")
    public String update(Correctivemeasure correctivemeasure){
        correctivemeasureMapper.updateByPrimaryKey(correctivemeasure);
        System.out.println(correctivemeasure);
        return "redirect:/archivesQuery";
    }


}

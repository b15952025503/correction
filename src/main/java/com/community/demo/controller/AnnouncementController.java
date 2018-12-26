package com.community.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Announcement")
public class AnnouncementController {
    @RequestMapping("putAnnouncement")
    public  String putAnnouncement(){

        return "announcement";
    }

}

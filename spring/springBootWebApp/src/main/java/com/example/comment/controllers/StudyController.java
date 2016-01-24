package com.example.comment.controllers;

import com.example.comment.services.StudyService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by HSH on 2016. 1. 24..
 */
@Controller
public class StudyController {

    Logger log = Logger.getLogger(CommentController.class);

    @Autowired
    private StudyService studyService;

    @RequestMapping(value = "/studys", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("studys", studyService.listAllstudys());
        return "studys";
    }

    @RequestMapping("study/{studyId}")
    public String showComment(@PathVariable Integer studyId, Model model){
        model.addAttribute("study", studyService.getStudyById(studyId));
        return "studyshow";
    }

}

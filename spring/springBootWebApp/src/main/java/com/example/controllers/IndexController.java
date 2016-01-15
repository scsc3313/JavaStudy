package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HSH on 2016. 1. 13..
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    String index(){
        return "index";
    }
}

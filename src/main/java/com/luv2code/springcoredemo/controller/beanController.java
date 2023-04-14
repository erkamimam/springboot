package com.luv2code.springcoredemo.controller;

import com.luv2code.springcoredemo.bean.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class beanController {


    BeanConfig beanConfig;
    @Autowired
    public beanController(BeanConfig beanConfig) {
        this.beanConfig = beanConfig;
    }



    // http://localhost:8080/bean/beanDto
    @GetMapping("/bean/beanDto")
    @ResponseBody
    public String getBeanData() {
        return beanConfig.beanDto()+".";
    }

}

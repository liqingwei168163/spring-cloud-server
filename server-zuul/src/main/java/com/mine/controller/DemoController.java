package com.mine.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("serverZuul")
public class DemoController {

    @RequestMapping("findDemo")
    public String findOneServerDemo(){
        return "this is server-zuul function";
    }
}

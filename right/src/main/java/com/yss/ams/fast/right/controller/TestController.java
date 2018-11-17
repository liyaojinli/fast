package com.yss.ams.fast.right.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller("rightTestController")
@RequestMapping("/right")
public class TestController {


    @RequestMapping("/{name}")
    public String hello(@PathVariable("name") String name, Model model) {
        model.addAttribute("name",name);
        return "helloright";
    }


    @RequestMapping("/rest/{name}")
    @ResponseBody
    public String helloRest(@PathVariable("name") String name){
        return "hi, this is a rest response for :" + name;
    }
}

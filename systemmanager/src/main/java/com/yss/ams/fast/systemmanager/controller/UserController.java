package com.yss.ams.fast.systemmanager.controller;

import com.yss.ams.fast.systemmanager.entity.User;
import com.yss.ams.fast.systemmanager.interface4Feign.RightFeignService;
import com.yss.ams.fast.systemmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller("systemManagerUserController")
@RequestMapping("/systemmanager/user")
public class UserController {

    @Autowired
    private UserService service;

    @Autowired()
    private RestTemplate template;

    @Autowired
    private RightFeignService rightService;

    @RequestMapping("/find/{name}")
    public String findByName(@PathVariable("name") String name, Model model) {
        List<User> users = service.queryByName(name);
        model.addAttribute("users", users);
        return "userList";
    }

    @RequestMapping("/restRight/{name}")
    @ResponseBody
    public String restRight(@PathVariable("name") String name) {
        return template.getForObject("http://right/right/rest/{name}", String.class, name);
    }

    @RequestMapping("/restRightByFeign/{name}")
    @ResponseBody
    public String restFeign(@PathVariable("name") String name){
        return rightService.helloRest(name);
    }
}

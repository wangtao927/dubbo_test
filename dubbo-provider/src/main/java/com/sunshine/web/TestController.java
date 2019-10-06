package com.sunshine.web;


import com.sunshine.dubbo.api.UserService;
import com.sunshine.dubbo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {


    @Autowired
    UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public User test() {

        return userService.getUser(1);
    }

}

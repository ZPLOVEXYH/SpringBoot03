package com.spring.boot.controller;


import com.spring.boot.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/5/11.
 */
@Contro
public class DemoController {

    @Value("${server.port}")
    String serverPort;

    @Autowired
    User user;

    @RequestMapping("/")
    public String getDemoPort(){
        return "hello " + user.getName() + "xxx" + user.getAge();
    }
}

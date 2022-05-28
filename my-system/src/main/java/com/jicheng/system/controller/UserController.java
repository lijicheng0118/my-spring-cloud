package com.jicheng.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class UserController {

    @GetMapping("/getUsername")
    public String getUsername(){
        return "lijicheng";
    }
}

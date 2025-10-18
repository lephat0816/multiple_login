package com.example.multipleLogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String home(){
        return "index";
    }
    @GetMapping("/admin/login")
    public String adminLogin(){
        return "admin/admin_login";
    }
    @GetMapping("/user/login")
    public String userLogin(){
        return "user/user_login";
    }
    @GetMapping("/admin/home")
    public String adminHome(){
        return "admin/admin_home";
    }
    @GetMapping("/user/home")
    public String userHome(){
        return "user/user_home";
    }
    @PostMapping("/admin/login")
    public String adminLoginPost(){
        return "admin/admin_home";
    }
    @PostMapping("/user/login")
    public String userLoginPost(){
        return "user/user_home";
    }
}

package com.bittsoftware.springsecuritysocialauth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class SocialLoginResource {

    @GetMapping
    public String getHomePage(){
        return "index";
    }
}

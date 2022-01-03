package com.loginserverboot.loginserverboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
//        return "/WEB-INF/views/index.jsp";
        return "index";
    }

    @GetMapping("/join")
    public String join() {
        return "join";
    }

    @GetMapping("/main")
    public String main() {
        return "main";
    }

    @GetMapping("/header")
    public String header() {
        return "header";
    }

    @GetMapping("/footer")
    public String footer() {
        return "footer";
    }

}

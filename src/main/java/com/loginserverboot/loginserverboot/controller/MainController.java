package com.loginserverboot.loginserverboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        System.out.println("[현재위치] index" );
        return "index";
    }

    @GetMapping("/join")
    public String join() {
        System.out.println("[현재위치] join" );
        return "join";
    }

    @GetMapping("/main")
    public String main() {
        System.out.println("[현재위치] main" );
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

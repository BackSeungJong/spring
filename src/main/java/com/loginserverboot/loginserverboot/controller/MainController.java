package com.loginserverboot.loginserverboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        System.out.println("[현재위치] index" );
        return "main";
    }

    @GetMapping("/board")
    public String board() {
        System.out.println("[현재위치] board" );
        return "board";
    }

    @GetMapping("/join")
    public String join() {
        System.out.println("[현재위치] join" );
        return "join";
    }
}

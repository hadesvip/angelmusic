package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangyong on 16-10-24.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String Home() {
        return "hello,springboot...";
    }
}

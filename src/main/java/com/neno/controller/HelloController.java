package com.neno.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author root
 * @Date 2020/9/23 19:49
 */
@RestController
public class HelloController {

    @RequestMapping("/index")
    public String index(){
        return "welcome to eureka center";
    }

}

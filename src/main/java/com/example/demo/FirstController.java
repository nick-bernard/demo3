package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nick on Nov 13, 2020
 */

@RestController
public class FirstController {

    @RequestMapping("/")
    public String hello(){
        return "Hello Spring";
    }
}

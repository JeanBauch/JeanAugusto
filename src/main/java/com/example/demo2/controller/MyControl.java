package com.example.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * MyControl
 */
@Controller
public class MyControl {

    @GetMapping("/hello")
    public String hello()
    {
        return "myView";
    }




}
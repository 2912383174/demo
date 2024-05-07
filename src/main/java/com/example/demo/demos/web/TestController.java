package com.example.demo.demos.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    /**
     * 测试视图解析器
     */
    @RequestMapping("/hello")
    public String hello(Model model) {
        String name = "时空";
        model.addAttribute("name", name);
        return "hello";
    }
}
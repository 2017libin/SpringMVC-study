package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EncodingController {
    @PostMapping("/t1")
    public String test(Model model, String name){
        // 获取表单提交的值
        model.addAttribute("msg",name);
        // 跳转到test页面显示输入的值
        return "test";
    }
}
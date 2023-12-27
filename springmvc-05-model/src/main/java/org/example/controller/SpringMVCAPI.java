package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringMVCAPI {
    @RequestMapping("/k1/t1")
    public String test(Model model){
        model.addAttribute("msg","ResultSpringMVC1");
        // 转发
        return "/WEB-INF/jsp/test.jsp";
    }

    @RequestMapping("/k1/t2")
    public String test2(Model model){
        // 转发2
        model.addAttribute("msg","ResultSpringMVC2");
        return "forward:/WEB-INF/jsp/test.jsp";
    }

    @RequestMapping("/k1/t3")
    public String test3(Model model){
        // 重定向
        model.addAttribute("msg","ResultSpringMVC3");
        return "redirect:/index.jsp";
    }

    @RequestMapping("/k1/t4")
    public String test4(Model model){
        // 转发
        model.addAttribute("msg","ResultSpringMVC4");
        // 配合视图解析器，实际转发地址为 /WEB-INF/jsp/test.jsp
        return "test";
    }
}
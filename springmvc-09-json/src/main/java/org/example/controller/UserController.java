package org.example.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class UserController {
    @RequestMapping(value = "/j1",produces = "application/json;charset=utf-8")
//    @ResponseBody
    public String json1() throws JsonProcessingException {
        // 创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        // 创建一个对象
        User user = new User("哇哈哈4号", 22, "man");
        // 将对象解析成为json格式
        String str = mapper.writeValueAsString(user);
        // 由于@ResponseBody注解，这里会将str转成json格式返回；十分方便
        return str;
    }
}
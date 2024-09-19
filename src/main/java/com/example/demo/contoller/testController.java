package com.example.demo.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController //跨域
@RequestMapping("/test") //请求
public class testController {   
    //参数
    @GetMapping("/{id}")
    public String getMethodName(@PathVariable Integer id) {
        System.out.println(id);
        return new String();
    }
    
    
}

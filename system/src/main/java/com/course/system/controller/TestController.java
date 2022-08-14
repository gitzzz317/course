package com.course.system.controller;

import com.course.server.domain.Test;
import com.course.server.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;
    
    @RequestMapping("/list")
    public List<Test> list(){
        return testService.list();
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello!";
    }
}

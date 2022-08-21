package com.course.file.controller.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadController {



    @GetMapping("/hello")
    public String hello(){
        return "hello!";
    }
}

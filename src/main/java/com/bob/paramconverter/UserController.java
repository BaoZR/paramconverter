package com.bob.paramconverter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class   UserController {
    @GetMapping("/hello")
    public Date hello(Date date){
        return date;
    }
}

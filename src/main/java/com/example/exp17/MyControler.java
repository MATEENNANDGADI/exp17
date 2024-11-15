package com.example.exp17;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyControler {

    @GetMapping("/")
    public String printit(){
        return "HELLO WORLD  !!";
    }
}

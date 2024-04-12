package ru.maxima.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class SecondController {

    @GetMapping("/hello")
    public String sayHello() {
        return "second/hello-world-view-second";
    }
}

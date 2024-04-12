package ru.maxima.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//  localhost:8080


@Controller
@RequestMapping("/first")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "first/hello-world-view-first";
    }

    @GetMapping("/pavel")
    public String callPavel() {
        return "pavel-kozlovskiy";
    }

    @GetMapping("/sergey")
    public String callSergey() {
        return "sergey-vlasov";
    }

    @GetMapping("/tagir")
    public String callTagir() {
        return "tagir";
    }

}

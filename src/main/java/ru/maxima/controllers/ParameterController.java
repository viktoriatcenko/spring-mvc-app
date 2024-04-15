package ru.maxima.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/test")
public class ParameterController {

    @GetMapping("/hello")
    public String getParameters(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");

        if (name == null) name = "User";
        if (lastname == null) lastname = "User";

        model.addAttribute("message", "Hello, " + name + " " + lastname + "! ");

        return "hello";
    }

    @GetMapping("/weather")
    public String getWeather(@RequestParam(value = "country", required = false) String country,
                             @RequestParam(value = "city", required = false) String city,
                             Model model) {

        model.addAttribute("weather", "Today in the " + country +
                " " + city + " weather is good");


        return "weather";
    }
}

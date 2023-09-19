package org.lesson.spring_pizza.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalTime;

@Controller
@RequestMapping()
public class MainController {

    @GetMapping
    public String index() {
        return "home";
    }

    @GetMapping("/pizza")
    public String about() {
        return "about";
    }

    @Controller
    @RequestMapping("/")
    public class GreetingController {

        @GetMapping("/greeting")
        public String greeting(@RequestParam(name = "name") String name, Model model) {
            model.addAttribute("name", name);
            model.addAttribute("time", LocalTime.now());
            return "greeting";
        }

    }
}



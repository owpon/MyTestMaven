package com.ziv.mypra.web;

import com.ziv.mypra.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//   
@Controller
public class GreetingWebApi {
    @Autowired
    private GreetingService greetingService;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return greetingService.greeting("test");
    }
}

package com.uby.layout.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        String page = "home";
        model.addAttribute("page", page);
        return "index";
    }
    
    @RequestMapping("/{page}")
    public String page(Model model, @PathVariable(name = "page") String page) {
        model.addAttribute("page", page);
        return "index";
    }
}

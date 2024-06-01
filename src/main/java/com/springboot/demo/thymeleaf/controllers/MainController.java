package com.springboot.demo.thymeleaf.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.demo.thymeleaf.model.FormAction;
import com.springboot.demo.thymeleaf.model.User;

@Controller
public class MainController {

    @GetMapping("/")
    public String hello(Model model) {
        User adminUser = new User("John", "Doe", "jd@demo.com", "Admin");
        User regularUser = new User("James", "Bones", "bj@demo.com", "Regular");
        List<User> users = Arrays.asList(adminUser, regularUser, new User("Lance", "Hays", "lh@demo.com", "Regular"), new User("Kate", "Mottes", "km@demo.com", "User"));

        model.addAttribute("message", "Hello There!");
        model.addAttribute("adminUser", adminUser);
        model.addAttribute("regularUser", regularUser);
        model.addAttribute("users", users);

        return "index";
    }

    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("formAction", new FormAction());
        return "formentry";
    }

    @PostMapping("/formAction")
    public String formSubmit(@ModelAttribute FormAction formAction, Model model) {
        model.addAttribute("result", formAction);
        return "formresult";
    }

}

package com.example.awssitelab.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping(path = "/app")
    public String handle(Model model) {
        return "index.html";
    }

}

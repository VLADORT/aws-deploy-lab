package com.example.awssitelab.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping(path = "/")
    public String handle(Model model) throws ParseException {
        model.addAttribute("day", getDay());
        return "test";
    }
    @GetMapping(path = "/app")
    public String getSite(Model model) throws ParseException {
        return "index";
    }

    public String getDay() {
        Date now = new Date();
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        return simpleDateformat.format(now);
    }
}

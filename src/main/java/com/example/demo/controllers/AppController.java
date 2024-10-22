package com.example.demo.controllers;


import com.example.demo.models.Application;
import com.example.demo.services.AppService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/apps")
@AllArgsConstructor
public class AppController {
    private AppService appService;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to the club buddy!";
    }


    @GetMapping("/all-app")
    public List<Application> allApplications() {
        return appService.allApplications();
    }

    @GetMapping("/{id}")
    public Application applicationById(@PathVariable  int id) {
        return appService.applicationById(id);
    }
}

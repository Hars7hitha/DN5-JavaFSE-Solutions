package com.cognizant.orm_learn.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping
    public String test() {
        return "Controller is working!";
    }
}
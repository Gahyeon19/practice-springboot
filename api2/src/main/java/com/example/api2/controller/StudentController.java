package com.example.api2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping
    public String getAllStudents() {
        return "Get All Students";
    }

    @PostMapping
    public String addStudent() {
        return "Add Student";
    }

    @PutMapping
    public String updateStudent() {
        return "Update Student";
    }

}

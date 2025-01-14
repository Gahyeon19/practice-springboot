package com.example.api2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping    //method : get
    public String helloGet(@RequestParam(required = true, defaultValue = "world") String msg) {      //  '/hello?msg=hello'
        return "(GET) query parameter = " + msg;
        //ex) localhost:8080/hello   => (GET) query parameter = world
    }

    @GetMapping("/{msg}")    //method : get
    public String helloPathvar(@PathVariable String msg) {      //  '/hello/{msg}
        return "(GET) path variable = " + msg;
        //ex) localhost:8080/hello?msg=hello   => (GET) path variable = hello
        //ex) localhost:8080/hello/world       => (GET) path variable = world
    }

//    @PostMapping    //method : post
//    public String helloPost(@RequestParam String name, @RequestParam int age) {
//        return "(POST) name = " + name + ", age = " + age;
//    }

    @PostMapping    //method : post
    public String helloPost(@RequestBody Person person) {
        return "(POST) name = " + person.getName() + ", age = " + person.getAge();
        //raw > json형식 > {"name":"HONG", "age":30}
        //localhost:8080/hello    => (POST) name = HONG, age = 30
    }

    @PutMapping     //method : put
    public String helloPut(@ModelAttribute Person person) {
        return "(PUT) name = " + person.getName() + ", age = " + person.getAge();
    }

    @PatchMapping   //method : patch
    public String helloPatch() {
        return "Hello, World! (PATCH)";
    }

    @DeleteMapping  //method : delete
    public String helloDelete() {
        return "Hello, World! (DELETE)";
    }

}

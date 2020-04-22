package com.cardinalhealth.angulartutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(path="/api")
public class AngularController {

    @GetMapping(path="/api/hello-world")
    public String sayHello(){
        return "Hello World from Tomcat!";
    }

    @RequestMapping({"/dashboard"})
    public String forwardToClient(){
        return "forward:/index.html";
    }
}

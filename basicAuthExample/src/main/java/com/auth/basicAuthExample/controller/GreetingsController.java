package com.auth.basicAuthExample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/greetings")
public class GreetingsController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello Adrián!");
    }


    @GetMapping("/bye")
    public ResponseEntity<String> sayBye(){
        return ResponseEntity.ok("Bye Adrián!");
    }
}

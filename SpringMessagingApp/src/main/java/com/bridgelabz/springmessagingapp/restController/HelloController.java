package com.bridgelabz.springmessagingapp.restController;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String getHello() {
        return "Hello from BridgeLabz - GET Method";
    }

    @PostMapping
    public String postHello() {
        return "Hello from BridgeLabz - POST Method";
    }

    @PutMapping
    public String putHello() {
        return "Hello from BridgeLabz - PUT Method";
    }

    @DeleteMapping
    public String deleteHello() {
        return "Hello from BridgeLabz - DELETE Method";
    }
}


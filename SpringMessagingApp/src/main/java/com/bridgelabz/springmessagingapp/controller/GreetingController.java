package com.bridgelabz.springmessagingapp.controller;


import com.bridgelabz.springmessagingapp.service.GreetingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/param")
    public String getGreeting(
        @RequestParam(required = false) String firstName,
        @RequestParam(required = false) String lastName) {
        
        return greetingService.getGreeting(firstName, lastName);
    }

    @GetMapping("/param/{name}") // UC3
    public String getGreetingWithPath(@PathVariable String name) { // UC3
        return "{\"message\": \"Hello, " + name + " from BridgeLabz!\"}"; // UC3
    }
}

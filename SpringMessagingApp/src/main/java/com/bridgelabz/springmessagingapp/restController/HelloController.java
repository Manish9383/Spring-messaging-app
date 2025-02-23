package com.bridgelabz.springmessagingapp.restController;


import org.springframework.web.bind.annotation.*;
import com.bridgelabz.springmessagingapp.dto.UserDTO; 

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
    
  //UC2
    @GetMapping("/query") 
    public String getHelloWithQuery(@RequestParam String name) { //UC2
        return "Hello " + name + " from BridgeLabz"; //UC2
    }
    
  //UC3
    
    @GetMapping("/param/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    
    
    // UC4 - POST request with UserDTO
    @PostMapping("/post") // UC4
    public String postHelloWithBody(@RequestBody UserDTO user) { // UC4
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz"; // UC4
    }
    
    
    
}


package com.bridgelabz.springmessagingapp.service;


import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getGreeting(String firstName, String lastName) {
        if (firstName != null && !firstName.isEmpty() && lastName != null && !lastName.isEmpty()) {
            return "{\"message\": \"Hello, " + firstName + " " + lastName + "!\"}";
        } else if (firstName != null && !firstName.isEmpty()) {
            return "{\"message\": \"Hello, " + firstName + "!\"}";
        } else if (lastName != null && !lastName.isEmpty()) {
            return "{\"message\": \"Hello, " + lastName + "!\"}";
        } else {
            return "{\"message\": \"Hello, World!\"}";
        }
    }
}

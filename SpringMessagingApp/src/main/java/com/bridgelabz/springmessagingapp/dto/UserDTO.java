package com.bridgelabz.springmessagingapp.dto;

// UC4 - DTO class for user data
public class UserDTO {
    private String firstName;
    private String lastName;

    public String getFirstName() { // UC4
        return firstName; // UC4
    }

    public void setFirstName(String firstName) { // UC4
        this.firstName = firstName; // UC4
    }

    public String getLastName() { // UC4
        return lastName; // UC4
    }

    public void setLastName(String lastName) { // UC4
        this.lastName = lastName; // UC4
    }
}

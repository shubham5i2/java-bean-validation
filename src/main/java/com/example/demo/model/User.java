package com.example.demo.model;

import com.example.demo.validation.annotation.UserName;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class User {

    @NotNull(message = "Name cannot be null")
    @UserName
    private String name;

    private boolean working;

    @Size(min = 10, max = 200, message = "About Me must be between 10 and 200 characters")
    private String aboutMe;

    @Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 150, message = "Age should not be greater than 150")
    private int age;

    @Email(message = "Email should be valid")
    private String email;
}

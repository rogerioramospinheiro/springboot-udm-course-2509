package com.winvisage.rest.webservices.restful_web_services.user;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private Integer id;
    @Size(min=2, message = "Name should have at least 2 characters")
    private String name;
    @Past(message = "Birth data should be in the past")
    private LocalDate birthDate;
}

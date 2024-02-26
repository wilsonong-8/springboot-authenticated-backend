package com.example.AuthenticatedBackend.controllers;

import com.example.AuthenticatedBackend.models.ApplicationUser;
import com.example.AuthenticatedBackend.models.LoginResponseDTO;
import com.example.AuthenticatedBackend.models.RegistrationDTO;
import com.example.AuthenticatedBackend.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin("*")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/register")
    public ApplicationUser registerUser(@RequestBody RegistrationDTO body) {
        return authenticationService.registerUser(body.getUsername(), body.getPassword());
    }

    @PostMapping("/login")
    public LoginResponseDTO loginUser(@RequestBody RegistrationDTO body) {
        return authenticationService.loginUser(body.getUsername(),body.getPassword());
    }
}

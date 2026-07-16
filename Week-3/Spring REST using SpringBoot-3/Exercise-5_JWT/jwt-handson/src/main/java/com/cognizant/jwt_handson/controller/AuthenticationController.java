package com.cognizant.jwt_handson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.jwt_handson.model.AuthenticationResponse;
import com.cognizant.jwt_handson.util.JwtUtil;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate() {

        String token = jwtUtil.generateToken("user");

        return new AuthenticationResponse(token);
    }
}
package com.example.close2bookingapi.controllers;

import lombok.AllArgsConstructor;

import java.net.URI;
import java.util.List;
import com.example.close2bookingapi.entities.User;
import com.example.close2bookingapi.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
@AllArgsConstructor
@CrossOrigin(
        origins = CorsConfiguration.ALL,
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE}
)
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public ResponseEntity<User> getFirst() {
        return ResponseEntity.ok().body(userService.getFirst());
    }
}

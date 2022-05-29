package com.example.close2whatsappapi.controllers;

import lombok.AllArgsConstructor;

import java.net.URI;
import java.util.List;

import com.example.close2whatsappapi.dto.ChatDTO;
import com.example.close2whatsappapi.dto.UserDTO;
import com.example.close2whatsappapi.dto.UserNewDTO;
import com.example.close2whatsappapi.entities.Chat;
import com.example.close2whatsappapi.entities.User;
import com.example.close2whatsappapi.services.ChatService;
import com.example.close2whatsappapi.services.UserService;
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

    @Autowired
    private ChatService chatService;

    @GetMapping("/user")
    public ResponseEntity<List<User>> getAll() {
        List<User> users = userService.findAll();

        return ResponseEntity.ok().body(users);
    }

    @GetMapping("/user/{email}")
    public ResponseEntity<UserDTO> getByEmail(@PathVariable String email) {
        UserDTO user = userService.findByEmail(email);

        if (user == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/user")
    public ResponseEntity<Void> insert(@RequestBody UserNewDTO user) {
        User createdUser = userService.insert(user);

        URI location = ServletUriComponentsBuilder
            .fromCurrentRequest()
            .path("/{id}")
            .buildAndExpand(createdUser.getId())
            .toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping("/user/{id}/chat")
    public ResponseEntity<List<ChatDTO>> getAllFromUser(@PathVariable Integer id) {
        List<ChatDTO> chat = chatService.getAllFromUser(id);

        return ResponseEntity.ok().body(chat);
    }
}

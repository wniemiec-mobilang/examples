package com.example.close2whatsappapi.controllers;

import lombok.AllArgsConstructor;

import java.net.URI;
import java.util.List;

import com.example.close2whatsappapi.dto.ChatDTO;
import com.example.close2whatsappapi.dto.ChatNewDTO;
import com.example.close2whatsappapi.dto.ChatUsersDTO;
import com.example.close2whatsappapi.dto.MessageNewDTO;
import com.example.close2whatsappapi.dto.UserDTO;
import com.example.close2whatsappapi.dto.UserNewDTO;
import com.example.close2whatsappapi.entities.Chat;
import com.example.close2whatsappapi.entities.Message;
import com.example.close2whatsappapi.services.ChatService;
import com.example.close2whatsappapi.services.MessageService;
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
public class ChatController {
    
    @Autowired
    private ChatService chatService;

    @Autowired
    private MessageService messageService;

    @GetMapping("/chat/{id}")
    public ResponseEntity<List<Message>> getAllMessages(@PathVariable Integer id) {
        List<Message> chat = messageService.getAllMessages(id);

        return ResponseEntity.ok().body(chat);
    }

    @GetMapping("/chat/{id}/users")
    public ResponseEntity<ChatUsersDTO> getAllUsersFromChat(@PathVariable Integer id) {
        ChatUsersDTO chat = chatService.getAllUsersFromChat(id);

        return ResponseEntity.ok().body(chat);
    }

    @PostMapping("/chat")
    public ResponseEntity<Void> insert(@RequestBody ChatNewDTO newChat) {
        if (chatService.has(newChat)) {
            return ResponseEntity.badRequest().build();
        }

        Chat createdChat = chatService.insert(newChat);

        URI location = ServletUriComponentsBuilder
                    .fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(createdChat.getId())
                    .toUri();

        return ResponseEntity.created(location).build();
    }

    @PostMapping("/chat/{id}")
    public ResponseEntity<Void> insertMessage(@PathVariable Integer id, @RequestBody MessageNewDTO message) {
        message.setChatId(id);
        messageService.insert(message);

        return ResponseEntity.ok().build();
    }
}

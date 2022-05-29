package com.example.close2whatsappapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.close2whatsappapi.dto.ChatDTO;
import com.example.close2whatsappapi.dto.ChatNewDTO;
import com.example.close2whatsappapi.dto.ChatUsersDTO;
import com.example.close2whatsappapi.dto.MessageNewDTO;
import com.example.close2whatsappapi.dto.UserDTO;
import com.example.close2whatsappapi.dto.UserNewDTO;
import com.example.close2whatsappapi.entities.Chat;
import com.example.close2whatsappapi.entities.User;
import com.example.close2whatsappapi.repositories.ChatRepository;
import com.example.close2whatsappapi.repositories.UserRepository;

@Service
@AllArgsConstructor
public class ChatService {
    
    @Autowired
    private ChatRepository chatRepository;

    @Autowired
    private UserService userService;

    public List<ChatDTO> getAllFromUser(Integer id) {
        User user = userService.findById(id);
        List<ChatDTO> chat = chatRepository
            .findByUser1(user)
            .stream()
            .map(c -> new ChatDTO(c, userService.findById(c.getUser2().getId())))
            .collect(Collectors.toList());

        chat.addAll(
            chatRepository
                .findByUser2(user)
                .stream()
                .map(c -> new ChatDTO(c, userService.findById(c.getUser1().getId())))
                .collect(Collectors.toList())
        );

        return chat;
    }

    public Chat insert(ChatNewDTO chat) {
        Chat newChat = chat.toChat();
        return chatRepository.save(newChat);
    }

    public void updateNewMessage(MessageNewDTO msg) {
        Chat chat = chatRepository.findById(msg.getChatId()).get();

        chat.setLastMessage(msg.getBody());
        chat.setLastMessageDate(new Date());

        chatRepository.save(chat);
    }

    public ChatUsersDTO getAllUsersFromChat(Integer id) {
        Chat chat = chatRepository.findById(id).orElse(null);

        if (chat == null) {
            return null;
        }

        return new ChatUsersDTO(chat.getUser1(), chat.getUser2());
    }

    public boolean has(ChatNewDTO newChat) {
        Chat nChat = newChat.toChat();
        return !chatRepository.findByUser1AndUser2(nChat.getUser1(), nChat.getUser2()).isEmpty();
    }
}
package com.example.close2whatsappapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import java.util.List;
import java.util.stream.Collectors;

import com.example.close2whatsappapi.dto.MessageNewDTO;
import com.example.close2whatsappapi.dto.UserDTO;
import com.example.close2whatsappapi.dto.UserNewDTO;
import com.example.close2whatsappapi.entities.Chat;
import com.example.close2whatsappapi.entities.Message;
import com.example.close2whatsappapi.entities.User;
import com.example.close2whatsappapi.repositories.MessageRepository;
import com.example.close2whatsappapi.repositories.UserRepository;

@Service
@AllArgsConstructor
public class MessageService {
    
    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private ChatService chatService;

    public List<Message> getAllMessages(Integer chatId) {
        return messageRepository.findByChat(new Chat(chatId, null, null, null, null));
    }

    public void insert(MessageNewDTO msg) {
        messageRepository.save(msg.toMessage());
        chatService.updateNewMessage(msg);
    }
}
package com.example.close2whatsappapi.dto;

import java.io.Serializable;
import java.util.Date;

import com.example.close2whatsappapi.entities.Chat;
import com.example.close2whatsappapi.entities.Message;
import com.example.close2whatsappapi.entities.User;

public class MessageNewDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer chatId;
    private Integer author;
    private String body;
    private String type;
    
    public MessageNewDTO() {
        
    }

    public MessageNewDTO(Integer author, String body, String type) {
        this.author = author;
        this.body = body;
        this.type = type;
    }

    public Message toMessage() {
        return new Message(
            new Chat(chatId, null, null, null, null),
            new User(author, null, null, null),
            body,
            new Date(),
            type
        );
    }

    public Integer getChatId() {
        return chatId;
    }
    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }
    public Integer getAuthor() {
        return author;
    }
    public void setAuthor(Integer author) {
        this.author = author;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    

    
}

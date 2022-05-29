package com.example.close2whatsappapi.dto;

import java.io.Serializable;
import java.util.Date;

import com.example.close2whatsappapi.entities.Chat;
import com.example.close2whatsappapi.entities.User;

public class MessageDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Chat chatId;
    private User author;
    private String body;
    private Date date;
    private String type;
    
    public MessageDTO() {

    }

    public MessageDTO(Chat chatId, User author, String body, Date date, String type) {
        this.chatId = chatId;
        this.author = author;
        this.body = body;
        this.date = date;
        this.type = type;
    }

    public Chat getChatId() {
        return chatId;
    }
    public void setChatId(Chat chatId) {
        this.chatId = chatId;
    }
    public User getAuthor() {
        return author;
    }
    public void setAuthor(User author) {
        this.author = author;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    
}

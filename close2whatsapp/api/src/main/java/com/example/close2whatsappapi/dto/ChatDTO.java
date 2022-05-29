package com.example.close2whatsappapi.dto;

import java.io.Serializable;
import java.util.Date;

import com.example.close2whatsappapi.entities.Chat;
import com.example.close2whatsappapi.entities.User;

public class ChatDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String lastMessage;
    private Date lastMessageDate;
    private User person;

    public ChatDTO() {
        
    }

    public ChatDTO(Integer id, String lastMessage, Date lastMessageDate, User person) {
        this.id = id;
        this.lastMessage = lastMessage;
        this.lastMessageDate = lastMessageDate;
        this.person = person;
    }

    public ChatDTO(Chat c, User user) {
        id = c.getId();
        lastMessage = c.getLastMessage();
        lastMessageDate = c.getLastMessageDate();
        person = user;
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getLastMessage() {
        return lastMessage;
    }


    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }


    public Date getLastMessageDate() {
        return lastMessageDate;
    }


    public void setLastMessageDate(Date lastMessageDate) {
        this.lastMessageDate = lastMessageDate;
    }


    public User getPerson() {
        return person;
    }


    public void setPerson(User person) {
        this.person = person;
    }
 
}

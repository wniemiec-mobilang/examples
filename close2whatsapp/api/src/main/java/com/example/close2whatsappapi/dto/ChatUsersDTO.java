package com.example.close2whatsappapi.dto;

import java.io.Serializable;

import com.example.close2whatsappapi.entities.User;

public class ChatUsersDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private User user1;
    private User user2;

    public ChatUsersDTO() { }

    public ChatUsersDTO(User user1, User user2) {
        this.user1 = user1;
        this.user2 = user2;
    }
    public User getUser1() {
        return user1;
    }
    public void setUser1(User user1) {
        this.user1 = user1;
    }
    public User getUser2() {
        return user2;
    }
    public void setUser2(User user2) {
        this.user2 = user2;
    }
    
    
}

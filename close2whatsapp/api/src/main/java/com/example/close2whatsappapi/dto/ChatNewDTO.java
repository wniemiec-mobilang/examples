package com.example.close2whatsappapi.dto;

import java.io.Serializable;
import java.util.Date;

import com.example.close2whatsappapi.entities.Chat;
import com.example.close2whatsappapi.entities.User;

public class ChatNewDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer user1;
    private Integer user2;

    public ChatNewDTO() {
        
    }

    

    public ChatNewDTO(Integer user1, Integer user2) {
        this.user1 = user1;
        this.user2 = user2;
    }

    public Chat toChat() {
        return new Chat(
            null, 
            null, 
            null, 
            new User(user1, null, null, null), 
            new User(user2, null, null, null)
        );
    }

    public Integer getUser1() {
        return user1;
    }


    public void setUser1(Integer user1) {
        this.user1 = user1;
    }


    public Integer getUser2() {
        return user2;
    }


    public void setUser2(Integer user2) {
        this.user2 = user2;
    }



    
}

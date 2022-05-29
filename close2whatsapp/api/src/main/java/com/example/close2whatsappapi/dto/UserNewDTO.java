package com.example.close2whatsappapi.dto;

import java.io.Serializable;

public class UserNewDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String avatar;
    private String email;
    private String name;
   
    
    public UserNewDTO() {
    }


    public UserNewDTO(String avatar, String email, String name) {
        this.avatar = avatar;
        this.email = email;
        this.name = name;
    }




    public String getAvatar() {
        return avatar;
    }




    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }




    public String getEmail() {
        return email;
    }




    public void setEmail(String email) {
        this.email = email;
    }




    public String getName() {
        return name;
    }




    public void setName(String name) {
        this.name = name;
    }
    
    
}

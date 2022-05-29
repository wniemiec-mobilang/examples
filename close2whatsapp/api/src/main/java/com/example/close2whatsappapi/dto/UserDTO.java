package com.example.close2whatsappapi.dto;

import java.io.Serializable;

import com.example.close2whatsappapi.entities.User;

public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String avatar;
    private String email;
    private String name;
   
    
    public UserDTO() {
    }


    public UserDTO(User user) {
        id = user.getId();
        avatar = user.getAvatar();
        email = user.getEmail();
        name = user.getName();
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
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

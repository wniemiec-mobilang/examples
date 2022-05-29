package com.example.close2whatsappapi.entities;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne
    private Chat chat;

    @ManyToOne
    private User author;
    
    @Column(nullable = true, columnDefinition = "text")
    private String body;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private String type;

    public Message() {
        
    }

    public Message(Chat chatId, User author, String body, Date date, String type) {
        this.chat = chatId;
        this.author = author;
        this.body = body;
        this.date = date;
        this.type = type;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chatId) {
        this.chat = chatId;
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

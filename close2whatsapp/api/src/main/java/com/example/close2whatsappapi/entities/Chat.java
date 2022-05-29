package com.example.close2whatsappapi.entities;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;


@Entity
public class Chat implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = true)
    private String lastMessage;

    @Column(nullable = true)
    private Date lastMessageDate;

    @JsonIgnore
    @ManyToOne
    private User user1;

    @ManyToOne
    private User user2;

    public Chat() {
    }

    public Chat(Integer id, String lastMessage, Date lastMessageDate, User user1, User user2) {
        this.id = id;
        this.lastMessage = lastMessage;
        this.lastMessageDate = lastMessageDate;
        this.user1 = user1;
        this.user2 = user2;
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

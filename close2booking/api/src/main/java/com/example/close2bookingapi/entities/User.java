package com.example.close2bookingapi.entities;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer level;

    @OneToMany
    List<Review> reviews;

    @OneToMany
    List<Stay> favorites;

    public User() {
        reviews = new ArrayList<>();
        favorites = new ArrayList<>();
    }

    public User(Integer id, String name, Integer level) {
        this();
        this.id = id;
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public List<Stay> getFavorites() {
        return favorites;
    }
}

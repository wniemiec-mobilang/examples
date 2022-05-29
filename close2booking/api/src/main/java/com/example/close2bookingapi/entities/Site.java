package com.example.close2bookingapi.entities;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Site implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String name;
    
    private String type;


    private String image;

    @OneToMany
    private List<Stay> stays;

    public Site() {
        stays = new ArrayList<>();
    }

    public Site(Integer id, String name, String type, String image) {
        this();
        this.id = id;
        this.name = name;
        this.type = type;
        this.image = image;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Stay> getStays() {
        return stays;
    }

    public void setStays(List<Stay> stays) {
        this.stays = stays;
    }
    
    
}

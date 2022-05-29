package com.example.close2bookingapi.entities;

import javax.persistence.Entity;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Stay implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String location;

    private String image;

    private Boolean eco;
    private Boolean breakfast;

    private Boolean mobile;

    private Integer totalBeds;

    private Double oldPrice;

    private Double newPrice;

    private Double fee;
    private String priceDescription;

    private String roomType;

    @OneToMany
    private List<Review> reviews;



    public Stay() {
    }

    public Stay(Integer id, String name, String location, String image, Boolean eco, Boolean breakfast, Boolean mobile,
            Integer totalBeds, Double oldPrice, Double newPrice, Double fee, String priceDescription, String roomType
            ) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.image = image;
        this.eco = eco;
        this.breakfast = breakfast;
        this.mobile = mobile;
        this.totalBeds = totalBeds;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
        this.fee = fee;
        this.priceDescription = priceDescription;
        this.roomType = roomType;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getEco() {
        return eco;
    }

    public void setEco(Boolean eco) {
        this.eco = eco;
    }

    public Boolean getMobile() {
        return mobile;
    }

    public void setMobile(Boolean mobile) {
        this.mobile = mobile;
    }

    public Integer getTotalBeds() {
        return totalBeds;
    }

    public void setTotalBeds(Integer totalBeds) {
        this.totalBeds = totalBeds;
    }

    public Double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(Double newPrice) {
        this.newPrice = newPrice;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public String getPriceDescription() {
        return priceDescription;
    }

    public void setPriceDescription(String priceDescription) {
        this.priceDescription = priceDescription;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Boolean getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Boolean breakfast) {
        this.breakfast = breakfast;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    
}

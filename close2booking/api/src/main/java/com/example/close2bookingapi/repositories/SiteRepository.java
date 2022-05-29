package com.example.close2bookingapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.close2bookingapi.entities.Site;


public interface SiteRepository extends JpaRepository<Site, Integer> {
 
    List<Site> findAllByType(String type);
}

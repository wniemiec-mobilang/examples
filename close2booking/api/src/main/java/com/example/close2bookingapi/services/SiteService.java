package com.example.close2bookingapi.services;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import com.example.close2bookingapi.entities.Site;
import com.example.close2bookingapi.entities.User;
import com.example.close2bookingapi.repositories.SiteRepository;
import com.example.close2bookingapi.repositories.UserRepository;

@Service
@AllArgsConstructor
public class SiteService {
    
    @Autowired
    private SiteRepository siteRepository;

    public List<Site> getAllWithType(String type) {
        return siteRepository.findAllByType(type);
    }

    public Site get(Integer id) {
        return siteRepository.findById(id).orElse(null);
    }
}

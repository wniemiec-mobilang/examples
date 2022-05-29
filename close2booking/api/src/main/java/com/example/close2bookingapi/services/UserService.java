package com.example.close2bookingapi.services;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import com.example.close2bookingapi.entities.User;
import com.example.close2bookingapi.repositories.UserRepository;

@Service
@AllArgsConstructor
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public User getFirst() {
        return userRepository.findAll().get(0);
    }
}

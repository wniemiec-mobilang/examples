package com.example.close2whatsappapi.services;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
import com.example.close2whatsappapi.dto.UserDTO;
import com.example.close2whatsappapi.dto.UserNewDTO;
import com.example.close2whatsappapi.entities.User;
import com.example.close2whatsappapi.repositories.UserRepository;

@Service
@AllArgsConstructor
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> getAll() {
        return userRepository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
    }

    public User insert(UserNewDTO user) {
        return userRepository.save(new User(null, user.getAvatar(), user.getEmail(), user.getName()));
    }

    public UserDTO findByEmail(String email) {
        User user = userRepository.findByEmail(email);
        
        if (user == null) {
            return null;
        }

        return new UserDTO(user);
    }

    public User findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}

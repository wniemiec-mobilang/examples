package com.example.close2whatsappapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

import com.example.close2whatsappapi.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
    User findByEmail(String email);
}

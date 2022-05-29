package com.example.close2whatsappapi.repositories;

import java.util.List;

import com.example.close2whatsappapi.entities.Chat;
import com.example.close2whatsappapi.entities.Message;
import com.example.close2whatsappapi.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer> {
 
    List<Message> findByChat(Chat chat);
}

package com.example.close2whatsappapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.close2whatsappapi.entities.Chat;
import com.example.close2whatsappapi.entities.User;


@Repository
public interface ChatRepository extends JpaRepository<Chat, Integer> {
    
    /*@Query(
        "SELECT DISTINCT c " +
        "FROM Chat c " +
        "INNER JOIN c.user u " +
        "WHERE  u.id = :userId "
    )
    List<Chat> findAllByUserId(@Param("userId") Integer userId);*/

    List<Chat> findByUser1(User user1);
    List<Chat> findByUser2(User user2);

    Optional<Chat> findById(Integer id);

    List<Chat> findByUser1AndUser2(User user1, User user2);
}

package com.example.close2bookingapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.close2bookingapi.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
}

package com.example.close2bookingapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.close2bookingapi.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
    
}

package com.example.demo12.repo;

import com.example.demo12.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername (String username);
}

package com.example.demo12.repo;

import com.example.demo12.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RoleRepo extends JpaRepository<Role,Long> {
    Role findByName(String name);
}

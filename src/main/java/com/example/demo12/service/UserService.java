package com.example.demo12.service;

import com.example.demo12.domain.Role;
import com.example.demo12.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String rolename);
    User getUser(String username);
    List<User> getUsers();
}

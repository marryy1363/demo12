package com.example.demo12;

import com.example.demo12.domain.Role;
import com.example.demo12.domain.User;
import com.example.demo12.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class Demo12Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo12Application.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "role_USER"));
            userService.saveRole(new Role(null, "role_MANAGER"));
            userService.saveRole(new Role(null, "role_ADMIN"));
            userService.saveRole(new Role(null, "role_SUPER_ADMIN"));

            userService.saveUser(new User(null, "jhone doe", "jhone", "1234", new ArrayList<Role>()));
            userService.saveUser(new User(null, "jh do", "jh", "1234", new ArrayList<Role>()));
            userService.saveUser(new User(null, "one oe", "one", "1234", new ArrayList<Role>()));
            userService.saveUser(new User(null, "joe doo", "joe", "1234", new ArrayList<Role>()));
            userService.saveUser(new User(null, "j oe", "j", "1234", new ArrayList<Role>()));

            userService.addRoleToUser("jhone", "role_USER");
            userService.addRoleToUser("one", "role_MANAGER");
            userService.addRoleToUser("one", "role_ADMIN");
            userService.addRoleToUser("jh", "role_USER");
            userService.addRoleToUser("joe", "role_SUPER_ADMIN");
            userService.addRoleToUser("j", "role_USER");

        };
    }

}

package com.example.fitnesstracker.controllers;

import com.example.fitnesstracker.models.User;
import com.example.fitnesstracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired private UserRepository userRepo;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        userRepo.save(user);
        return ResponseEntity.ok("User registered!");
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable String id) {
        return userRepo.findById(id).orElse(null);
    }
}

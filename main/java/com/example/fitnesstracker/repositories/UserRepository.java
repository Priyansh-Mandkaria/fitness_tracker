package com.example.fitnesstracker.repositories;

import com.example.fitnesstracker.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {}

package com.example.fitnesstracker.repositories;

import com.example.fitnesstracker.models.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {
    List<Workout> findByUserId(String userId);
}

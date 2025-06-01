package com.example.fitnesstracker.controllers;

import com.example.fitnesstracker.models.Workout;
import com.example.fitnesstracker.repositories.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {
    @Autowired private WorkoutRepository workoutRepo;

    @PostMapping("/")
    public Workout createWorkout(@RequestBody Workout workout) {
        return workoutRepo.save(workout);
    }

    @GetMapping("/{userId}")
    public List<Workout> getWorkouts(@PathVariable String userId) {
        return workoutRepo.findByUserId(userId);
    }
}

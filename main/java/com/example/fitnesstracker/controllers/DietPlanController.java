package com.example.fitnesstracker.controllers;

import com.example.fitnesstracker.models.DietPlan;
import com.example.fitnesstracker.repositories.DietPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diets")
public class DietPlanController {
    @Autowired private DietPlanRepository dietRepo;

    @PostMapping("/")
    public DietPlan createDiet(@RequestBody DietPlan diet) {
        return dietRepo.save(diet);
    }

    @GetMapping("/{userId}")
    public List<DietPlan> getDiets(@PathVariable String userId) {
        return dietRepo.findByUserId(userId);
    }
}

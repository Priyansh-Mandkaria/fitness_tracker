package com.example.fitnesstracker.repositories;

import com.example.fitnesstracker.models.DietPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DietPlanRepository extends JpaRepository<DietPlan, Long> {
    List<DietPlan> findByUserId(String userId);
}

package com.example.fitnesstracker.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DietPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userId;
    private String meal;
    private String description;
    private String date;
}

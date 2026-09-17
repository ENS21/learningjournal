package com.ekaterina.learningjournal.controller;

import com.ekaterina.learningjournal.model.Goal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoalController {
    @GetMapping("/goals")
    public List<Goal> getAllGoal() {
        return List.of(
                new Goal("Setup Spring Boot project", "Basic project structure with Maven", "DONE"),
                new Goal("Add Hello endpoint", "Simple REST controller", "DONE"),
                new Goal("Implement CRUD for Goals", "Create, read, update, delete goals", "IN_PROGRESS"),
                new Goal("Integrate PostgreSQL", "Database with JPA repositories", "NEW"),
                new Goal("Build goals tree", "Parent-child relationship", "NEW")
        );
    }
}

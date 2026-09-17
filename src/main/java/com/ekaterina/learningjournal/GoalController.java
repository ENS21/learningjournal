package com.ekaterina.learningjournal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoalController {
    @GetMapping("/goals")
    public List<Goal> getAllGoal() {
        return List.of(
                new Goal(1L, "Setup Spring Boot project", "Basic project structure with Maven", "DONE"),
                new Goal(2L, "Add Hello endpoint", "Simple REST controller", "DONE"),
                new Goal(3L, "Implement CRUD for Goals", "Create, read, update, delete goals", "IN_PROGRESS"),
                new Goal(4L, "Integrate PostgreSQL", "Database with JPA repositories", "NEW"),
                new Goal(5L, "Build goals tree", "Parent-child relationship", "NEW")
        );
    }
}

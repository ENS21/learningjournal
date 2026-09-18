package com.ekaterina.learningjournal.controller;

import com.ekaterina.learningjournal.model.Goal;
import com.ekaterina.learningjournal.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/goals")
public class GoalController {
    private final GoalService goalService;
    @Autowired
    public GoalController(GoalService goalService) {
        this.goalService = goalService;
    }
    // READ — получить все цели
    @GetMapping
    public List<Goal> getAllGoals() {
        return goalService.getAllGoals();
    }
    // READ — получить одну цель по ID
    @GetMapping("/{id}")
    public ResponseEntity<Goal> getGoalById(@PathVariable Long id) {
        return goalService.getGoalById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    // CREATE — создать новую цель
    @PostMapping
    public Goal createGoal (@RequestBody Goal goal) {
        return goalService.createGoal(goal);
    }
    // UPDATE — обновить цель
    @PutMapping
    public Goal updateGoal (@PathVariable Long id, @RequestBody Goal goal) {
        return goalService.updateGoal(id, goal);
    }
    // DELETE — удалить цель
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGoal(@PathVariable long id) {
        goalService.deleteGoal(id);
        return ResponseEntity.noContent().build();
    }
}

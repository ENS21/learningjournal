package com.ekaterina.learningjournal.service;
import com.ekaterina.learningjournal.repository.GoalRepository;
import com.ekaterina.learningjournal.model.Goal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class GoalService {
    private final GoalRepository goalRepository;
    @Autowired
    public GoalService(GoalRepository goalRepository) {
        this.goalRepository = goalRepository;
    }
    public List<Goal> getAllGoals() {return goalRepository.findAll();}
    public Optional<Goal> getGoalById(long id){return goalRepository.findById(id);}
    public  Goal createGoal(Goal goal) {
        return goalRepository.save(goal);
    }
    public Goal updateGoal(long id, Goal updateGoal) {
        updateGoal.setId(id);
        return goalRepository.save(updateGoal);
    }
    public void deleteGoal(long id) {
        goalRepository.deleteById(id);
    }
}

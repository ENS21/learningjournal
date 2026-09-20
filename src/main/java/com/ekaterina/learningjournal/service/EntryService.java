package com.ekaterina.learningjournal.service;

import com.ekaterina.learningjournal.model.Entry;
import com.ekaterina.learningjournal.model.Goal;
import com.ekaterina.learningjournal.repository.EntryRepository;
import com.ekaterina.learningjournal.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntryService {
    private final EntryRepository entryRepository;
    private final GoalRepository goalRepository;
    @Autowired
    public EntryService(EntryRepository entryRepository, GoalRepository goalRepository) {
        this.entryRepository = entryRepository;
        this.goalRepository = goalRepository;
    }
    public List<Entry> getEntriesByGoalId(Long goalId) {
        return entryRepository.findByGoalId(goalId);
    }
    public  Entry createEntry(Long goalId, Entry entry) {
        Optional<Goal> goal = goalRepository.findById(goalId);
        if (goal.isEmpty()) {
            throw  new RuntimeException("Goal not found with id: " + goalId);
        }
        entry.setGoal(goal.get());
        return entryRepository.save(entry);
    }
    public void deleteEntry(Long id) {
        entryRepository.deleteById(id);
    }
}

package com.ekaterina.learningjournal.service;

import com.ekaterina.learningjournal.model.Goal;
import com.ekaterina.learningjournal.repository.GoalRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class GoalServiceTest {

    @Mock
    private GoalRepository goalRepository;

    @InjectMocks
    private GoalService goalService;

    @Test
    void shouldReturnAllGoals() {
        Goal goal = new Goal("Выучить Java", "Каждый день", "NEW");
        when(goalRepository.findAll()).thenReturn(List.of(goal));

        List<Goal> result = goalService.getAllGoals();

        assertEquals(1, result.size());
        assertEquals("Выучить Java", result.get(0).getTitle());
    }

    @Test
    void shouldReturnGoalById() {
        Goal goal = new Goal("Выучить Java", "Каждый день", "NEW");
        goal.setId(1L);
        when(goalRepository.findById(1L)).thenReturn(Optional.of(goal));

        Optional<Goal> result = goalService.getGoalById(1L);

        assertTrue(result.isPresent());
        assertEquals("Выучить Java", result.get().getTitle());
    }

    @Test
    void shouldCreateGoal() {
        Goal goal = new Goal("Выучить Java", "Каждый день", "NEW");
        when(goalRepository.save(goal)).thenReturn(goal);

        Goal result = goalService.createGoal(goal);

        assertEquals("Выучить Java", result.getTitle());
        verify(goalRepository, times(1)).save(goal);
    }

    @Test
    void shouldDeleteGoal() {
        goalService.deleteGoal(1L);

        verify(goalRepository, times(1)).deleteById(1L);
    }
}
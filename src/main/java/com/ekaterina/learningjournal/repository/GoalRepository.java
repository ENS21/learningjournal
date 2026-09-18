package com.ekaterina.learningjournal.repository;
import com.ekaterina.learningjournal.model.Goal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GoalRepository extends JpaRepository<Goal, Long> {
}


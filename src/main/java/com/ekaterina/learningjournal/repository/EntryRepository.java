package com.ekaterina.learningjournal.repository;

import com.ekaterina.learningjournal.model.Entry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {
    List<Entry> findByGoalId(Long goalTd);
}

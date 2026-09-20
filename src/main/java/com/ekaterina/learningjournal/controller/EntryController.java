package com.ekaterina.learningjournal.controller;

import com.ekaterina.learningjournal.model.Entry;
import com.ekaterina.learningjournal.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/goals/{goalId}/entries")
public class EntryController {
    private final EntryService entryService;
    @Autowired
    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }
    @GetMapping
    public List<Entry> getEntriesByGoalId(@PathVariable Long goalId) {
        return entryService.getEntriesByGoalId(goalId);
    }
    @PostMapping
    public Entry createEntry(@PathVariable Long goalId, @RequestBody Entry entry) {
        return entryService.createEntry(goalId, entry);
    }
    @DeleteMapping
    public ResponseEntity<Void> deleteEntry(@PathVariable Long id) {
        entryService.deleteEntry(id);
        return ResponseEntity.noContent().build();
    }
}

package com.ekaterina.learningjournal.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "entries")
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private LocalDateTime createdAt;
    @ManyToOne
    @JoinColumn(name = "goal_id")
    private Goal goal;
    public Entry() {
    }
    public  Entry(String content, Goal goal) {
        this.content = content;
        this.goal = goal;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public Goal getGoal() {
        return goal;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }
}

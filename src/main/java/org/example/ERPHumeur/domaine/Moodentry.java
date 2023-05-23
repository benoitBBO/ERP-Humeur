package org.example.ERPHumeur.domaine;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Moodentry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User user;
    private Boolean mood;
    private String description;
    private LocalDate date;

    public Moodentry(User user, Boolean mood, String description, LocalDate date) {
        this.user = user;
        this.mood = mood;
        this.description = description;
        this.date = date;
    }

    public Moodentry() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Boolean getMood() {
        return mood;
    }

    public void setMood(Boolean mood) {
        this.mood = mood;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}

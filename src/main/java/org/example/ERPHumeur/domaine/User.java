package org.example.ERPHumeur.domaine;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="utilisateur")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @OneToMany
    private List<Moodentry> moods;
    @OneToMany
    private List<Activity> activities;

    public User(String name, String email, List<Moodentry> moods, List<Activity> activities) {
        this.name = name;
        this.email = email;
        this.moods = moods;
        this.activities = activities;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Moodentry> getMoods() {
        return moods;
    }

    public void setMoods(List<Moodentry> moods) {
        this.moods = moods;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }
}

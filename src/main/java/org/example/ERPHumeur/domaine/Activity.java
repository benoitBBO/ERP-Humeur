package org.example.ERPHumeur.domaine;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User user;
    private String name;
    private Integer duration;
    private LocalDate date;

    public Activity(User user, String name, Integer duration, LocalDate date) {
        this.user = user;
        this.name = name;
        this.duration = duration;
        this.date = date;
    }

    public Activity() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", user=" + user +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", date=" + date +
                '}';
    }
}

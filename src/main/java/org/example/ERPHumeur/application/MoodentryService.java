package org.example.ERPHumeur.application;

import org.example.ERPHumeur.domaine.Moodentry;

import java.util.List;

public interface MoodentryService {
    Moodentry create(Moodentry moodentry);
    Moodentry update(Moodentry moodentry);
    Moodentry getById(Long id);
    void delete (Moodentry moodentry);
    List<Moodentry> getAll();
}

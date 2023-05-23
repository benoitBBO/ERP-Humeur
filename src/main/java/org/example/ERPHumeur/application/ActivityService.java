package org.example.ERPHumeur.application;

import org.example.ERPHumeur.domaine.Activity;

import java.util.List;

public interface ActivityService {
    Activity create(Activity activity);
    Activity update(Activity activity);
    Activity getById(Long id);
    void delete (Activity activity);
    List<Activity> getAll();
}

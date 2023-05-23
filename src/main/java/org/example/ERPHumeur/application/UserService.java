package org.example.ERPHumeur.application;

import org.example.ERPHumeur.domaine.Activity;
import org.example.ERPHumeur.domaine.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserService {
    User create(User user);
    User update(User user);
    User getById(Long id);
    void delete (User user);
    List<User> getAll();
    List<Activity> findActivitiesWithHappyMoodByUser(Long userId);
    List<Activity> findActivitiesWithNotHappyMoodByUser(Long userId);
}

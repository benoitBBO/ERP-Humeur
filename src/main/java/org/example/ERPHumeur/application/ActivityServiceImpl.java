package org.example.ERPHumeur.application;

import org.example.ERPHumeur.domaine.Activity;
import org.example.ERPHumeur.domaine.User;
import org.example.ERPHumeur.infrastructure.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    ActivityRepository activityRepository;
    @Override
    public Activity create(Activity activity) {
        return activityRepository.save(activity);
    }

    @Override
    public Activity update(Activity activity) {
        return activityRepository.save(activity);
    }

    @Override
    public Activity getById(Long id) {
        Optional<Activity> optionalTask = activityRepository.findById(id);
        if (!optionalTask.isPresent()) {
            throw new EntityNotFoundException("L'activité avec l'id "+id+" est introuvable");
        }
        return optionalTask.get();
    }

    @Override
    public void delete(Activity activity) {

    }

    @Override
    public List<Activity> getAll() {
        return null;
    }
}

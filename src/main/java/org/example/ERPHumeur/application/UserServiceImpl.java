package org.example.ERPHumeur.application;

import org.example.ERPHumeur.domaine.Activity;
import org.example.ERPHumeur.domaine.User;
import org.example.ERPHumeur.infrastructure.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getById(Long id) {
        Optional<User> optionalTask = userRepository.findById(id);
        if (!optionalTask.isPresent()) {
            throw new EntityNotFoundException("Le user avec l'id "+id+" est introuvable");
        }
        return optionalTask.get();
    }


    @Override
    public void delete(User user) {

    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public List<Activity> findActivitiesWithHappyMoodByUser(Long userId) {
        return userRepository.findActivitiesWithHappyMoodByUser(userId);
    }

    @Override
    public List<Activity> findActivitiesWithNotHappyMoodByUser(Long userId) {
        return userRepository.findActivitiesWithNotHappyMoodByUser(userId);
    }
}

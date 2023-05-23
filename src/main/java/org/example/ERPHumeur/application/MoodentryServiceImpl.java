package org.example.ERPHumeur.application;

import org.example.ERPHumeur.domaine.Activity;
import org.example.ERPHumeur.domaine.Moodentry;
import org.example.ERPHumeur.infrastructure.MoodentryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class MoodentryServiceImpl implements MoodentryService {
    @Autowired
    MoodentryRepository moodentryRepository;
    @Override
    public Moodentry create(Moodentry moodentry) {
        return moodentryRepository.save(moodentry);
    }

    @Override
    public Moodentry update(Moodentry moodentry) {
        return moodentryRepository.save(moodentry);
    }

    @Override
    public Moodentry getById(Long id) {
        Optional<Moodentry> optionalTask = moodentryRepository.findById(id);
        if (!optionalTask.isPresent()) {
            throw new EntityNotFoundException("L'humeur avec l'id "+id+" est introuvable");
        }
        return optionalTask.get();
    }

    @Override
    public void delete(Moodentry moodentry) {

    }

    @Override
    public List<Moodentry> getAll() {
        return null;
    }
}

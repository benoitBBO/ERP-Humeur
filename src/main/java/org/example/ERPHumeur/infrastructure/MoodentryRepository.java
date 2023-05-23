package org.example.ERPHumeur.infrastructure;

import org.example.ERPHumeur.domaine.Moodentry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoodentryRepository extends JpaRepository<Moodentry, Long> {

}

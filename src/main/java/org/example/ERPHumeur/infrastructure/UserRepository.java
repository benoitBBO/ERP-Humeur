package org.example.ERPHumeur.infrastructure;

import org.example.ERPHumeur.domaine.Activity;
import org.example.ERPHumeur.domaine.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT activity FROM Activity activity " +
            "JOIN activity.user user " +
            "JOIN user.moods mood " +
            "WHERE user.id = :userId " +
            "AND mood.mood = true")
    List<Activity> findActivitiesWithHappyMoodByUser(@Param("userId") Long userId);

    @Query("SELECT activity FROM Activity activity " +
            "JOIN activity.user user " +
            "JOIN user.moods mood " +
            "WHERE user.id = :userId " +
            "AND mood.mood = false")
    List<Activity> findActivitiesWithNotHappyMoodByUser(@Param("userId") Long userId);
}

package org.example.ERPHumeur.exposition;

import org.example.ERPHumeur.application.UserService;
import org.example.ERPHumeur.domaine.Activity;
import org.example.ERPHumeur.domaine.User;
import org.example.ERPHumeur.dto.ActivityDto;
import org.example.ERPHumeur.dto.converter.ActivityDtoConverter;
import org.example.ERPHumeur.file.QueueProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    ActivityDtoConverter activityDtoConverter;
    @Autowired
    QueueProducer queueProducer;
    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }
    @GetMapping("/{id}")
    public User getById(@PathVariable("id") Long id){
        return userService.getById(id);
    }

    @GetMapping("/{id}/happy-activities")
    public List<ActivityDto> getByIdHappy(@PathVariable("id") Long id){
        List<Activity> activities = userService.findActivitiesWithHappyMoodByUser(id);
        List<ActivityDto> activityDtoList = new ArrayList<>();
        for (Activity entity:activities) {
            queueProducer.sendMq(entity);
            activityDtoList.add(activityDtoConverter.convertEntityToDto(entity));
        }
        return activityDtoList;
    }

    @GetMapping("/{id}/sad-activities")
    public List<ActivityDto> getByIdNotHappy(@PathVariable("id") Long id){
        List<Activity> activities = userService.findActivitiesWithNotHappyMoodByUser(id);
        List<ActivityDto> activityDtoList = new ArrayList<>();
        for (Activity entity:activities) {
            activityDtoList.add(activityDtoConverter.convertEntityToDto(entity));
        }
        return activityDtoList;
    }
}

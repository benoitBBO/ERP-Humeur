package org.example.ERPHumeur.exposition;

import org.example.ERPHumeur.application.ActivityService;
import org.example.ERPHumeur.domaine.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/activities")
public class ActivityController {
    @Autowired
    ActivityService activityService;

    @PostMapping
    public Activity create(@RequestBody Activity activity){
        return activityService.create(activity);
    }
    @GetMapping("/{id}")
    public Activity getById(@PathVariable("id") Long id){
        return activityService.getById(id);
    }
}

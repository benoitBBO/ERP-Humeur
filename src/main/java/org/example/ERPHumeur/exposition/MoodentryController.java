package org.example.ERPHumeur.exposition;

import org.example.ERPHumeur.application.MoodentryService;
import org.example.ERPHumeur.domaine.Moodentry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/moods")
public class MoodentryController {
    @Autowired
    MoodentryService moodentryService;

    @PostMapping("/create")
    public Moodentry create(@RequestBody Moodentry moodentry){
        return moodentryService.create(moodentry);
    }
    @GetMapping("/{id}")
    public Moodentry getById(@PathVariable("id") Long id){
        return moodentryService.getById(id);
    }
}

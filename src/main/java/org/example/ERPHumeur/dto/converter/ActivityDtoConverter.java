package org.example.ERPHumeur.dto.converter;

import org.example.ERPHumeur.domaine.Activity;
import org.example.ERPHumeur.dto.ActivityDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ActivityDtoConverter {
    public ActivityDto convertEntityToDto(Activity entity){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(entity, ActivityDto.class);
    }
    public Activity convertDtoToEntity(ActivityDto dto){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, Activity.class);
    }
}

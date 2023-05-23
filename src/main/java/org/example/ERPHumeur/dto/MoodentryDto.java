package org.example.ERPHumeur.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class MoodentryDto {
    private Long id;
    private UserDto user;
    private Boolean mood;
    private String description;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;
}

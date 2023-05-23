package org.example.ERPHumeur.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class ActivityDto {
    private Long id;
    private UserDto user;
    private String name;
    private Integer duration;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;
}

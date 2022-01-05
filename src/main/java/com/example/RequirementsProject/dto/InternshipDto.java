package com.example.RequirementsProject.dto;

import com.example.RequirementsProject.domain.StudentInternship;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class InternshipDto {

    private UUID id;

    private String title;

    private String description;

    private String domain;

    private String location;

    private Long duration;

    private Long salary;

    private String type;

    private Set<StudentInternship> allStudents = new HashSet<>();
}

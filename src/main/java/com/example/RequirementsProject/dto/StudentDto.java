package com.example.RequirementsProject.dto;

import com.example.RequirementsProject.domain.FileObject;
import com.example.RequirementsProject.domain.StudentInternship;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class StudentDto {

    private UUID id;

    private String firstName;
    private String lastName;
    private Date birthDate;

    private String email;

    private FileObject resume;

    private Set<StudentInternship> listOfInternships = new HashSet<>();
}

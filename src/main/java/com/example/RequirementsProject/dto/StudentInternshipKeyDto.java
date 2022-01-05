package com.example.RequirementsProject.dto;

import javax.persistence.Column;

public class StudentInternshipKeyDto {

    @Column(name = "student_id")
    Long studentId;

    @Column(name = "internship_id")
    Long internshipId;
}

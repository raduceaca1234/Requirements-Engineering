package com.example.RequirementsProject.dto;

import javax.persistence.Column;

public class StudentInternshipKeyDto {

    @Column(name = "student_id")
    Long studentId;

    @Column(name = "internship_id")
    Long internshipId;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getInternshipId() {
        return internshipId;
    }

    public void setInternshipId(Long internshipId) {
        this.internshipId = internshipId;
    }
}

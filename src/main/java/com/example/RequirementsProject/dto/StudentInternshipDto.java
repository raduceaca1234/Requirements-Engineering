package com.example.RequirementsProject.dto;

public class StudentInternshipDto {

    StudentInternshipKeyDto key;

    StudentDto student;

    InternshipDto internship;

    public StudentInternshipKeyDto getKey() {
        return key;
    }

    public void setKey(StudentInternshipKeyDto key) {
        this.key = key;
    }

    public StudentDto getStudent() {
        return student;
    }

    public void setStudent(StudentDto student) {
        this.student = student;
    }

    public InternshipDto getInternship() {
        return internship;
    }

    public void setInternship(InternshipDto internship) {
        this.internship = internship;
    }
}

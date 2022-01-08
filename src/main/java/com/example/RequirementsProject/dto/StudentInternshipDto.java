package com.example.RequirementsProject.dto;

import com.example.RequirementsProject.domain.Internship;
import com.example.RequirementsProject.domain.Student;
import com.example.RequirementsProject.domain.StudentInternshipKey;

public class StudentInternshipDto {

    StudentInternshipKey key;

    Student student;

    Internship internship;

    public StudentInternshipKey getKey() {
        return key;
    }

    public void setKey(StudentInternshipKey key) {
        this.key = key;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Internship getInternship() {
        return internship;
    }

    public void setInternship(Internship internship) {
        this.internship = internship;
    }
}

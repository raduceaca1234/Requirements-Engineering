package com.example.RequirementsProject.domain;

import javax.persistence.*;

@Entity
@Table(name = "student_internship")
public class StudentInternship {

    @EmbeddedId
    @Column(name="key")
    StudentInternshipKey key;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id")
    Student student;

    @ManyToOne
    @MapsId("internshipId")
    @JoinColumn(name = "internship_id")
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

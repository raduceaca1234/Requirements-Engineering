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
}

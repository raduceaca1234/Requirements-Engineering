package com.example.RequirementsProject.domain;

import javax.persistence.*;

@Entity
public class StudentInternship {

    @EmbeddedId
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

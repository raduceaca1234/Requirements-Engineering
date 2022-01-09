package com.example.RequirementsProject.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;
import java.io.Serializable;

@Embeddable
@Table(name = "firstName")
public class StudentInternshipKey implements Serializable {
    @Column(name = "student_id")
    Long studentId;

    @Column(name = "internship_id")
    Long internshipId;
}

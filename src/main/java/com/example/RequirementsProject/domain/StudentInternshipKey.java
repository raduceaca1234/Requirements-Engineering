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

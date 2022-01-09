package com.example.RequirementsProject.dto;

import com.example.RequirementsProject.domain.FileObject;
import com.example.RequirementsProject.domain.StudentInternship;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class StudentDto {

    private Long id;

    private String firstName;
    private String lastName;
    private Date birthDate;

    private String email;

    private FileObject resume;

    private Set<StudentInternship> listOfInternships = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public FileObject getResume() {
        return resume;
    }

    public void setResume(FileObject resume) {
        this.resume = resume;
    }

    public Set<StudentInternship> getListOfInternships() {
        return listOfInternships;
    }

    public void setListOfInternships(Set<StudentInternship> listOfInternships) {
        this.listOfInternships = listOfInternships;
    }
}

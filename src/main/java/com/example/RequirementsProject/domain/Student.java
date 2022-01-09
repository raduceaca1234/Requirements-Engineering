package com.example.RequirementsProject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "birthDate")
    private Date birthDate;

    @Column(name = "email", unique = true)
    private String email;

    @Embedded
    private FileObject resume;

    @OneToMany(mappedBy = "student")
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

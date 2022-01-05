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
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private Date birthDate;

    @Column(unique = true)
    private String email;

    @Embedded
    private FileObject resume;

    @OneToMany(mappedBy = "student")
    private Set<StudentInternship> listOfInternships = new HashSet<>();
}

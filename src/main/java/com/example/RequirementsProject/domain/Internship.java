package com.example.RequirementsProject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Internship {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String description;

    private String domain;

    private String location;

    private Long duration;

    private Long salary;

    private String type;

    @OneToMany(mappedBy = "internship")
    private Set<StudentInternship> allStudents = new HashSet<>();
}

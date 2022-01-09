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
@Table(name = "internships")
public class Internship {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "domain")
    private String domain;

    @Column(name = "location")
    private String location;

    @Column(name = "duration")
    private Long duration;

    @Column(name = "salary")
    private Long salary;

    @Column(name = "type")
    private String type;

    @OneToMany(mappedBy = "internship")
    private Set<StudentInternship> allStudents = new HashSet<>();
}

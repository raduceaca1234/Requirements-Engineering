package com.example.RequirementsProject.dto;

import com.example.RequirementsProject.domain.StudentInternship;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class InternshipDto {

    private UUID id;

    private String title;

    private String description;

    private String domain;

    private String location;

    private Long duration;

    private Long salary;

    private String type;

    private Set<StudentInternship> allStudents = new HashSet<>();

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<StudentInternship> getAllStudents() {
        return allStudents;
    }

    public void setAllStudents(Set<StudentInternship> allStudents) {
        this.allStudents = allStudents;
    }
}

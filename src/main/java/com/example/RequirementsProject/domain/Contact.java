package com.example.RequirementsProject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Contact {

    private String phoneNumber;

    private String workingHours;

    private String emailAddress;

}

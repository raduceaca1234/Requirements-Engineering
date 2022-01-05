package com.example.RequirementsProject.dto;

import com.example.RequirementsProject.domain.Contact;
import lombok.Data;

import java.util.UUID;

@Data
public class CompanyDto {

    private UUID id;

    private String title;

    private String description;

    private String address;

    private Contact contact;
}

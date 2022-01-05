package com.example.RequirementsProject.services;

import com.example.RequirementsProject.dto.CompanyDto;
import com.example.RequirementsProject.repositories.CompanyRepository;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public void addCompany(CompanyDto company) {
        
    }
}

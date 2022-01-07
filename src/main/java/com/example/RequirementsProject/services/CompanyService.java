package com.example.RequirementsProject.services;

import com.example.RequirementsProject.domain.Company;
import com.example.RequirementsProject.dto.CompanyDto;
import com.example.RequirementsProject.mapper.CompanyMapper;
import com.example.RequirementsProject.repositories.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper;

    public CompanyService(CompanyRepository companyRepository,
                          CompanyMapper companyMapper) {
        this.companyRepository = companyRepository;
        this.companyMapper = companyMapper;
    }

    public CompanyDto addCompany(CompanyDto companyDto) {
        Company company = companyMapper.companyDTOToCompany(companyDto);
        return companyMapper.companyToCompanyDTO(companyRepository.save(company));
    }

    public CompanyDto updateCompany(CompanyDto companyDto) {
        Company company = companyMapper.companyDTOToCompany(companyDto);
        return companyMapper.companyToCompanyDTO(companyRepository.update(company));
    }

    public void deleteCompany(CompanyDto companyDto) {
        Company company = companyMapper.companyDTOToCompany(companyDto);
        companyRepository.delete(company);
    }

    public List<CompanyDto> findByTitle(String title) {
        return companyMapper.companiesToCompaniesDTOs(companyRepository.findByTitle(title));
    }

    public List<CompanyDto> findByAddress(String address) {
        return companyMapper.companiesToCompaniesDTOs(companyRepository.findByAddress(address));
    }
}

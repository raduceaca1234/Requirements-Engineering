package com.example.RequirementsProject.services;

import com.example.RequirementsProject.domain.Company;
import com.example.RequirementsProject.domain.Student;
import com.example.RequirementsProject.dto.CompanyDto;
import com.example.RequirementsProject.mapper.CompanyMapper;
import com.example.RequirementsProject.repositories.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Optional<Company> companyData = companyRepository.findById(company.getId());
        if (companyData.isPresent()) {
            Company _company = companyData.get();
            _company.setTitle(company.getTitle());
            _company.setAddress(company.getAddress());
            _company.setContact(company.getContact());
            _company.setDescription(company.getDescription());
            return companyMapper.companyToCompanyDTO(companyRepository.save(_company));
        }

        return new CompanyDto();
    }

    public void deleteCompany(CompanyDto companyDto) {
        Company company = companyMapper.companyDTOToCompany(companyDto);
        companyRepository.delete(company);
    }

    public List<CompanyDto> findAll() {
        return companyMapper.companiesToCompaniesDTOs(companyRepository.findAll());
    }

    public List<CompanyDto> findByTitle(String title) {
        return companyMapper.companiesToCompaniesDTOs(companyRepository.findByTitle(title));
    }

    public List<CompanyDto> findByAddress(String address) {
        return companyMapper.companiesToCompaniesDTOs(companyRepository.findByAddress(address));
    }
}

package com.example.RequirementsProject.mapper;

import com.example.RequirementsProject.domain.Company;
import com.example.RequirementsProject.dto.CompanyDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CompanyMapper {


    Company companyToCompanyDTO(CompanyDto companyDto);

    CompanyDto companyDTOToCompany(Company company);

    List<Company> companiesToCompaniesDTOs(List<CompanyDto> companyDtos);

    List<CompanyDto> companiesDTOsToCompanies(List<Company> companies);
}

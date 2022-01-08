package com.example.RequirementsProject.mapper;

import com.example.RequirementsProject.domain.Company;
import com.example.RequirementsProject.dto.CompanyDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CompanyMapper {


    CompanyDto companyToCompanyDTO(Company companyDto);

    Company companyDTOToCompany(CompanyDto company);

    List<Company> companiesDTOsToCompanies(List<CompanyDto> companyDtos);

    List<CompanyDto> companiesToCompaniesDTOs(List<Company> companies);

    void updateFromDTO(CompanyDto publicCompanyDataDTO, @MappingTarget CompanyDto publicCompanyData);

}

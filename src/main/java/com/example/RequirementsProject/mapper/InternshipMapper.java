package com.example.RequirementsProject.mapper;

import com.example.RequirementsProject.domain.Internship;
import com.example.RequirementsProject.dto.InternshipDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InternshipMapper {


    Internship internshipToInternshipDTO(InternshipDto internshipDto);

    InternshipDto internshipDTOToInternship(Internship internship);

    List<Internship> internshipsToInternshipsDTOs(List<InternshipDto> internshipDtos);

    List<InternshipDto> internshipsDTOsToInternships(List<Internship> internships);
}

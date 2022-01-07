package com.example.RequirementsProject.mapper;

import com.example.RequirementsProject.domain.Internship;
import com.example.RequirementsProject.dto.InternshipDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InternshipMapper {


    Internship internshipDTOToInternship(InternshipDto internshipDto);

    InternshipDto internshipToInternshipDTO(Internship internship);

    List<Internship> internshipsDTOsToInternships(List<InternshipDto> internshipDtos);

    List<InternshipDto> internshipsToInternshipsDTOs(List<Internship> internships);
}

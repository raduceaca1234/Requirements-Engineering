package com.example.RequirementsProject.mapper;

import com.example.RequirementsProject.domain.StudentInternship;
import com.example.RequirementsProject.dto.StudentInternshipDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentInternshipMapper {

    StudentInternshipDto studentInternshipToStudentInternshipDto(StudentInternship studentInternship);

    StudentInternship studentInternshipDtoToStudentInternship(StudentInternshipDto studentInternshipDto);

    List<StudentInternship> studentInternshipDtosToStudentInternships(List<StudentInternshipDto> studentInternshipDtos);

    List<StudentInternshipDto> studentInternshipsToStudentInternshipDtos(List<StudentInternship> studentInternships);
}

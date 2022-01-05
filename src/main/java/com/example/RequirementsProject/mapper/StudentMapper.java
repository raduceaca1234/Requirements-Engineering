package com.example.RequirementsProject.mapper;

import com.example.RequirementsProject.domain.Student;
import com.example.RequirementsProject.dto.StudentDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {


    Student studentToStudentsDTO(StudentDto studentDto);

    StudentDto studentDTOToStudents(Student student);

    List<Student> studentsToStudentsDTOs(List<StudentDto> studentDtos);

    List<StudentDto> studentsDTOsToStudents(List<Student> students);
}

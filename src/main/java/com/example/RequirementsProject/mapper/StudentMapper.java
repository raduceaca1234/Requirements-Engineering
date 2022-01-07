package com.example.RequirementsProject.mapper;

import com.example.RequirementsProject.domain.Student;
import com.example.RequirementsProject.dto.StudentDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {


    Student studentDTOToStudent(StudentDto studentDto);

    StudentDto studentToStudentDTO(Student student);

    List<Student> studentsDTOsToStudents(List<StudentDto> studentDtos);

    List<StudentDto> studentsToStudentsDTOs(List<Student> students);
}

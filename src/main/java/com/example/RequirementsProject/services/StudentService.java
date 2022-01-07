package com.example.RequirementsProject.services;

import com.example.RequirementsProject.domain.Student;
import com.example.RequirementsProject.dto.StudentDto;
import com.example.RequirementsProject.mapper.StudentMapper;
import com.example.RequirementsProject.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public StudentService(StudentRepository studentRepository,
                          StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    public StudentDto addStudent(StudentDto studentDto) {
        Student student = studentMapper.studentDTOToStudent(studentDto);
        return studentMapper.studentToStudentDTO(studentRepository.save(student));
    }

    public StudentDto updateStudent(StudentDto studentDto) {
        Student student = studentMapper.studentDTOToStudent(studentDto);
        return studentMapper.studentToStudentDTO(studentRepository.update(student));
    }

    public void deleteStudent(StudentDto studentDto) {
        Student student = studentMapper.studentDTOToStudent(studentDto);
        studentRepository.delete(student);
    }

    public List<StudentDto> findByFirstNameAndLastName(String firstName, String lastName) {
        return studentMapper.studentsToStudentsDTOs(studentRepository.findByFirstNameAndLastName(firstName, lastName));
    }

    public List<StudentDto> findByEmail(String email) {
        return studentMapper.studentsToStudentsDTOs(studentRepository.findByEmail(email));
    }
}

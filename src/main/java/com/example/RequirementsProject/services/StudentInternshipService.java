package com.example.RequirementsProject.services;

import com.example.RequirementsProject.domain.Internship;
import com.example.RequirementsProject.domain.Student;
import com.example.RequirementsProject.domain.StudentInternship;
import com.example.RequirementsProject.domain.StudentInternshipKey;
import com.example.RequirementsProject.dto.StudentInternshipDto;
import com.example.RequirementsProject.dto.StudentInternshipKeyDto;
import com.example.RequirementsProject.mapper.InternshipMapper;
import com.example.RequirementsProject.mapper.StudentInternshipMapper;
import com.example.RequirementsProject.mapper.StudentMapper;
import com.example.RequirementsProject.repositories.StudentInternshipRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentInternshipService {

    private final StudentMapper studentMapper;
    private final InternshipMapper internshipMapper;
    private final StudentInternshipMapper studentInternshipMapper;
    private final StudentInternshipRepository studentInternshipRepository;

    public StudentInternshipService(StudentMapper studentMapper,
                                    InternshipMapper internshipMapper,
                                    StudentInternshipMapper studentInternshipMapper,
                                    StudentInternshipRepository studentInternshipRepository) {
        this.studentMapper = studentMapper;
        this.internshipMapper = internshipMapper;
        this.studentInternshipMapper = studentInternshipMapper;
        this.studentInternshipRepository = studentInternshipRepository;
    }

    public StudentInternshipDto applyToInternship(StudentInternshipDto studentInternshipDto) {
        Student student = studentMapper.studentDTOToStudent(studentInternshipDto.getStudent());
        Internship internship = internshipMapper.internshipDTOToInternship(studentInternshipDto.getInternship());
        StudentInternshipKey studentInternshipKey = new StudentInternshipKey();
        studentInternshipKey.setStudentId(student.getId());
        studentInternshipKey.setInternshipId(internship.getId());
        StudentInternship studentInternship = studentInternshipMapper.studentInternshipDtoToStudentInternship(studentInternshipDto);
        studentInternship.setKey(studentInternshipKey);
        return studentInternshipMapper.studentInternshipToStudentInternshipDto(studentInternshipRepository.save(studentInternship));
    }

    public boolean hasApplied(StudentInternshipKeyDto studentInternshipKeyDto) {
        StudentInternshipKey key = new StudentInternshipKey();
        key.setStudentId(studentInternshipKeyDto.getStudentId());
        key.setInternshipId(studentInternshipKeyDto.getInternshipId());
        return studentInternshipRepository.findStudentInternshipByKey(key).isPresent();
    }
}

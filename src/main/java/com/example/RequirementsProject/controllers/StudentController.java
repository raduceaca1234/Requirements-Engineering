package com.example.RequirementsProject.controllers;

import com.example.RequirementsProject.dto.StudentDto;
import com.example.RequirementsProject.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/new")
    public StudentDto createInternship(@RequestBody StudentDto studentDto) {
        logger.debug("REST request to save student : {}", studentDto);
        return studentService.addStudent(studentDto);
    }

    @PutMapping("/update")
    public StudentDto updateInternship(@RequestBody StudentDto studentDto) {
        logger.debug("REST request to update student : {}", studentDto);
        return studentService.updateStudent(studentDto);
    }

    @GetMapping("/all")
    public List<StudentDto> findAll() {
        logger.debug("REST request to find all students");
        return studentService.findAll();
    }

    @DeleteMapping("/delete")
    public void deleteInternship(@RequestBody StudentDto studentDto) {
        logger.debug("REST request to delete student : {}", studentDto);
        studentService.deleteStudent(studentDto);
    }

    @GetMapping("/{firstName}/{lastName}")
    public List<StudentDto> findByFirstNameAndLastName(@PathVariable String firstName, String lastName) {
        logger.debug("REST request to find student by firstName {} and lastName {}", firstName, lastName);
        return studentService.findByFirstNameAndLastName(firstName, lastName);
    }

    @GetMapping("/{email}")
    public List<StudentDto> findByEmail(@PathVariable String email) {
        logger.debug("REST request to find student by email : {}", email);
        return studentService.findByEmail(email);
    }
}

package com.example.RequirementsProject.controllers;


import com.example.RequirementsProject.dto.StudentInternshipDto;
import com.example.RequirementsProject.dto.StudentInternshipKeyDto;
import com.example.RequirementsProject.services.StudentInternshipService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/studentInternship")
public class StudentInternshipController {

    private static final Logger logger = LoggerFactory.getLogger(StudentInternshipController.class);

    private final StudentInternshipService studentInternshipService;

    public StudentInternshipController(StudentInternshipService studentInternshipService) {
        this.studentInternshipService = studentInternshipService;
    }

    @PostMapping("/apply")
    public StudentInternshipDto applyToInternship(@RequestBody StudentInternshipDto studentInternshipDto) {
        logger.debug("REST request for student {} to apply to  internship {}", studentInternshipDto.getStudent(), studentInternshipDto.getInternship());
        return studentInternshipService.applyToInternship(studentInternshipDto);
    }

    @GetMapping("/hasApplied")
    public boolean hasApplied(@RequestBody StudentInternshipKeyDto studentInternshipKeyDto) {
        logger.debug("REST request to find if student has applied to an internship");
        return studentInternshipService.hasApplied(studentInternshipKeyDto);
    }
}

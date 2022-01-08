package com.example.RequirementsProject.controllers;

import com.example.RequirementsProject.dto.InternshipDto;
import com.example.RequirementsProject.services.InternshipService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/internship")
public class InternshipController {

    private static final Logger logger = LoggerFactory.getLogger(InternshipController.class);

    private final InternshipService internshipService;

    public InternshipController(InternshipService internshipService) {
        this.internshipService = internshipService;
    }

    @PostMapping("/new")
    public InternshipDto createInternship(@RequestBody InternshipDto internshipDto) {
        logger.debug("REST request to save internship : {}", internshipDto);
        return internshipService.addInternship(internshipDto);
    }

//    @PutMapping("/update")
//    public InternshipDto updateInternship(@RequestBody InternshipDto internshipDto) {
//        logger.debug("REST request to update internship : {}", internshipDto);
//        return internshipService.updateInternship(internshipDto);
//    }

    @GetMapping("/all")
    public List<InternshipDto> findAll() {
        logger.debug("REST request to find all internships");
        return internshipService.findAll();
    }

    @DeleteMapping("/delete")
    public void deleteInternship(@RequestBody InternshipDto internshipDto) {
        logger.debug("REST request to delete internship : {}", internshipDto);
        internshipService.deleteInternship(internshipDto);
    }

    @GetMapping("/{title}")
    public List<InternshipDto> findByTitle(@PathVariable String title) {
        logger.debug("REST request to find internship by title : {}", title);
        return internshipService.findByTitle(title);
    }

    @GetMapping("/{domain}")
    public List<InternshipDto> findByDomain(@PathVariable String domain) {
        logger.debug("REST request to find internship by domain : {}", domain);
        return internshipService.findByDomain(domain);
    }
}

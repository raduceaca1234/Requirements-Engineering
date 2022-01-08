package com.example.RequirementsProject.controllers;

import com.example.RequirementsProject.dto.CompanyDto;
import com.example.RequirementsProject.services.CompanyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    private static final Logger logger = LoggerFactory.getLogger(CompanyController.class);

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping("/new")
    public CompanyDto createCompany(@RequestBody CompanyDto companyDto) {
        logger.debug("REST request to save company : {}", companyDto);
        return companyService.addCompany(companyDto);
    }

//    @PutMapping("/update")
//    public CompanyDto updateCompany(@RequestBody CompanyDto companyDto) {
//        logger.debug("REST request to update company : {}", companyDto);
//        return companyService.updateCompany(companyDto);
//    }

    @DeleteMapping("/delete")
    public void deleteCompany(@RequestBody CompanyDto companyDto) {
        logger.debug("REST request to delete company : {}", companyDto);
        companyService.deleteCompany(companyDto);
    }

    @GetMapping("/all")
    public List<CompanyDto> findAll() {
        logger.debug("REST request to find all companies");
        return companyService.findAll();
    }

    @GetMapping("/{title}")
    public List<CompanyDto> findByTitle(@PathVariable String title) {
        logger.debug("REST request to find company by title : {}", title);
        return companyService.findByTitle(title);
    }

    @GetMapping("/{address}")
    public List<CompanyDto> findByAddress(@PathVariable String address) {
        logger.debug("REST request to find company by address : {}", address);
        return companyService.findByAddress(address);
    }
}

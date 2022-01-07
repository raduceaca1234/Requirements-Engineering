package com.example.RequirementsProject.repositories;

import com.example.RequirementsProject.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    Company update(
        Company company);

    List<Company> findByTitle(
        String title);

    List<Company> findByAddress(
        String address);

}

package com.example.RequirementsProject.repositories;

import com.example.RequirementsProject.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    Company update(
        Company company);

    List<Company> findByTitle(
        String title);

    List<Company> findByAddress(
        String address);

}

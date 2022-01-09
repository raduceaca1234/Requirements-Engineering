package com.example.RequirementsProject.repositories;

import com.example.RequirementsProject.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    List<Company> findByTitle(
        String title);

    List<Company> findByAddress(
        String address);

}

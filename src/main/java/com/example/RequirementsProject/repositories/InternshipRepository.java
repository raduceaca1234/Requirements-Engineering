package com.example.RequirementsProject.repositories;

import com.example.RequirementsProject.domain.Internship;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InternshipRepository extends JpaRepository<Internship, Long> {

    Internship update(
        Internship internship);

    List<Internship> findByTitle(
        String name);

    List<Internship> findByDomain(
        String domain);
}

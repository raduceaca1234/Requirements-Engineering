package com.example.RequirementsProject.repositories;

import com.example.RequirementsProject.domain.Internship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InternshipRepository extends JpaRepository<Internship, Long> {

    Internship update(
        Internship internship);

    List<Internship> findByTitle(
        String name);

    List<Internship> findByDomain(
        String domain);
}

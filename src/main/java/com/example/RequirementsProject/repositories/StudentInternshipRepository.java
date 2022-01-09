package com.example.RequirementsProject.repositories;

import com.example.RequirementsProject.domain.StudentInternship;
import com.example.RequirementsProject.domain.StudentInternshipKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentInternshipRepository extends JpaRepository<StudentInternship, StudentInternshipKey> {

    Optional<StudentInternship> findStudentInternshipByKey(StudentInternshipKey studentInternshipKey);
}

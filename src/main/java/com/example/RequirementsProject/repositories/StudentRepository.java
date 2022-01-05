package com.example.RequirementsProject.repositories;

import com.example.RequirementsProject.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByName(
            String name);

    List<Student> findByEmail(
            String email);

}

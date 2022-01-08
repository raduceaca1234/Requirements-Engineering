package com.example.RequirementsProject.repositories;

import com.example.RequirementsProject.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student update(
        Student student);

    List<Student> findByFirstNameAndLastName(
        String firstName, String lastName);

    List<Student> findByEmail(
        String email);

}

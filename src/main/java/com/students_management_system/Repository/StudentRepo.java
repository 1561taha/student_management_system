package com.students_management_system.Repository;

import com.students_management_system.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Long> {
    Optional<Student> findByName(String name);
}

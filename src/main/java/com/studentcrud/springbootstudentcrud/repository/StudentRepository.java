package com.studentcrud.springbootstudentcrud.repository;

import com.studentcrud.springbootstudentcrud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepository extends JpaRepository<Student, Long> {
}

package com.studentcrud.springbootstudentcrud.service;

import com.studentcrud.springbootstudentcrud.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student saveStudent(Student student);
    Optional<Student> getStudentById(Long id);
    List<Student> getAllStudents();
    void deleteStudent(Long id);
}

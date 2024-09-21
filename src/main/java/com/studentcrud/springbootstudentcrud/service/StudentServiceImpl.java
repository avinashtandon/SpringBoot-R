package com.studentcrud.springbootstudentcrud.service;

import com.studentcrud.springbootstudentcrud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studentcrud.springbootstudentcrud.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Save or update a student
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);  // Saves the student to the database
    }

    // Get student by ID
    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);  // Retrieves student by primary key
    }

    // Get all students
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();  // Retrieves all students
    }

    // Delete a student by ID
    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);  // Deletes student by ID
    }
}
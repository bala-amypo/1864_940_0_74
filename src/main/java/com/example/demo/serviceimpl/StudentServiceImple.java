package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.aiml.exception.ResourceNotFoundException;
import com.example.aiml.repository.StudentRepository;
import com.example.aiml.service.StudentService;

@Service
public class StudentServiceImple implements StudentService{
    @Autowired
    StudentRepository studentRepository;
    

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    public Student getStudentById(Long id){
        return studentRepository.findById(id)
        .orElseThrow(()->new ResourceNotFoundException("Student not found"));

    }
    
}

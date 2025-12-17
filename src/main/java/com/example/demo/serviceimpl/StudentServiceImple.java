package com.example.demo.Serviceimpl;
import org.springframe.stereotype.Service;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceImple implements StudentService{
    private final StudentRepository studentRepository;
    public StudentServiceImple(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
}
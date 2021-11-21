package com.ashan.StudentSystem.service;

import com.ashan.StudentSystem.model.Student;
import com.ashan.StudentSystem.repository.StudentRepositor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService {

    @Autowired
    private StudentRepositor studentRepositor;

    @Override
    public Student saveStudent(Student student) {
        return studentRepositor.save(student)
    ;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepositor.findAll();

    }
}

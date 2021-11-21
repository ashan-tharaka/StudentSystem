package com.ashan.StudentSystem.controller;
import com.ashan.StudentSystem.model.Student;
import com.ashan.StudentSystem.model.Student;
import com.ashan.StudentSystem.service.StudentService;
import com.ashan.StudentSystem.service.StudentServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;


    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";


    }
@GetMapping("/getAll")
    public List<Student>getAllStudents(){
        return studentService.getAllStudents();

}







}

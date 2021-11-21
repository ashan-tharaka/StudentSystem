package com.ashan.StudentSystem.repository;

import com.ashan.StudentSystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepositor extends JpaRepository<Student,Integer>{


}

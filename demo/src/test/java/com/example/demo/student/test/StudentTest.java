package com.example.demo.student.test;
import com.example.demo.student.Student;
import com.example.demo.student.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;



public class StudentTest {
    @Autowired
    @Test
    public void addNewStudentTest(Student student) {

       // StudentRepository studentRepository;

        Optional<Student> studentOptional = studentRepository
                .findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()){
            throw new IllegalStateException("This email is already being used...");
        }
        studentRepository.save(student);
        System.out.println(student);
    }
}

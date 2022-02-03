package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }





    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository
                .findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()){
            throw new IllegalStateException("This email is already being used...");
        }
        studentRepository.save(student);
        System.out.println(student);
    }

    public void deleteStudent(Long studentId) {
            boolean exists = studentRepository.existsById(studentId);
            if (!exists){
                throw new IllegalStateException("Student with id " + studentId + " does not exist...");
            }
            studentRepository.deleteById(studentId);
    }


//TODO ADD METHOD FOR ADD/DELETE COURSES FOR STUDENT

    @Transactional
    public void updateStudent(Long studentId,
                              String name,
                              String email) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException(
                        "Student with id " + studentId + " does not exist..."));

            if (name != null &&
                name.length() > 0 &&
                !Objects.equals(student.getName(), name)){
                student.setName(name);
            }
            if (email != null &&
                email.length() > 0 &&
                !Objects.equals(student.getEmail(), email)) {
                Optional<Student> studentOptional = studentRepository
                        .findStudentByEmail(email);
                if(studentOptional.isPresent()) {
                    throw new IllegalStateException("This email is already being used...");
                }
                student.setEmail(email);
        }
    }
}

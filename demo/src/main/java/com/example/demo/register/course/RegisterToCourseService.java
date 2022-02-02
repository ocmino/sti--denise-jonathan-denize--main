package com.example.demo.register.course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class RegisterToCourseService {


    private final RegisterToCourseRepository registerToCourseRepository;

    @Autowired
    public RegisterToCourseService(RegisterToCourseRepository registerToCourseRepository) {
        this.registerToCourseRepository = registerToCourseRepository;
    }

    public void addNewStudentToCourse(RegistrationToCourse studentToCourse) {
    }

    public void deleteStudentToCourse(Long studentId) {
    }

    public void updateStudentToCourse(int studentId, int courseCode, int id) {
    }


    @GetMapping
    public List<RegistrationToCourse> getCourseAndStudent() {
        return registerToCourseRepository.findAll();}



}



package com.example.demo.register.course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CourseAndStudentService {


    private final CourseAndStudentRepository courseAndStudentRepository;

    @Autowired
    public CourseAndStudentService(CourseAndStudentRepository courseAndStudentRepository) {
        this.courseAndStudentRepository = courseAndStudentRepository;
    }

    public void addNewStudentToCourse(CoursAndStudent studentToCourse) {
    }

    public void deleteStudentToCourse(Long studentId) {
    }

    public void updateStudentToCourse(int studentId, int courseCode, int id) {
    }


    @GetMapping
    public List<CoursAndStudent> getCourseAndStudent() {
        return courseAndStudentRepository.findAll();}



}



package com.example.demo.register.course;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1/coursAndStudent")
public class CourseAndStudentController {


    private final CourseAndStudentService courseAndStudentService;

    @Autowired
    public CourseAndStudentController(CourseAndStudentService courseAndStudentService) {
        this.courseAndStudentService = courseAndStudentService;
    }

    @GetMapping
    public List<CoursAndStudent> getCourseAndStudent(){
        return courseAndStudentService.getCourseAndStudent();
    }


    @PostMapping
    public void registerStudentToCourse(@RequestBody CoursAndStudent studentToCourse) {
        courseAndStudentService.addNewStudentToCourse(studentToCourse);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudentToCourse(@PathVariable("studentId") Long studentId) {
        courseAndStudentService.deleteStudentToCourse(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudentToCourse(
            @PathVariable("studentId") int studentId,
            @RequestParam(required = false) int courseCode,
            @RequestParam(required = false) int id) {
        courseAndStudentService.updateStudentToCourse(studentId, courseCode, id);
    }


}



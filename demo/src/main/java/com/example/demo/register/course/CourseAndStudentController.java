package com.example.demo.register.course;


import com.example.demo.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1/student")
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



package com.example.demo.register.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1/coursAndStudent")
public class RegisterToCourseController {


    private final RegisterToCourseService registerToCourseService;

    @Autowired
    public RegisterToCourseController(RegisterToCourseService registerToCourseService) {
        this.registerToCourseService = registerToCourseService;
    }

    @GetMapping
    public List<RegistrationToCourse> getCourseAndStudent(){
        return registerToCourseService.getCourseAndStudent();
    }


    @PostMapping
    public void registerStudentToCourse(@RequestBody RegistrationToCourse studentToCourse) {
        registerToCourseService.addNewStudentToCourse(studentToCourse);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudentToCourse(@PathVariable("studentId") Long studentId) {
        registerToCourseService.deleteStudentToCourse(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudentToCourse(
            @PathVariable("studentId") int studentId,
            @RequestParam(required = false) int courseCode,
            @RequestParam(required = false) int id) {
        registerToCourseService.updateStudentToCourse(studentId, courseCode, id);
    }

}



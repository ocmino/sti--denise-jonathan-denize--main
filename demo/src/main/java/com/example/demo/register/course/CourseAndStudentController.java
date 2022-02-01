package com.example.demo.register.course;

import com.example.demo.student.Student;
import com.example.demo.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
    public List<Student> getStudents() {
        return courseAndStudentService.getStudents();
    }


    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        courseAndStudentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        courseAndStudentService.deleteStudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") Long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {
        courseAndStudentService.updateStudent(studentId, name, email);
    }
}

}

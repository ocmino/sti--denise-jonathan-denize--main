package com.example.demo.register.course;

import com.example.demo.course.Course;
import com.example.demo.course.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class CourseAndStudentService {


        private final CourseAndStudentRepository courseAndStudentRepository;

        @Autowired
        public CourseAndStudentService(CourseAndStudentRepository courseAndStudentRepository) {
            this.courseAndStudentRepository = courseAndStudentRepository;
        }

        @GetMapping
        public List<Course> getCourse(){
            return courseAndStudentRepository.findAll();
        }
    }

}

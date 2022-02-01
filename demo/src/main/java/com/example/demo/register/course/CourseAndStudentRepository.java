package com.example.demo.register.course;

import com.example.demo.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CourseAndStudentRepository {


    @Repository
    public interface CourseAndStudentRepository extends JpaRepository<Course, Long> {

    }
}

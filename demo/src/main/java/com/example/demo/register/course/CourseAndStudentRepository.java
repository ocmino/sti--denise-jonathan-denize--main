package com.example.demo.register.course;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface CourseAndStudentRepository extends JpaRepository<CoursAndStudent, Long> {

    }


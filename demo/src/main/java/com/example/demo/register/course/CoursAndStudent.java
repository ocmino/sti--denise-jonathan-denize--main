package com.example.demo.register.course;


import com.example.demo.course.Course;
import com.example.demo.student.Student;
import com.example.demo.teacher.Teacher;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class CoursAndStudent {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "course_code_course_code", nullable = false)
    private Course courseCode;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

}

package com.example.demo.course;

import com.example.demo.student.Student;
import com.example.demo.teacher.Teacher;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Course {
    @Id
    @SequenceGenerator(
            name = "course_sequence",
            sequenceName = "course_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_sequence"
    )


    private long courseCode;
    private int yhPoints;
    private int hours;
    private int teacher;
    private int student;


    public Course() {
    }

    public Course(long courseCode) {
        this.courseCode = courseCode;
    }

    public Course(int yhPoints, int hours) {
        this.yhPoints = yhPoints;
        this.hours = hours;
    }

    public Course(long courseCode, int student) {
        this.courseCode = courseCode;
        this.student = student;
    }


    public Course(long courseCode, int yhPoints, int hours, int student) {
        this.courseCode = courseCode;
        this.yhPoints = yhPoints;
        this.hours = hours;
        this.student = student;
    }

    @Override
    public String toString() {
        return "Course{" +
                "yhPoints=" + yhPoints +
                ", courseCode='" + courseCode + '\'' +
                ", hours=" + hours +
                '}';
    }
}

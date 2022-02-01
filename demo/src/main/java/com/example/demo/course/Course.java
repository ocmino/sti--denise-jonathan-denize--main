package com.example.demo.course;

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

    public Course() {
    }

    public Course(long courseCode) {
        this.courseCode = courseCode;
    }

    public Course(int yhPoints, int hours) {
        this.yhPoints = yhPoints;
        this.hours = hours;
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
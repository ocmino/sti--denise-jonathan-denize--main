package com.example.demo.register.course;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter

public class CoursAndStudent {
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
    private int id;

    private int courseCode;
    private int studentId;
    private int teacherId;


    public CoursAndStudent() {

    }

    public CoursAndStudent(int courseCode, int studentId) {
        this.courseCode = courseCode;
        this.studentId = studentId;
    }


    @Override
    public String toString() {
        return "CoursAndStudent{" +
                "id=" + id +
                ", courseCode=" + courseCode +
                ", studentId=" + studentId +
                ", teacherId=" + teacherId +
                '}';
    }
}

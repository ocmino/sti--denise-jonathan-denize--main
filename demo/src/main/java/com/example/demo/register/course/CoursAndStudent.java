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
            name = "coursAndStudent_sequence",
            sequenceName = "coursAndStudent_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "coursAndStudent_sequence"
    )
    private int id;

    private int courseCode;
    private int studentId;
    private int teacherId;


    public CoursAndStudent() {

    }

    public CoursAndStudent(int id, int courseCode, int studentId) {
        this.id = id;
        this.courseCode = courseCode;
        this.studentId = studentId;
    }

    public CoursAndStudent(int courseCode, int studentId) {
        this.courseCode = courseCode;
        this.studentId = studentId;
    }

   /* public CoursAndStudent(int courseCode, int teacherId) {
        this.courseCode = courseCode;
        this.teacherId = teacherId;
    }*/
    @Override
    public String toString() {
        return
                ", courseCode=" + courseCode +
                ", studentId=" + studentId +
                ", teacherId=" + teacherId +
                '}';
    }
}

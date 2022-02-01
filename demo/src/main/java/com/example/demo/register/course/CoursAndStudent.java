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
    @Column(name = "id", nullable = false)
    private Long id;

    private int courseCode;
    private int studentId;
    private int teacherId;


    public CoursAndStudent() {

    }

    public CoursAndStudent(int courseCode, int studentId) {
        this.courseCode = courseCode;
        this.studentId = studentId;
    }


    public CoursAndStudent(int courseCode, int teacherId) {
        this.courseCode = courseCode;
        this.teacherId = teacherId;
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

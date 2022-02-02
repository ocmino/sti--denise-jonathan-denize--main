package com.example.demo.register.course;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter

public class RegistrationToCourse {
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
    private int courseCode;
    private int studentId;
    private Long teacherId;


    public RegistrationToCourse() {

    }

    public RegistrationToCourse(int courseCode, int studentId) {
        this.courseCode = courseCode;
        this.studentId = studentId;
    }

   public RegistrationToCourse(int courseCode, Long teacherId) {
        this.courseCode = courseCode;
        this.teacherId = teacherId;
    }


    @Override
    public String toString() {
        return
                ", courseCode=" + courseCode +
                ", studentId=" + studentId +
                ", teacherId=" + teacherId +
                '}';
    }
}

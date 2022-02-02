package com.example.demo.teacher;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
@Getter
@Setter
public class Teacher {
    @Id
    @SequenceGenerator(
            name = "teacher_sequence",
            sequenceName = "teacher_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "teacher_sequence"
    )
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private double salaryPerHour;
    @Transient
    private Integer age;

    public Teacher() {
    }

    public Teacher(Long id,
                   String firstName,
                   String lastName,
                   LocalDate dob,
                   Integer age,
                   double salaryPerHour) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.age = age;
        this.salaryPerHour = salaryPerHour;
    }

    public Teacher(String firstName,
                   String lastName,
                   LocalDate dob, double salaryPerHour) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.salaryPerHour = salaryPerHour;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", salary per hour= " + salaryPerHour +
                '}';
    }
}

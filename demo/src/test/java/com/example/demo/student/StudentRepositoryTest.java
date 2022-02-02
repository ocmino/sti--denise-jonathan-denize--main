/*
package com.example.demo.student;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static java.time.Month.JANUARY;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@ExtendWith(MockitoExtension.class)
class StudentRepositoryTest {

    @Mock
    private StudentRepository studentRepository;
    private StudentService underTest;

    @Test
    void shouldFindStudentByEmail() {

        Student student = new Student(
                "Jonathan",
                "lindqvist@gmail.com",
                LocalDate.of(1988, JANUARY, 28)
        );


        given(studentRepository.findStudentByEmail(student.getEmail()))
                .equals("lindqvist@gmail.com");




    }
}*/

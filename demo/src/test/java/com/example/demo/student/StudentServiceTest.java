package com.example.demo.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static java.time.Month.JANUARY;
import static java.time.Month.JULY;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
class StudentServiceTest {

    @Mock
    private StudentRepository studentRepository;
    private StudentService underTest;

    @BeforeEach
    void setUp() {
        underTest = new StudentService(studentRepository);
    }

    @Test
    void deleteStudentTest() {
        // given
        Student student = new Student(
                "Jonathan",
                "lindqvist@gmail.com",
                LocalDate.of(1988, JANUARY, 28)
        );

        given(studentRepository.existsById(student.getId()))
                .willReturn(false);

        // when
        assertThatThrownBy(() ->underTest.deleteStudent(student.getId()))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("pustent with id " + student.getId() + " does not exist...");
    }
}
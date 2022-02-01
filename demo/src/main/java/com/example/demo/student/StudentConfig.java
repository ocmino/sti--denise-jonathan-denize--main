package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student jonathan = new Student(
                    "Jonathan",
                    "jonathan.@gmail.com",
                    LocalDate.of(1989, JANUARY, 28)
            );
            Student denize = new Student(
                    "Denize",
                    "denize@hotmail.com",
                    LocalDate.of(1999, FEBRUARY, 28)
            );
            Student denise = new Student(
                    "Denise",
                    "denise@yahoo.com",
                    LocalDate.of(2010, MARCH, 29)
            );

            repository.saveAll(
                    List.of(jonathan, denize, denise)
            );

        };
    }
}

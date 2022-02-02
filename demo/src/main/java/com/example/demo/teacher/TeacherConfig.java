package com.example.demo.teacher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class TeacherConfig {

    @Bean
    CommandLineRunner commandLineRunner2(TeacherRepository repository){
        return args -> {
            Teacher mikael = new Teacher(
                    "Mikael",
                    "Wallin",
                    LocalDate.of(1965, FEBRUARY, 12),
                    1000.0
            );
            Teacher stefan = new Teacher(
                    "Stefan",
                    "Holmberg",
                    LocalDate.of(1970, MARCH, 19),
                    500.0
            );

            Teacher kisslo = new Teacher(
                    "Kisslo",
                    "Shek",
                    LocalDate.of(1979, APRIL, 27),
                    200.0
            );

            repository.saveAll(
                    List.of(mikael, stefan, kisslo)
            );

        };
    }
}

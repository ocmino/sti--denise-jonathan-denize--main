package com.example.demo.register.course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;



@Configuration
public class CourseAndStudentConfig {

    @Bean
    CommandLineRunner commandLineRunner5(CourseAndStudentRepository repository) {
        return args -> {
            CoursAndStudent jonte = new CoursAndStudent(1, 1);

            CoursAndStudent denise = new CoursAndStudent(1, 2
            );


            repository.saveAll(
                    List.of(jonte, denise)
            );

        };

    }
}

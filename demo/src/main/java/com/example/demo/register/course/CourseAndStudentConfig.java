package com.example.demo.register.course;

import com.example.demo.course.Course;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class CourseAndStudentConfig {

    @Bean
    CommandLineRunner commandLineRunner4(CourseAndStudentRepository repository) {
        return args -> {
            CoursAndStudent jonte = new CoursAndStudent(1, 1);
            CoursAndStudent jonte1 = new CoursAndStudent(2,1);
            CoursAndStudent jonte2 = new CoursAndStudent(3,1);
            CoursAndStudent denize = new CoursAndStudent(1,2);
            CoursAndStudent denize1 = new CoursAndStudent(2,2);
            CoursAndStudent denize2 = new CoursAndStudent(3,2);
            CoursAndStudent denise  = new CoursAndStudent(1,3);
            CoursAndStudent denise1 = new CoursAndStudent(2,3);
            CoursAndStudent denise2 = new CoursAndStudent(3,3);

            CoursAndStudent mikael  = new CoursAndStudent(1,3L);
            CoursAndStudent stefan = new CoursAndStudent(2,3L);
            CoursAndStudent kisslo = new CoursAndStudent(3,3L);
            repository.saveAll(List.of(jonte,jonte1,jonte2,denize,denize1,denize2,denise,denise1,denise2, mikael, kisslo,stefan));

        };

    }
}

package com.example.demo.course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CourseConfig {

    @Bean
    CommandLineRunner commandLineRunner3(CourseRepository repository){
        return args -> {
            Course databashantering = new Course(25,
                    55
            );
            Course javaprogrammering = new Course(20,
                    45
            );
            Course html = new Course(20,
                    45
            );


            repository.saveAll(
                    List.of(databashantering, javaprogrammering, html)
            );

        };
    }
}

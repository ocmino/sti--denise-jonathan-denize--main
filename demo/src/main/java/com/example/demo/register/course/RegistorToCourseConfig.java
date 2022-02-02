package com.example.demo.register.course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class RegistorToCourseConfig {

    @Bean
    CommandLineRunner commandLineRunner4(RegisterToCourseRepository repository) {
        return args -> {
            RegistrationToCourse jonte = new RegistrationToCourse(1, 1);
            RegistrationToCourse jonte1 = new RegistrationToCourse(2,1);
            RegistrationToCourse jonte2 = new RegistrationToCourse(3,1);
            RegistrationToCourse denize = new RegistrationToCourse(1,2);
            RegistrationToCourse denize1 = new RegistrationToCourse(2,2);
            RegistrationToCourse denize2 = new RegistrationToCourse(3,2);
            RegistrationToCourse denise  = new RegistrationToCourse(1,3);
            RegistrationToCourse denise1 = new RegistrationToCourse(2,3);
            RegistrationToCourse denise2 = new RegistrationToCourse(3,3);

            RegistrationToCourse mikael  = new RegistrationToCourse(1,1L);
            RegistrationToCourse stefan = new RegistrationToCourse(2,2L);
            RegistrationToCourse kisslo = new RegistrationToCourse(3,3L);
            repository.saveAll(List.of(jonte,jonte1,jonte2,denize,denize1,denize2,denise,denise1,denise2, mikael, kisslo,stefan));

        };

    }
}

package se.sti.stidenisejonathandenize.domain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student jonathan = new Student(
                    "Jonathan",
                    "Lindqvist",
                    "890128"
            );

            Student denize = new Student(
                    "Denize",
                    "Scheffold",
                    "090229"
            );

            Student denise = new Student(
                    "Denise",
                    "Casperson",
                    "100330"
            );
            repository.saveAll(
                    List.of(jonathan, denise, denise)
            );
        };
    }
}

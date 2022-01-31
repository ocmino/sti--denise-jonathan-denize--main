package se.sti.stidenisejonathandenize.domain;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import se.sti.stidenisejonathandenize.domain.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class StudentService {

    private static List<Student> students = Arrays.asList(
            new Student("Jonathan", " Lindqvist"),
            new Student("Denize", " Scheffold"),
            new Student("Denise", "Casperson")
    );



    @GetMapping("/getAllStudents")
    @ApiOperation(value = "Hämta alla studenter")
    public List<String> getAllStudents(){
        List<String> studentNames = new ArrayList<>();
        for(Student student : students){
            studentNames.add(student.toString());
        }
        return studentNames;
    }


    @GetMapping("/getwithname")
    @ApiOperation(value = "Hämta student via namn")
    public Student getUserByGivenName(@RequestParam String givenName){
        Student student = null;
        for(Student s : students){
            if(s.getGivenName().equalsIgnoreCase(givenName)){
                student = s;
            }
        }
        return student;
    }


    @PostMapping("/addnewstudent")
    @ApiOperation(value = "Lägg till ny student")
    public void addStudent(@RequestBody Student newStudent){
        students.add(new Student(newStudent.getGivenName(), newStudent.getSurName()));
    }


}

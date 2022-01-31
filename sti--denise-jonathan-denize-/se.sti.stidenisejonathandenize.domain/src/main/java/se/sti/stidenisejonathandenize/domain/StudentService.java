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
            new Student("Jonathan", "Lindqvist", "890128"),
            new Student("Denise", "Casperson", "990229"),
            new Student("Denize", "Scheffold", "100330")
    );


    private static List<Course> courses = Arrays.asList(
            new Course("ABC-123"),
            new Course("DEF-456"),
            new Course("GHI-789")
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

    @GetMapping("/getwithSSN")
    @ApiOperation(value = "Hämta student via SSN")
    public Student getUserBySSN(@RequestParam String ssn){
        Student student = null;
        for(Student s : students){
            if(s.getSSN().equalsIgnoreCase(ssn)){
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

    @PostMapping("/addcourse")
    @ApiOperation(value = "Lägg till kurs")
    public void addCourse(@RequestBody Course newCourse){
        courses.add(new Course(newCourse.getCourseCode()));
    }
    @GetMapping("/getwithCourseCode")
    @ApiOperation(value = "Hämta kurs via kurskod")
    public Course getCourseByCode(@RequestParam String courseCode){
        Course course = null;
        for(Course c: courses){
            if(c.getCourseCode().equalsIgnoreCase(courseCode)){
               course = c;
            }
        }
        return course;
    }




}

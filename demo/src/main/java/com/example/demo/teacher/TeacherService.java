package com.example.demo.teacher;

import com.example.demo.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }



    public void addNewTeacher(Teacher teacher) {
        Optional<Teacher> teacherOptional = teacherRepository
                .findTeacherById(teacher.getId());
        if(teacherOptional.isPresent()){
            throw new IllegalStateException("This ID is already being used...");
        }
        teacherRepository.save(teacher);
        System.out.println(teacher);
    }

}

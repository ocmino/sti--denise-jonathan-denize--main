package com.example.demo.teacher;

import com.example.demo.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    @Query("SELECT s FROM Student s WHERE s.id = ?1")
    Optional<Teacher> findTeacherById(long Id);

}

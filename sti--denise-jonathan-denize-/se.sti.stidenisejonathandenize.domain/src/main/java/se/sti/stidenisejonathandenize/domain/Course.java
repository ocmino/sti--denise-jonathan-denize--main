package se.sti.stidenisejonathandenize.domain;

public class Course {

    private int yhPoints;
    private Teacher teacher;
    private String courseCode;
    private int hours;
    //private Student student;


    public Course(int yhPoints, Teacher teacher, String courseCode, int hours) {
        this.yhPoints = yhPoints;
        this.teacher = teacher;
        this.courseCode = courseCode;
        this.hours = hours;
       // this.student = student;
    }

    public Course(String courseCode) {
        this.courseCode = courseCode;

    }



    public int getYhPoints() {
        return yhPoints;
    }

    public void setYhPoints(int yhPoints) {
        this.yhPoints = yhPoints;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    /*public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }*/

    @Override
    public String toString() {
        return "Kurskod: " + courseCode;
    }


}

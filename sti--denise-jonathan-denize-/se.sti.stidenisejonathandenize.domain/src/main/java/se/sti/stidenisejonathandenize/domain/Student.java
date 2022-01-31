package se.sti.stidenisejonathandenize.domain;

import java.util.List;

public class Student {

    private String givenName;
    private String surName;
    private String SSN;
    private List <Course> courses;
    private Computer computer;

    public Student(String givenName, String surName) {
        this.givenName = givenName;
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public List getCourses() {
        return courses;
    }

    public void setCourses(List courses) {
        this.courses = courses;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }


    @Override
    public String toString() {
        return "Student: " + givenName + " " + surName + "Course Name: " + courses;
    }
}

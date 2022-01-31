package se.sti.stidenisejonathandenize.domain;

import java.util.List;

public class Teacher {

    private String givenName;
    private String surName;
    private String SSN;
    private List<Course> courses;
    private int salaryPerHour;

    public Teacher(String givenName, String surName) {
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

    public void setCSS(String SSN) {
        this.SSN = SSN;
    }

    public List getCourses() {
        return courses;
    }

    public void setCourses(List courses) {
        this.courses = courses;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }


    @Override
    public String toString() {
        return "Teacher: " + givenName + " " + surName + ". Teaches: " + courses;
    }
}

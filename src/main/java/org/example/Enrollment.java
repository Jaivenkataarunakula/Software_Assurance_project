package org.example;
public class Enrollment {
    private Course course;
    private String semester;
    private Double grade;

    public Enrollment(Course course, String semester) {
        this.course = course;
        this.semester = semester;
        this.grade = null; // grade is initially not assigned
    }

    public Course getCourse() {
        return course;
    }

    public String getSemester() {
        return semester;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}
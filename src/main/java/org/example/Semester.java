package org.example;

import java.util.HashMap;
import java.util.Map;

public class Semester {
    private String semesterName;
    private Map<String, Course> courses;

    public Semester(String semesterName) {
        this.semesterName = semesterName;
        this.courses = new HashMap<>();
    }

    public void addCourse(Course course) {
        courses.put(course.getCourseCode(), course);
    }

    public void displayCourses() {
        System.out.println("Courses in " + semesterName + " Semester:");
        for (Course course : courses.values()) {
            System.out.println(course.getCourseName());
        }
    }

    public String getSemesterName() {
        return semesterName;
    }

    public Map<String, Course> getCourses() {
        return courses;
    }
}
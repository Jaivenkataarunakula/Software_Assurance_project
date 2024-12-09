package org.example;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private String teacherId;
    private List<Course> courses;

    public Teacher(String name, String teacherId) {
        this.name = name;
        this.teacherId = teacherId;
        this.courses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        courses.add(course);
    }

    public void displayCourses() {
        System.out.println(name + "'s Courses:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    public void assignGrade(Student student, Course course, String semester, double grade) {
        for (Enrollment enrollment : student.getEnrollments()) {
            if (enrollment.getCourse().equals(course) && enrollment.getSemester().equals(semester)) {
                enrollment.setGrade(grade);
                System.out.println("Grade for " + student.getName() + " in " + course.getCourseName() + " (" + semester + ") set to " + grade);
            }
        }
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }
}
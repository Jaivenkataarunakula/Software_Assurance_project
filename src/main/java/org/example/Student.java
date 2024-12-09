package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String studentId;
    private List<Enrollment> enrollments;

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.enrollments = new ArrayList<>();
    }

    public void enroll(Course course, String semester) {
        enrollments.add(new Enrollment(course, semester));
        course.addStudent(this, semester);
    }

    public void dropCourse(Course course, String semester) {
        enrollments.removeIf(e -> e.getCourse().equals(course) && e.getSemester().equals(semester));
        course.removeStudent(this, semester);
    }

    public void displayCourses() {
        System.out.println(name + "'s Enrolled Courses:");
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment.getCourse().getCourseName() + " (" + enrollment.getSemester() + ")");
        }
    }

    public void displayGrades() {
        System.out.println(name + "'s Grades:");
        for (Enrollment enrollment : enrollments) {
            Double grade = enrollment.getGrade();
            if (grade == null) {
                System.out.println(enrollment.getCourse().getCourseName() + ": No grade assigned yet.");
            } else {
                System.out.println(enrollment.getCourse().getCourseName() + ": " + grade);
            }
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }
}
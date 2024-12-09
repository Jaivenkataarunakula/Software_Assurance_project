package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {
    private String courseName;
    private String courseCode;
    private Teacher teacher;

    private Map<String, List<Student>> enrolledStudentsPerSemester;
    private Map<String, Double> courseGrades;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.enrolledStudentsPerSemester = new HashMap<>();
        this.courseGrades = new HashMap<>();
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student, String semester) {
        enrolledStudentsPerSemester.putIfAbsent(semester, new ArrayList<>());
        enrolledStudentsPerSemester.get(semester).add(student);
    }

    public void removeStudent(Student student, String semester) {
        List<Student> students = enrolledStudentsPerSemester.get(semester);
        if (students != null) {
            students.remove(student);
        }
    }

    public void displayStudents(String semester) {
        System.out.println("Students enrolled in " + courseName + " (" + semester + "):");
        List<Student> students = enrolledStudentsPerSemester.get(semester);
        if (students != null) {
            for (Student student : students) {
                System.out.println(student.getName());
            }
        } else {
            System.out.println("No students enrolled.");
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Map<String, List<Student>> getEnrolledStudentsPerSemester() {
        return enrolledStudentsPerSemester;
    }

    public void assignGrade(String studentId, double grade, String semester) {
        String key = studentId + ":" + semester;
        courseGrades.put(key, grade);
    }

    public Double getGrade(String studentId, String semester) {
        return courseGrades.get(studentId + ":" + semester);
    }
}

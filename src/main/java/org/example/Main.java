package org.example;

public class Main {
    public static void main(String[] args) {
        SchoolManagementSystem system = new SchoolManagementSystem();

        // Add Students
        system.addStudent("Alice", 20, "S1001");
        system.addStudent("Bob", 22, "S1002");

        // Add Teachers
        system.addTeacher("Dr. Smith", "T2001");
        system.addTeacher("Prof. Johnson", "T2002");

        // Add Courses
        system.addCourse("Mathematics", "C3001");
        system.addCourse("Science", "C3002");

        // Add Semesters
        system.addSemester("Fall 2024");
        system.addSemester("Spring 2025");

        // Assign Teachers to Courses
        system.assignTeacherToCourse("T2001", "C3001");
        system.assignTeacherToCourse("T2002", "C3002");

        // Enroll Students in Courses for Specific Semesters
        system.enrollStudentInCourse("S1001", "C3001", "Fall 2024");
        system.enrollStudentInCourse("S1002", "C3002", "Fall 2024");
        system.assignGradeToStudent("T2001", "S1001", "C3001", 90.0, "Fall 2024");
        system.assignGradeToStudent("T2002", "S1002", "C3002", 85.0, "Fall 2024");
        system.displayStudentCourses("S1001");
        system.displayTeacherCourses("T2001");
        system.displayCourseStudents("C3001", "Fall 2024");
        system.displayGrades("S1001");
    }
}
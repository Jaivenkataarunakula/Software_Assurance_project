package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    private SchoolManagementSystem system;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        system = new SchoolManagementSystem();
        System.setOut(new PrintStream(outputStream));

        // Initialize basic data
        system.addStudent("Alice", 20, "S1001");
        system.addStudent("Bob", 22, "S1002");
        system.addTeacher("Dr. Smith", "T2001");
        system.addTeacher("Prof. Johnson", "T2002");
        system.addCourse("Mathematics", "C3001");
        system.addCourse("Science", "C3002");
        system.addSemester("Fall 2024");
        system.addSemester("Spring 2025");
    }

    @Test
    void testBasicSystemSetup() {
        assertNotNull(system);
        assertFalse(outputStream.toString().contains("Student added successfully"));
        assertFalse(outputStream.toString().contains("Teacher added successfully"));
        assertFalse(outputStream.toString().contains("Course added successfully"));
        assertFalse(outputStream.toString().contains("Semester added successfully"));
    }

    @Test
    void testTeacherAssignment() {
        system.assignTeacherToCourse("T2001", "C3001");
        system.assignTeacherToCourse("T2002", "C3002");

        system.displayTeacherCourses("T2001");
        assertTrue(outputStream.toString().contains("Mathematics"));
    }

    @Test
    void testStudentEnrollment() {
        system.assignTeacherToCourse("T2001", "C3001");
        system.enrollStudentInCourse("S1001", "C3001", "Fall 2024");

        system.displayStudentCourses("S1001");
        assertTrue(outputStream.toString().contains("Mathematics"));
    }

    @Test
    void testGradeAssignment() {
        system.assignTeacherToCourse("T2001", "C3001");
        system.enrollStudentInCourse("S1001", "C3001", "Fall 2024");
        system.assignGradeToStudent("T2001", "S1001", "C3001", 90.0, "Fall 2024");

        system.displayGrades("S1001");
        assertTrue(outputStream.toString().contains("90.0"));
    }

    @Test
    void testCourseStudentsDisplay() {
        system.assignTeacherToCourse("T2001", "C3001");
        system.enrollStudentInCourse("S1001", "C3001", "Fall 2024");
        system.enrollStudentInCourse("S1002", "C3001", "Fall 2024");

        system.displayCourseStudents("C3001", "Fall 2024");
        assertTrue(outputStream.toString().contains("Alice"));
        assertTrue(outputStream.toString().contains("Bob"));
    }

    @Test
    void testCompleteFlow() {
        // Test the complete flow as in main method
        system.assignTeacherToCourse("T2001", "C3001");
        system.assignTeacherToCourse("T2002", "C3002");
        system.enrollStudentInCourse("S1001", "C3001", "Fall 2024");
        system.enrollStudentInCourse("S1002", "C3002", "Fall 2024");
        system.assignGradeToStudent("T2001", "S1001", "C3001", 90.0, "Fall 2024");
        system.assignGradeToStudent("T2002", "S1002", "C3002", 85.0, "Fall 2024");

        system.displayStudentCourses("S1001");
        system.displayTeacherCourses("T2001");
        system.displayCourseStudents("C3001", "Fall 2024");
        system.displayGrades("S1001");

        String output = outputStream.toString();
        assertTrue(output.contains("Mathematics"));
        assertTrue(output.contains("90.0"));
        assertTrue(output.contains("Alice"));
    }

    @Test
    void testMainMethod() {
        // Test the main method directly
        Main.main(new String[]{});

        String output = outputStream.toString();
        assertTrue(output.contains("Mathematics"));
        assertTrue(output.contains("Science"));
        assertTrue(output.contains("90.0"));
        assertTrue(output.contains("85.0"));
    }

    @Test
    void testInvalidOperations() {
        // Test invalid teacher assignment
        system.assignTeacherToCourse("T9999", "C3001");
        assertFalse(outputStream.toString().contains("Teacher not found"));

        // Test invalid student enrollment
        system.enrollStudentInCourse("S9999", "C3001", "Fall 2024");
        assertFalse(outputStream.toString().contains("Student not found"));

        // Test invalid grade assignment
        system.assignGradeToStudent("T2001", "S9999", "C3001", 90.0, "Fall 2024");
        assertFalse(outputStream.toString().contains("Student not found"));
    }
}

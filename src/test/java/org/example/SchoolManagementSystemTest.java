package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class SchoolManagementSystemTest {
    private SchoolManagementSystem system;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalSystemOut = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
        system = new SchoolManagementSystem();
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalSystemOut);
        outputStream.reset();
    }

    private boolean outputContains(String expected) {
        return outputStream.toString().contains(expected);
    }

    @Test
    public void testCompleteStudentLifecycle() {
        // Add student and verify
        system.addStudent("John Doe", 20, "S001");
        assertTrue(outputContains("Student added: John Doe"));

        // Try to add same student
        system.addStudent("John Doe", 20, "S001");
        assertTrue(outputContains("Student with ID S001 already exists"));

        // Add course and semester
        system.addCourse("Math 101", "C001");
        system.addSemester("Fall 2024");

        // Enroll student
        system.enrollStudentInCourse("S001", "C001", "Fall 2024");
        assertTrue(outputContains("John Doe enrolled in Math 101"));

        // Try to enroll in non-existent course
        system.enrollStudentInCourse("S001", "C999", "Fall 2024");
        assertTrue(outputContains("Student, Course, or Semester not found"));

        // Display courses before dropping
        system.displayStudentCourses("S001");

        // Drop course
        system.dropStudentFromCourse("S001", "C001", "Fall 2024");
        assertTrue(outputContains("John Doe dropped from Math 101"));

        // Try to display non-existent student's courses
        system.displayStudentCourses("S999");
        assertTrue(outputContains("Student not found"));
    }

    @Test
    public void testCompleteTeacherLifecycle() {
        // Add teacher and verify
        system.addTeacher("Jane Smith", "T001");
        assertTrue(outputContains("Teacher added: Jane Smith"));

        // Try to add same teacher
        system.addTeacher("Jane Smith", "T001");
        assertTrue(outputContains("Teacher with ID T001 already exists"));

        // Add course and assign teacher
        system.addCourse("Math 101", "C001");
        system.assignTeacherToCourse("T001", "C001");
        assertTrue(outputContains("Jane Smith assigned to Math 101"));

        // Try to assign non-existent teacher
        system.assignTeacherToCourse("T999", "C001");
        assertTrue(outputContains("Teacher or Course not found"));

        // Display teacher's courses
        system.displayTeacherCourses("T001");

        // Try to display non-existent teacher's courses
        system.displayTeacherCourses("T999");
        assertTrue(outputContains("Teacher not found"));
    }

    @Test
    public void testCompleteGradingSystem() {
        // Setup prerequisites
        system.addStudent("John Doe", 20, "S001");
        system.addTeacher("Jane Smith", "T001");
        system.addCourse("Math 101", "C001");
        system.addSemester("Fall 2024");
        system.enrollStudentInCourse("S001", "C001", "Fall 2024");

        // Assign grade
        system.assignGradeToStudent("T001", "S001", "C001", 95.0, "Fall 2024");

        // Try to assign grade with invalid data
        system.assignGradeToStudent("T999", "S001", "C001", 95.0, "Fall 2024");
        assertTrue(outputContains("Teacher, Student, or Course not found"));

        // Display grades
        system.displayGrades("S001");

        // Try to display non-existent student's grades
        system.displayGrades("S999");
        assertTrue(outputContains("Student not found"));
    }

    @Test
    public void testCompleteCourseManagement() {
        // Add course and verify
        system.addCourse("Math 101", "C001");
        assertTrue(outputContains("Course added: Math 101"));

        // Try to add same course
        system.addCourse("Math 101", "C001");
        assertTrue(outputContains("Course with code C001 already exists"));

        // Add semester and verify
        system.addSemester("Fall 2024");
        assertTrue(outputContains("Semester added: Fall 2024"));

        // Try to add same semester
        system.addSemester("Fall 2024");
        assertTrue(outputContains("Semester Fall 2024 already exists"));

        // Display course students (empty)
        system.displayCourseStudents("C001", "Fall 2024");

        // Try to display non-existent course's students
        system.displayCourseStudents("C999", "Fall 2024");
        assertTrue(outputContains("Course not found"));
    }

    @Test
    public void testEdgeCases() {
        // Test with null or empty values
        system.addStudent("", 0, "");
        system.addTeacher("", "");
        system.addCourse("", "");
        system.addSemester("");

        // Test operations with non-existent entities
        system.enrollStudentInCourse("INVALID", "INVALID", "INVALID");
        system.dropStudentFromCourse("INVALID", "INVALID", "INVALID");
        system.assignGradeToStudent("INVALID", "INVALID", "INVALID", -1.0, "INVALID");

        // Test boundary conditions for grade
        system.addStudent("Test Student", 20, "S001");
        system.addTeacher("Test Teacher", "T001");
        system.addCourse("Test Course", "C001");
        system.addSemester("Test Semester");
        system.enrollStudentInCourse("S001", "C001", "Test Semester");
        system.assignGradeToStudent("T001", "S001", "C001", 100.0, "Test Semester");
        system.assignGradeToStudent("T001", "S001", "C001", 0.0, "Test Semester");
    }

    @Test
    public void testExtendedEdgeCases() {
        // Test extremely long strings
        String longString = "a".repeat(1000);
        system.addStudent(longString, 20, "S001");
        system.addTeacher(longString, "T001");
        system.addCourse(longString, "C001");
        system.addSemester(longString);

        // Test special characters
        system.addStudent("John@#$%^&*()_+", 20, "S002");
        system.addTeacher("Jane!@#$%^&*()", "T002");
        system.addCourse("Math!@#$%^&*()", "C002");
        system.addSemester("Fall!@#$%^&*()");

        // Test Unicode characters
        system.addStudent("学生", 20, "S003");
        system.addTeacher("教師", "T003");
        system.addCourse("数学", "C003");
        system.addSemester("学期");

        // Test age boundary cases for students
        system.addStudent("Young Student", -1, "S004");
        system.addStudent("Old Student", Integer.MAX_VALUE, "S005");
        system.addStudent("Zero Age", 0, "S006");
    }

    @Test
    public void testGradeEdgeCases() {
        setupBasicEntities();

        // Test grade boundary values
        system.assignGradeToStudent("T001", "S001", "C001", -1.0, "Fall 2024");
        system.assignGradeToStudent("T001", "S001", "C001", 101.0, "Fall 2024");
        system.assignGradeToStudent("T001", "S001", "C001", Double.MAX_VALUE, "Fall 2024");
        system.assignGradeToStudent("T001", "S001", "C001", Double.MIN_VALUE, "Fall 2024");
        system.assignGradeToStudent("T001", "S001", "C001", Double.NEGATIVE_INFINITY, "Fall 2024");
        system.assignGradeToStudent("T001", "S001", "C001", Double.POSITIVE_INFINITY, "Fall 2024");
        system.assignGradeToStudent("T001", "S001", "C001", Double.NaN, "Fall 2024");
    }

    @Test
    public void testConcurrentEnrollments() {
        setupBasicEntities();

        // Test multiple enrollments in same course
        system.enrollStudentInCourse("S001", "C001", "Fall 2024");
        system.enrollStudentInCourse("S001", "C001", "Fall 2024");

        // Test enrolling in multiple courses same semester
        system.addCourse("Physics", "C002");
        system.addCourse("Chemistry", "C003");
        system.enrollStudentInCourse("S001", "C002", "Fall 2024");
        system.enrollStudentInCourse("S001", "C003", "Fall 2024");
    }

    @Test
    public void testMultipleTeacherAssignments() {
        setupBasicEntities();
        system.addTeacher("Second Teacher", "T002");

        // Test multiple teacher assignments to same course
        system.assignTeacherToCourse("T001", "C001");
        system.assignTeacherToCourse("T002", "C001");
    }

    @Test
    public void testCaseInsensitivityHandling() {
        // Test case sensitivity in IDs and names
        system.addStudent("John Doe", 20, "s001");
        system.addStudent("John Doe", 20, "S001");
        system.addTeacher("Jane Smith", "t001");
        system.addTeacher("Jane Smith", "T001");
        system.addCourse("Math", "c001");
        system.addCourse("Math", "C001");
    }

    @Test
    public void testWhitespaceHandling() {
        // Test whitespace in names and IDs
        system.addStudent("   John   Doe   ", 20, "  S001  ");
        system.addTeacher("   Jane   Smith   ", "  T001  ");
        system.addCourse("   Math   101   ", "  C001  ");
        system.addSemester("   Fall   2024   ");
    }

    private void setupBasicEntities() {
        system.addStudent("John Doe", 20, "S001");
        system.addTeacher("Jane Smith", "T001");
        system.addCourse("Math 101", "C001");
        system.addSemester("Fall 2024");
    }
}


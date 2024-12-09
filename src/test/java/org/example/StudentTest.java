package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student student;
    private Course course1;
    private Course course2;

    @BeforeEach
    void setUp() {
        student = new Student("Alice", 20, "S1001");
        course1 = new Course("Mathematics", "C3001");
        course2 = new Course("Science", "C3002");
    }

    @Test
    void testEnroll() {
        student.enroll(course1, "Fall 2024");
        student.enroll(course2, "Fall 2024");

        List<Enrollment> enrollments = student.getEnrollments();

        assertEquals(2, enrollments.size());
        assertEquals("Mathematics", enrollments.get(0).getCourse().getCourseName());
        assertEquals("Science", enrollments.get(1).getCourse().getCourseName());
        assertEquals("Fall 2024", enrollments.get(0).getSemester());
    }

    @Test
    void testDropCourse() {
        student.enroll(course1, "Fall 2024");
        student.enroll(course2, "Fall 2024");

        student.dropCourse(course1, "Fall 2024");

        List<Enrollment> enrollments = student.getEnrollments();

        assertEquals(1, enrollments.size());
        assertEquals("Science", enrollments.get(0).getCourse().getCourseName());
    }

    @Test
    void testDisplayCourses() {
        student.enroll(course1, "Fall 2024");
        student.enroll(course2, "Spring 2025");

        student.displayCourses(); // Manual verification for printed output
    }

    @Test
    void testDisplayGradesWithoutGradesAssigned() {
        student.enroll(course1, "Fall 2024");

        student.displayGrades(); // Manual verification for printed output
    }

    @Test
    void testDisplayGradesWithGradesAssigned() {
        student.enroll(course1, "Fall 2024");
        Enrollment enrollment = student.getEnrollments().get(0);
        enrollment.setGrade(95.0);

        student.displayGrades(); // Manual verification for printed output
    }

    @Test
    void testGetStudentId() {
        assertEquals("S1001", student.getStudentId());
    }

    @Test
    void testGetName() {
        assertEquals("Alice", student.getName());
    }

    @Test
    void testGetAge() {
        assertEquals(20, student.getAge());
    }

    @Test
    void testGetEnrollments() {
        student.enroll(course1, "Fall 2024");
        student.enroll(course2, "Spring 2025");

        List<Enrollment> enrollments = student.getEnrollments();

        assertEquals(2, enrollments.size());
        assertEquals("Mathematics", enrollments.get(0).getCourse().getCourseName());
        assertEquals("Science", enrollments.get(1).getCourse().getCourseName());
    }
}

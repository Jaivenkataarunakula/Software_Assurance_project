package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SemesterTest {
    private Semester semester;

    @BeforeEach
    void setUp() {
        semester = new Semester("Fall 2024");
    }

    @Test
    void testAddCourse() {
        Course course1 = new Course("Mathematics", "C3001");
        Course course2 = new Course("Science", "C3002");

        semester.addCourse(course1);
        semester.addCourse(course2);

        assertEquals(2, semester.getCourses().size());
        assertTrue(semester.getCourses().containsKey("C3001"));
        assertTrue(semester.getCourses().containsKey("C3002"));
        assertEquals("Mathematics", semester.getCourses().get("C3001").getCourseName());
    }

    @Test
    void testDisplayCourses() {
        Course course1 = new Course("Mathematics", "C3001");
        Course course2 = new Course("Science", "C3002");

        semester.addCourse(course1);
        semester.addCourse(course2);

        semester.displayCourses(); // Manual verification for printed output
    }

    @Test
    void testGetSemesterName() {
        assertEquals("Fall 2024", semester.getSemesterName());
    }

    @Test
    void testGetCourses() {
        Course course1 = new Course("Mathematics", "C3001");
        Course course2 = new Course("Science", "C3002");

        semester.addCourse(course1);
        semester.addCourse(course2);

        Map<String, Course> courses = semester.getCourses();
        assertEquals(2, courses.size());
        assertEquals("Mathematics", courses.get("C3001").getCourseName());
        assertEquals("Science", courses.get("C3002").getCourseName());
    }

    @Test
    void testAddDuplicateCourse() {
        Course course1 = new Course("Mathematics", "C3001");
        Course duplicateCourse = new Course("Advanced Mathematics", "C3001");

        semester.addCourse(course1);
        semester.addCourse(duplicateCourse);

        // Verify that the second course replaces the first due to the same course code
        assertEquals(1, semester.getCourses().size());
        assertEquals("Advanced Mathematics", semester.getCourses().get("C3001").getCourseName());
    }
}

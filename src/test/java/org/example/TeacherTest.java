package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Field;


import java.lang.reflect.Field;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {
    private Teacher teacher;
    private Course course1;
    private Course course2;
    private Student student;

    @BeforeEach
    void setUp() {
        teacher = new Teacher("Dr. Smith", "T2001");
        course1 = new Course("Mathematics", "C3001");
        course2 = new Course("Science", "C3002");
        student = new Student("Alice", 20, "S1001");
    }

    @Test
    void testAssignCourse() throws NoSuchFieldException, IllegalAccessException {
        teacher.assignCourse(course1);
        teacher.assignCourse(course2);

        Field coursesField = Teacher.class.getDeclaredField("courses");
        coursesField.setAccessible(true);
        List<Course> courses = (List<Course>) coursesField.get(teacher);

        assertEquals(2, courses.size());
        assertTrue(courses.contains(course1));
        assertTrue(courses.contains(course2));
        assertEquals("Mathematics", courses.get(0).getCourseName());
    }

    @Test
    void testDisplayCourses() {
        teacher.assignCourse(course1);
        teacher.assignCourse(course2);

        teacher.displayCourses(); // Manual verification for printed output
    }

    @Test
    void testAssignGrade() {
        student.enroll(course1, "Fall 2024");
        teacher.assignGrade(student, course1, "Fall 2024", 95.0);

        List<Enrollment> enrollments = student.getEnrollments();

        assertEquals(1, enrollments.size());
        assertEquals(95.0, enrollments.get(0).getGrade());
    }

    @Test
    void testAssignGradeToWrongCourse() {
        student.enroll(course2, "Fall 2024");
        teacher.assignGrade(student, course1, "Fall 2024", 80.0);

        List<Enrollment> enrollments = student.getEnrollments();

        assertNull(enrollments.get(0).getGrade()); // No grade assigned since the course doesn't match
    }

    @Test
    void testGetTeacherId() {
        assertEquals("T2001", teacher.getTeacherId());
    }

    @Test
    void testGetName() {
        assertEquals("Dr. Smith", teacher.getName());
    }
}

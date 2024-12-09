package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnrollmentTest {

    private Course course;
    private Enrollment enrollment;

    @BeforeEach
    public void setUp() {
        // Initialize the Course object
        course = new Course("Mathematics", "MATH101");

        // Initialize the Enrollment object with a course and semester
        enrollment = new Enrollment(course, "Spring2024");
    }

    @Test
    public void testGetCourse() {
        // Verify the course associated with the enrollment
        assertEquals(course, enrollment.getCourse());
    }

    @Test
    public void testGetSemester() {
        // Verify the semester associated with the enrollment
        assertEquals("Spring2024", enrollment.getSemester());
    }

    @Test
    public void testGetGrade_initiallyNull() {
        // Verify that the grade is initially null
        assertNull(enrollment.getGrade());
    }

    @Test
    public void testSetGrade() {
        // Set a grade for the enrollment
        enrollment.setGrade(95.0);

        // Verify the grade is set correctly
        assertEquals(95.0, enrollment.getGrade());
    }

    @Test
    public void testGetGrade_afterSetting() {
        // Set a grade and verify it
        enrollment.setGrade(90.0);
        assertEquals(90.0, enrollment.getGrade());

        // Set a new grade and verify the updated grade
        enrollment.setGrade(85.0);
        assertEquals(85.0, enrollment.getGrade());
    }
}

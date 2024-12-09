package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Map;

public class CourseTest {
    private Course course;
    private Student student1;
    private Student student2;
    private Teacher teacher;

    @BeforeEach
    public void setUp() {
        course = new Course("Math 101", "C001");
        teacher = new Teacher("Jane Smith", "T001");
        student1 = new Student("John Doe", 20, "S001");
        student2 = new Student("Alice Johnson", 21, "S002");

        course.setTeacher(teacher); // Assign teacher to the course
    }

    @Test
    public void testAddStudent() {
        course.addStudent(student1, "Fall 2024");
        course.addStudent(student2, "Fall 2024");

        List<Student> students = course.getEnrolledStudentsPerSemester().get("Fall 2024");

        // Ensure both students are enrolled in the course for Fall 2024
        assertNotNull(students);
        assertEquals(2, students.size());
        assertTrue(students.contains(student1));
        assertTrue(students.contains(student2));
    }

    @Test
    public void testRemoveStudent() {
        course.addStudent(student1, "Fall 2024");
        course.addStudent(student2, "Fall 2024");

        course.removeStudent(student1, "Fall 2024");

        List<Student> students = course.getEnrolledStudentsPerSemester().get("Fall 2024");

        // Ensure student1 is removed from the Fall 2024 semester
        assertNotNull(students);
        assertEquals(1, students.size());
        assertFalse(students.contains(student1));
        assertTrue(students.contains(student2));
    }

    @Test
    public void testDisplayStudents() {
        course.addStudent(student1, "Fall 2024");
        course.addStudent(student2, "Fall 2024");

        // Capture printed output to ensure the displayStudents method works as expected
        // Normally, you'd capture this output and assert it, but it's difficult with plain JUnit.
        // This test mainly ensures no exceptions are thrown.
        assertDoesNotThrow(() -> course.displayStudents("Fall 2024"));
    }

    @Test
    public void testAssignGrade() {
        course.addStudent(student1, "Fall 2024");

        // Assign a grade for student1
        course.assignGrade(student1.getStudentId(), 95.0, "Fall 2024");

        // Ensure the grade is correctly stored
        Double grade = course.getGrade(student1.getStudentId(), "Fall 2024");
        assertNotNull(grade);
        assertEquals(95.0, grade);
    }

    @Test
    public void testGetGrade() {
        course.addStudent(student1, "Fall 2024");

        // Assign a grade for student1
        course.assignGrade(student1.getStudentId(), 85.0, "Fall 2024");

        // Verify the grade is retrieved correctly
        Double grade = course.getGrade(student1.getStudentId(), "Fall 2024");
        assertNotNull(grade);
        assertEquals(85.0, grade);
    }

    @Test
    public void testGetTeacher() {
        assertEquals(teacher, course.getTeacher());
    }

    @Test
    public void testGetCourseName() {
        assertEquals("Math 101", course.getCourseName());
    }

    @Test
    public void testGetCourseCode() {
        assertEquals("C001", course.getCourseCode());
    }

    @Test
    public void testGetEnrolledStudentsPerSemester() {
        course.addStudent(student1, "Fall 2024");
        course.addStudent(student2, "Fall 2024");

        // Ensure the students are listed correctly under the Fall 2024 semester
        Map<String, List<Student>> enrolledStudents = course.getEnrolledStudentsPerSemester();
        assertNotNull(enrolledStudents);
        assertTrue(enrolledStudents.containsKey("Fall 2024"));
        assertEquals(2, enrolledStudents.get("Fall 2024").size());
    }

}

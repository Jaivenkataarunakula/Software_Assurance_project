import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addStudent("", (-1), "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addStudent("", (int) (byte) 0, "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) (byte) 0, "");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 1L, "");
        schoolManagementSystem0.addStudent("hi!", 0, "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) 0, "hi!");
        schoolManagementSystem0.addStudent("", (int) (short) 0, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) (byte) -1, "");
        java.lang.Class<?> wildcardClass40 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 1L, "");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.addStudent("hi!", 0, "");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) '4', "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("hi!", 1, "hi!");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("", (int) (byte) 10, "");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) (-1.0f), "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) (byte) -1, "");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.addStudent("", (int) (byte) 0, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) '4', "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("", "hi!");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addStudent("", 1, "hi!");
        schoolManagementSystem0.addStudent("", (-1), "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", 0.0d, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addStudent("", 10, "hi!");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) 10.0f, "");
    }
}


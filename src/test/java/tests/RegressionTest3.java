import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        java.lang.Class<?> wildcardClass29 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addStudent("", (-1), "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addStudent("", 0, "");
        schoolManagementSystem0.addStudent("", (int) (byte) 10, "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 100, "hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addStudent("", 0, "");
        schoolManagementSystem0.addStudent("", (int) (byte) 10, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addStudent("", (int) (short) 0, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addStudent("", 1, "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) (short) 10, "hi!");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) (short) -1, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addStudent("hi!", 10, "");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (-1.0d), "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", (int) (short) 1, "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayCourseStudents("", "");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addStudent("", (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass25 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", (int) (short) -1, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 1, "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) (-1), "hi!");
        java.lang.Class<?> wildcardClass37 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 10, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 100.0f, "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addStudent("", 100, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addStudent("", (int) (short) 10, "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", 0.0d, "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10.0f, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", (int) (short) -1, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addStudent("", 100, "hi!");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", 0.0d, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("hi!", 100, "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 0, "");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.addStudent("", (int) '#', "");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", 0.0d, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addStudent("", (-1), "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 1, "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 0.0f, "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 0.0f, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 0, "hi!");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", 10, "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) (byte) 10, "");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) (byte) 0, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass30 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 1, "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) (short) 10, "hi!");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addStudent("", (int) '#', "");
        schoolManagementSystem0.displayGrades("hi!");
        java.lang.Class<?> wildcardClass35 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (-1.0d), "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) (byte) 100, "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 0.0f, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        java.lang.Class<?> wildcardClass30 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.addStudent("", (int) 'a', "");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) (byte) 10, "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) ' ', "");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 1, "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) '#', "");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 0, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) (-1), "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.addStudent("", (int) (short) -1, "hi!");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) 0, "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (-1.0f), "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) 10L, "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addStudent("", (int) '#', "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", 0.0d, "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) '#', "");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 10, "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", 1.0d, "");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) (-1.0f), "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
        schoolManagementSystem0.addStudent("", (int) (byte) 10, "hi!");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addStudent("", (int) '#', "");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 100, "");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) '#', "");
        schoolManagementSystem0.addStudent("", (int) 'a', "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", 100.0d, "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) 1L, "");
        schoolManagementSystem0.addTeacher("", "hi!");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) '4', "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", 1.0d, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) ' ', "");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10L, "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) (short) -1, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) -1, "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) -1, "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addStudent("", (int) (short) 10, "hi!");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) (short) -1, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) (short) 0, "");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("hi!", "hi!");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) 10.0f, "hi!");
        schoolManagementSystem0.addStudent("", (int) (short) 10, "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", 10.0d, "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", 0.0d, "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }
}


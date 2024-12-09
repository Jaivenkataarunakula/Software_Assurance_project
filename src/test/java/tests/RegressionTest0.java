import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        java.lang.Class<?> wildcardClass8 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass15 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        java.lang.Class<?> wildcardClass20 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        java.lang.Class<?> wildcardClass3 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 1L, "");
        schoolManagementSystem0.addStudent("hi!", 0, "hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass15 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayGrades("");
        java.lang.Class<?> wildcardClass7 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        java.lang.Class<?> wildcardClass11 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        java.lang.Class<?> wildcardClass6 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        java.lang.Class<?> wildcardClass15 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        java.lang.Class<?> wildcardClass16 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 0, "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        java.lang.Class<?> wildcardClass20 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addSemester("hi!");
        java.lang.Class<?> wildcardClass9 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10, "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.addStudent("", (int) 'a', "hi!");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass13 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 1.0f, "hi!");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
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
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addStudent("hi!", (int) (short) -1, "hi!");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.addStudent("", 1, "hi!");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        java.lang.Class<?> wildcardClass16 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        java.lang.Class<?> wildcardClass8 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        java.lang.Class<?> wildcardClass13 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass14 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        java.lang.Class<?> wildcardClass27 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass11 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) (-1.0f), "");
        java.lang.Class<?> wildcardClass33 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addStudent("", (-1), "");
        java.lang.Class<?> wildcardClass22 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        java.lang.Class<?> wildcardClass17 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("", "");
        java.lang.Class<?> wildcardClass17 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 0.0f, "hi!");
        java.lang.Class<?> wildcardClass18 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", 10.0d, "");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) (short) 0, "");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) (short) 0, "hi!");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.displayGrades("");
        java.lang.Class<?> wildcardClass15 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", (int) '#', "hi!");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
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
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        java.lang.Class<?> wildcardClass36 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", 10, "");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 10, "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
        java.lang.Class<?> wildcardClass24 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) '4', "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) 1.0f, "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (-1), "");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", 0.0d, "hi!");
        java.lang.Class<?> wildcardClass16 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addStudent("", 0, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", 10, "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        java.lang.Class<?> wildcardClass28 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        java.lang.Class<?> wildcardClass24 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addCourse("", "");
        java.lang.Class<?> wildcardClass23 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addTeacher("", "");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", 0.0d, "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addStudent("", (-1), "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addSemester("");
        java.lang.Class<?> wildcardClass24 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 1L, "");
        java.lang.Class<?> wildcardClass25 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("hi!", "");
        java.lang.Class<?> wildcardClass24 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.addCourse("hi!", "");
        java.lang.Class<?> wildcardClass29 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) 10L, "hi!");
        schoolManagementSystem0.addStudent("", (int) (short) -1, "hi!");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("", "");
        java.lang.Class<?> wildcardClass14 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass16 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 100, "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addSemester("hi!");
        java.lang.Class<?> wildcardClass20 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 1L, "");
        schoolManagementSystem0.addStudent("hi!", 0, "hi!");
        schoolManagementSystem0.displayGrades("");
        java.lang.Class<?> wildcardClass31 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) '4', "");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) 1L, "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) (short) 100, "");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", 0.0d, "hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", 0.0d, "");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 10, "");
        schoolManagementSystem0.addTeacher("", "");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) (byte) -1, "");
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addStudent("", 100, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        java.lang.Class<?> wildcardClass20 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) 1.0f, "hi!");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", (-1), "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) 100, "hi!");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) -1, "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass22 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        java.lang.Class<?> wildcardClass18 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 1L, "");
        schoolManagementSystem0.addStudent("hi!", 0, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addCourse("hi!", "hi!");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", 0.0d, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        java.lang.Class<?> wildcardClass14 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
        schoolManagementSystem0.addTeacher("", "hi!");
        java.lang.Class<?> wildcardClass40 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addStudent("", (int) (byte) 0, "hi!");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass22 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) (short) -1, "");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        java.lang.Class<?> wildcardClass11 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 0, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addStudent("", (int) (byte) 1, "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10, "hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.addTeacher("", "");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        java.lang.Class<?> wildcardClass17 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        java.lang.Class<?> wildcardClass30 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        java.lang.Class<?> wildcardClass24 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
        java.lang.Class<?> wildcardClass11 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 0, "hi!");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        java.lang.Class<?> wildcardClass24 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) (byte) 10, "hi!");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.addStudent("hi!", 10, "");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass14 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) '4', "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) 10L, "hi!");
        java.lang.Class<?> wildcardClass32 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        java.lang.Class<?> wildcardClass22 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.addTeacher("", "");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        java.lang.Class<?> wildcardClass21 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 1, "");
        schoolManagementSystem0.addStudent("", (int) (short) 0, "hi!");
        schoolManagementSystem0.addStudent("", (int) (short) 100, "hi!");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        java.lang.Class<?> wildcardClass21 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("", (int) (short) 1, "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) 10.0f, "hi!");
        schoolManagementSystem0.addStudent("", (int) (short) 10, "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 0.0f, "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.addStudent("", (int) '4', "hi!");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) -1, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addStudent("", 100, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addSemester("hi!");
        java.lang.Class<?> wildcardClass28 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        java.lang.Class<?> wildcardClass24 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) 10.0f, "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        java.lang.Class<?> wildcardClass22 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addStudent("", (int) (short) 0, "");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addCourse("", "hi!");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", 10, "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayCourseStudents("", "");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        java.lang.Class<?> wildcardClass36 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        java.lang.Class<?> wildcardClass37 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addStudent("", 10, "");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (short) 100, "");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass30 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) (short) 1, "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addStudent("", (int) (byte) 0, "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", 10, "");
        schoolManagementSystem0.addSemester("hi!");
        java.lang.Class<?> wildcardClass22 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (short) 10, "");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) '4', "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass19 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", (int) (short) -1, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        java.lang.Class<?> wildcardClass15 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 100L, "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", (int) (short) 1, "");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) 0L, "hi!");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", 1.0d, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        java.lang.Class<?> wildcardClass15 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        java.lang.Class<?> wildcardClass31 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) (short) 1, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 0.0f, "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", 0.0d, "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        java.lang.Class<?> wildcardClass29 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) (short) 1, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10L, "hi!");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) '#', "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 10, "");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        schoolManagementSystem0.addTeacher("", "hi!");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        java.lang.Class<?> wildcardClass40 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) 0, "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) '#', "hi!");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addTeacher("", "");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 0, "");
        schoolManagementSystem0.addStudent("", (int) (short) 0, "hi!");
        schoolManagementSystem0.addStudent("", (int) (byte) 0, "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) (byte) 0, "hi!");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) 0L, "");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addStudent("", (-1), "hi!");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) -1, "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
        java.lang.Class<?> wildcardClass19 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        java.lang.Class<?> wildcardClass13 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", 10, "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("", (int) (byte) 10, "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        java.lang.Class<?> wildcardClass20 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        java.lang.Class<?> wildcardClass42 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addStudent("", 0, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        schoolManagementSystem0.addTeacher("hi!", "hi!");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", 0.0d, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addStudent("", (int) (byte) 0, "");
        schoolManagementSystem0.addStudent("", 0, "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) (short) -1, "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) 10, "hi!");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", 1.0d, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        java.lang.Class<?> wildcardClass26 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        java.lang.Class<?> wildcardClass33 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        java.lang.Class<?> wildcardClass39 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        schoolManagementSystem0.addStudent("", (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass30 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addStudent("", (int) (byte) 0, "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 100, "");
        schoolManagementSystem0.addStudent("", (int) (byte) 1, "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addStudent("hi!", (int) ' ', "");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 0, "");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) ' ', "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) '4', "hi!");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 100, "");
        schoolManagementSystem0.addStudent("", (int) (byte) 1, "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "hi!");
        schoolManagementSystem0.addCourse("", "");
        java.lang.Class<?> wildcardClass16 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.addSemester("");
        java.lang.Class<?> wildcardClass18 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", 1, "");
        java.lang.Class<?> wildcardClass34 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", (int) (short) -1, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.addStudent("", (int) ' ', "");
        java.lang.Class<?> wildcardClass22 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", 10.0d, "");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addStudent("", (int) (short) 100, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        java.lang.Class<?> wildcardClass33 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", 1.0d, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (-1), "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) 1.0f, "");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("", (int) ' ', "");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 1L, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", 10.0d, "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) 0L, "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) -1, "hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) (-1), "");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", (int) (short) -1, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
        java.lang.Class<?> wildcardClass25 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) 0L, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 100L, "");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 0, "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) ' ', "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        java.lang.Class<?> wildcardClass31 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) 100L, "hi!");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) (short) 1, "");
        schoolManagementSystem0.addStudent("", 0, "hi!");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) 100.0f, "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addStudent("", (int) (byte) 10, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) 10.0f, "");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) 1.0f, "hi!");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 0L, "");
        java.lang.Class<?> wildcardClass34 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addStudent("", (int) (short) 0, "hi!");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", 0.0d, "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10.0f, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) (short) 0, "");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 100, "");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) 0, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "hi!");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addStudent("hi!", 10, "hi!");
        java.lang.Class<?> wildcardClass9 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass24 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) 10L, "hi!");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", 10, "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addStudent("", 0, "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) (-1), "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", 10, "hi!");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.addSemester("hi!");
        java.lang.Class<?> wildcardClass17 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10, "hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addTeacher("", "hi!");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addStudent("", 0, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 0.0f, "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addStudent("", (int) (byte) 1, "");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addStudent("hi!", (int) ' ', "");
        java.lang.Class<?> wildcardClass15 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) (byte) 1, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        java.lang.Class<?> wildcardClass12 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) '4', "hi!");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) (short) 10, "");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 1L, "hi!");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", 10, "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        java.lang.Class<?> wildcardClass13 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addStudent("", 0, "");
        schoolManagementSystem0.addStudent("", (int) (byte) 10, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 100, "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", 1, "");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) 1L, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        schoolManagementSystem0.addStudent("", (int) (byte) 10, "");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 0, "hi!");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addTeacher("", "");
        java.lang.Class<?> wildcardClass24 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10, "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 0, "hi!");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addStudent("", (int) '4', "hi!");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.addStudent("", (int) (byte) 10, "");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", 10, "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 100, "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        schoolManagementSystem0.displayCourseStudents("hi!", "");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 100.0f, "");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) ' ', "hi!");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        java.lang.Class<?> wildcardClass30 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) 0, "hi!");
        schoolManagementSystem0.addStudent("", (int) (short) 0, "");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) 1.0f, "hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        java.lang.Class<?> wildcardClass29 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 0.0f, "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", 0.0d, "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", 1.0d, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addStudent("", 0, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) (short) 1, "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 10, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        java.lang.Class<?> wildcardClass32 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) (byte) 10, "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 100.0f, "");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) (short) 1, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) (byte) -1, "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", 10.0d, "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass32 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) (-1L), "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", 0.0d, "");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        java.lang.Class<?> wildcardClass39 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("", "");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        java.lang.Class<?> wildcardClass21 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        java.lang.Class<?> wildcardClass36 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addCourse("hi!", "hi!");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 1, "");
        java.lang.Class<?> wildcardClass31 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) (short) 0, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) '#', "");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 10, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) 0L, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 1L, "hi!");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) (byte) -1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) (short) 0, "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) (short) 10, "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) (short) -1, "hi!");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        schoolManagementSystem0.addStudent("hi!", (int) (short) -1, "hi!");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass25 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addStudent("", (-1), "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.displayGrades("");
        java.lang.Class<?> wildcardClass33 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        java.lang.Class<?> wildcardClass40 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        java.lang.Class<?> wildcardClass21 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) -1, "");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addStudent("", (int) (byte) 1, "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 10, "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("", (int) (byte) 10, "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "hi!");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) (byte) 100, "");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) '#', "hi!");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) 100.0f, "hi!");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addCourse("", "");
        java.lang.Class<?> wildcardClass12 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", (int) (byte) 10, "hi!");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) (short) -1, "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.displayGrades("hi!");
        java.lang.Class<?> wildcardClass35 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", 1.0d, "hi!");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) ' ', "");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
        java.lang.Class<?> wildcardClass22 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 0.0f, "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", 0.0d, "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.addStudent("", (int) (short) 100, "");
        java.lang.Class<?> wildcardClass9 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", 1.0d, "");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("hi!", 100, "hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addTeacher("", "hi!");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addStudent("", 10, "");
        schoolManagementSystem0.addTeacher("", "");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addStudent("", (int) '4', "");
        schoolManagementSystem0.addTeacher("", "");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.addStudent("", (int) (short) 100, "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) -1, "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) (byte) 1, "");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayTeacherCourses("");
        java.lang.Class<?> wildcardClass20 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", 1.0d, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 10L, "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayStudentCourses("");
        java.lang.Class<?> wildcardClass20 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addStudent("", (int) (byte) 0, "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) '4', "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        java.lang.Class<?> wildcardClass16 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addStudent("", 100, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addStudent("", (int) '#', "");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("", (int) (short) 10, "");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", 0.0d, "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addStudent("", (int) (byte) 0, "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) (byte) 0, "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) ' ', "hi!");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) ' ', "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 1L, "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (-1), "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", 100.0d, "");
    }
}


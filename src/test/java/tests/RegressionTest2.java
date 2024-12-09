import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.addStudent("", (int) (short) 100, "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addStudent("", (int) (byte) 0, "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) (byte) 0, "");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addStudent("hi!", 0, "hi!");
        java.lang.Class<?> wildcardClass33 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addTeacher("hi!", "");
        java.lang.Class<?> wildcardClass19 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) 1.0f, "hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) -1, "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        java.lang.Class<?> wildcardClass22 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) 100.0f, "");
        schoolManagementSystem0.addStudent("", 10, "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 10, "");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", 1.0d, "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("", (int) 'a', "hi!");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addStudent("", (int) (short) 100, "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", 1.0d, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) '4', "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.addStudent("", (int) 'a', "hi!");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("", (int) (byte) 10, "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 10, "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.addStudent("", (int) (short) 10, "");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addStudent("", (int) (byte) 0, "");
        schoolManagementSystem0.addStudent("", 0, "");
        schoolManagementSystem0.addStudent("", (int) 'a', "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 0.0f, "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addStudent("hi!", (-1), "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass18 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) (-1.0f), "hi!");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addStudent("", 100, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) (short) -1, "hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 0.0f, "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 100L, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 0, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) -1, "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        java.lang.Class<?> wildcardClass21 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) (-1.0f), "hi!");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) (byte) 100, "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) 10.0f, "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 1, "");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (-1.0d), "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10.0f, "hi!");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (-1.0d), "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (-1.0d), "hi!");
        schoolManagementSystem0.addStudent("", (int) ' ', "hi!");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) 10, "");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addStudent("", (int) '#', "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", 0.0d, "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) (byte) -1, "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) 10.0f, "hi!");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", 0.0d, "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) '4', "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 100L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) (byte) 1, "hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addStudent("", 0, "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) (-1), "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) 1.0f, "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", 1.0d, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 1L, "");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addStudent("", (int) '#', "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", 0.0d, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        schoolManagementSystem0.addStudent("", 0, "");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) 0.0f, "hi!");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("", (int) (short) 1, "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 0, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("", "hi!");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        java.lang.Class<?> wildcardClass35 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 10, "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) 0, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.addStudent("", (int) ' ', "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", 1.0d, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("", (int) (byte) 10, "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", 10, "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) (short) 100, "hi!");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", 0.0d, "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addStudent("", (int) (byte) 1, "hi!");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) 100.0f, "hi!");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 1L, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        java.lang.Class<?> wildcardClass30 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", 100.0d, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) 0, "hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
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
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", 1.0d, "hi!");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", 1.0d, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 1L, "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 1, "");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) (byte) -1, "hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 0, "");
        schoolManagementSystem0.addStudent("", (int) (short) 0, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) (short) 100, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) '4', "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.addStudent("", (int) (byte) 10, "");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", 0.0d, "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10.0f, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 100, "");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addStudent("", (int) (byte) 0, "");
        schoolManagementSystem0.addStudent("", 0, "");
        schoolManagementSystem0.addStudent("", (int) 'a', "");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.addStudent("hi!", (int) '#', "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.addStudent("hi!", (int) '#', "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 0, "");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (-1.0d), "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addStudent("", 1, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", 0.0d, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        java.lang.Class<?> wildcardClass21 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 0.0f, "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", 0.0d, "");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", 100.0d, "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 100, "hi!");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addStudent("", 0, "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) (-1), "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", 1.0d, "");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) '4', "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        java.lang.Class<?> wildcardClass22 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        java.lang.Class<?> wildcardClass6 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 100, "");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "hi!");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) -1, "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10, "hi!");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) (short) 10, "hi!");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addStudent("hi!", 0, "hi!");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) 0, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) ' ', "");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", (int) '#', "");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("hi!", "hi!");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) '#', "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addStudent("", 10, "hi!");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        schoolManagementSystem0.displayCourseStudents("hi!", "");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("", (int) ' ', "");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 100, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.addStudent("", 1, "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) -1, "");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) (byte) -1, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 10L, "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        schoolManagementSystem0.addStudent("", (int) (byte) 1, "");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) 10.0f, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) (byte) 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "hi!");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addSemester("hi!");
        java.lang.Class<?> wildcardClass29 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) (byte) 1, "");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (-1.0d), "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) (byte) -1, "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) (byte) 1, "");
        schoolManagementSystem0.addStudent("hi!", (int) ' ', "");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10, "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", 0.0d, "hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) (short) 0, "hi!");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("");
        java.lang.Class<?> wildcardClass10 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", (int) (short) -1, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", 0.0d, "hi!");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        schoolManagementSystem0.addTeacher("", "hi!");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 0.0f, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) 0L, "hi!");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 1, "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) 100.0f, "");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) 100.0f, "");
        schoolManagementSystem0.addStudent("", 10, "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 100, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) (byte) 0, "");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) 100.0f, "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", 0.0d, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("", (int) (byte) 1, "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("", (int) (short) 0, "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addStudent("", 10, "");
        schoolManagementSystem0.addStudent("", (-1), "");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.addStudent("", (int) ' ', "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) 10.0f, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 0, "");
        schoolManagementSystem0.addStudent("", (int) (short) 0, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) 100.0f, "hi!");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 1L, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) 'a', "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("", (int) (short) 1, "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 100, "");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addStudent("", 0, "");
        schoolManagementSystem0.addStudent("", (int) (byte) 10, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass24 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 0, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 100, "");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 0.0f, "hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (-1.0d), "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 100, "hi!");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) 100.0f, "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (short) 0, "hi!");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addStudent("", (int) '#', "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", 0.0d, "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 0.0f, "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addStudent("hi!", (-1), "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        java.lang.Class<?> wildcardClass27 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
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
        schoolManagementSystem0.addStudent("", (int) (byte) 10, "hi!");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addCourse("", "hi!");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 1, "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 10, "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (short) 100, "");
        java.lang.Class<?> wildcardClass24 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) (-1), "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) ' ', "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 1L, "hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) (short) 1, "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 0, "");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) (byte) 1, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", 0.0d, "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10.0f, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 100, "");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) (byte) 10, "hi!");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) ' ', "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        java.lang.Class<?> wildcardClass22 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addStudent("hi!", (int) (short) -1, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) (short) 0, "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) (-1), "hi!");
        java.lang.Class<?> wildcardClass31 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 10, "");
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) (byte) 10, "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", (int) (short) -1, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) -1, "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 1L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addStudent("", (int) '#', "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) ' ', "hi!");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 10, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 0, "hi!");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) (byte) 10, "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) 'a', "hi!");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) (byte) 10, "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) '#', "hi!");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("hi!", "");
        java.lang.Class<?> wildcardClass28 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass32 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 10, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.addStudent("", (int) ' ', "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) (-1.0f), "");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
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
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", 10, "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass27 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addStudent("", (int) '#', "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", 0.0d, "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) '#', "");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.addTeacher("", "");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) '4', "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 100, "");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 0.0f, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        java.lang.Class<?> wildcardClass17 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 100, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addStudent("", (int) (short) 10, "hi!");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 10, "");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 10L, "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addStudent("", 0, "hi!");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) 0.0f, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) 10.0f, "hi!");
        java.lang.Class<?> wildcardClass26 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) '4', "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addStudent("", (int) (byte) 100, "");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 1, "");
        schoolManagementSystem0.displayCourseStudents("", "");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addStudent("", 10, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addStudent("", 0, "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) (-1), "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addStudent("hi!", 0, "hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 100, "");
        schoolManagementSystem0.addStudent("", (int) (byte) 1, "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) (short) 10, "hi!");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        schoolManagementSystem0.addStudent("hi!", (-1), "");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 10.0f, "");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) (byte) -1, "hi!");
        schoolManagementSystem0.addStudent("hi!", 100, "");
        schoolManagementSystem0.addStudent("", 0, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("hi!", 10, "");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 0.0f, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addStudent("", (int) (byte) 0, "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) 1.0f, "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", 0.0d, "");
        java.lang.Class<?> wildcardClass47 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 100, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 100L, "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", 1.0d, "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 100L, "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
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
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 10, "");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) (short) 0, "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) (-1), "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) 100L, "");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) '4', "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) '#', "hi!");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
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
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) (-1.0f), "");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 0, "");
        schoolManagementSystem0.addStudent("", (int) (short) 0, "hi!");
        schoolManagementSystem0.addStudent("", (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass21 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addStudent("", (int) (short) 10, "");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 1L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) 1L, "");
        schoolManagementSystem0.addTeacher("", "");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("hi!", (int) (short) 0, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", 0.0d, "");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayCourseStudents("", "");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", (double) (byte) 1, "hi!");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        java.lang.Class<?> wildcardClass26 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) (byte) -1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) (short) 1, "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) ' ', "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
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
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addStudent("hi!", 0, "hi!");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 0L, "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) (-1.0f), "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) (byte) 0, "hi!");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
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
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.addSemester("");
        java.lang.Class<?> wildcardClass28 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) 0, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addStudent("", (int) (short) 100, "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.addStudent("", (int) (byte) 1, "");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 10, "");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 10.0f, "");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) '4', "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", 100.0d, "hi!");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addStudent("", (int) (short) 0, "hi!");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
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
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addStudent("", (int) (byte) 0, "");
        schoolManagementSystem0.addStudent("", 0, "");
        schoolManagementSystem0.addStudent("", (int) 'a', "");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) (byte) -1, "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) 10.0f, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "");
        schoolManagementSystem0.addStudent("hi!", 1, "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 0L, "");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", 0.0d, "hi!");
        schoolManagementSystem0.addStudent("", (int) (byte) 0, "hi!");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
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
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 10L, "");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) (byte) 1, "hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (-1.0d), "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "hi!");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (-1), "");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addStudent("", 100, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        schoolManagementSystem0.addTeacher("", "");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) 10.0f, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 100.0f, "hi!");
        schoolManagementSystem0.addTeacher("", "");
        java.lang.Class<?> wildcardClass35 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) 100L, "");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addStudent("", (int) (short) 10, "");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) '#', "");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) (-1.0f), "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) 100.0f, "");
        schoolManagementSystem0.addStudent("", 10, "");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.addTeacher("", "");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) (short) 0, "hi!");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 1.0f, "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("hi!", (int) (byte) 100, "hi!");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        java.lang.Class<?> wildcardClass32 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.addStudent("hi!", 0, "");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) (-1.0f), "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addStudent("hi!", (int) '4', "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", 1.0d, "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.addStudent("hi!", 10, "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) (short) 100, "hi!");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        java.lang.Class<?> wildcardClass19 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 1L, "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.addCourse("hi!", "");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 1.0f, "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addCourse("hi!", "");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.addCourse("hi!", "hi!");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "", (double) 0.0f, "hi!");
        schoolManagementSystem0.displayStudentCourses("");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", 0.0d, "");
        schoolManagementSystem0.addTeacher("", "hi!");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addTeacher("", "");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.addStudent("", (int) (short) 100, "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.displayTeacherCourses("hi!");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) (short) 100, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addTeacher("hi!", "");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 10L, "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        java.lang.Class<?> wildcardClass18 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("hi!", 100, "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addStudent("hi!", 1, "");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.displayCourseStudents("", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.addTeacher("", "");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "hi!", (double) ' ', "hi!");
        schoolManagementSystem0.addCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addCourse("hi!", "hi!");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.displayCourseStudents("", "");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignGradeToStudent("hi!", "hi!", "hi!", 1.0d, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignTeacherToCourse("", "");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.addTeacher("", "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "", "", (double) 0, "");
        schoolManagementSystem0.addStudent("", (int) (short) 0, "hi!");
        schoolManagementSystem0.addStudent("", (int) (byte) 0, "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.enrollStudentInCourse("", "", "hi!");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 0L, "hi!");
        schoolManagementSystem0.addStudent("hi!", (-1), "hi!");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addSemester("hi!");
        java.lang.Class<?> wildcardClass6 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("", "hi!", "hi!");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 10L, "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.addStudent("hi!", 0, "");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.addSemester("hi!");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.displayCourseStudents("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (double) 1L, "");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (-1.0f), "hi!");
        java.lang.Class<?> wildcardClass23 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "hi!", "hi!");
        schoolManagementSystem0.addSemester("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
        schoolManagementSystem0.displayGrades("");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.displayGrades("");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "hi!", (double) (byte) -1, "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
        schoolManagementSystem0.addStudent("", 0, "");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.dropStudentFromCourse("", "", "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "", "hi!");
        schoolManagementSystem0.addSemester("");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignGradeToStudent("", "", "hi!", (double) 1L, "hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.addTeacher("", "hi!");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.assignTeacherToCourse("", "");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.addSemester("");
        schoolManagementSystem0.addStudent("", (int) (short) -1, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayGrades("hi!");
        schoolManagementSystem0.displayCourseStudents("hi!", "");
        schoolManagementSystem0.addTeacher("", "");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.displayStudentCourses("");
        java.lang.Class<?> wildcardClass9 = schoolManagementSystem0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addCourse("", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", (int) (byte) -1, "hi!");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.dropStudentFromCourse("", "", "");
        schoolManagementSystem0.displayTeacherCourses("hi!");
        schoolManagementSystem0.addStudent("", 1, "");
        schoolManagementSystem0.addTeacher("hi!", "");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.enrollStudentInCourse("hi!", "hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("hi!", (int) 'a', "hi!");
        schoolManagementSystem0.addTeacher("hi!", "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.assignGradeToStudent("", "hi!", "", (-1.0d), "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "hi!");
        schoolManagementSystem0.displayGrades("hi!");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
        schoolManagementSystem0.displayStudentCourses("");
        schoolManagementSystem0.dropStudentFromCourse("hi!", "", "");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        org.example.SchoolManagementSystem schoolManagementSystem0 = new org.example.SchoolManagementSystem();
        schoolManagementSystem0.addStudent("", (int) (short) 1, "hi!");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.enrollStudentInCourse("", "", "");
        schoolManagementSystem0.assignTeacherToCourse("hi!", "");
        schoolManagementSystem0.addTeacher("", "");
        schoolManagementSystem0.assignGradeToStudent("hi!", "", "", (double) 100, "hi!");
        schoolManagementSystem0.displayTeacherCourses("");
        schoolManagementSystem0.displayStudentCourses("hi!");
        schoolManagementSystem0.addTeacher("", "hi!");
    }
}

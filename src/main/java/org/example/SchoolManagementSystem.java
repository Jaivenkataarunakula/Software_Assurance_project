package org.example;


import java.util.HashMap;
import java.util.Map;

public class SchoolManagementSystem {
        private Map<String, Student> students;
        private Map<String, Teacher> teachers;
        private Map<String, Course> courses;
        private Map<String, Semester> semesters;

        public SchoolManagementSystem() {
            students = new HashMap<>();
            teachers = new HashMap<>();
            courses = new HashMap<>();
            semesters = new HashMap<>();
        }


        public void addStudent(String name, int age, String studentId) {
            if (!students.containsKey(studentId)) {
                Student student = new Student(name, age, studentId);
                students.put(studentId, student);
                System.out.println("Student added: " + name);
            } else {
                System.out.println("Student with ID " + studentId + " already exists.");
            }
        }

        public void addTeacher(String name, String teacherId) {
            if (!teachers.containsKey(teacherId)) {
                Teacher teacher = new Teacher(name, teacherId);
                teachers.put(teacherId, teacher);
                System.out.println("Teacher added: " + name);
            } else {
                System.out.println("Teacher with ID " + teacherId + " already exists.");
            }
        }

        public void addCourse(String courseName, String courseCode) {
            if (!courses.containsKey(courseCode)) {
                Course course = new Course(courseName, courseCode);
                courses.put(courseCode, course);
                System.out.println("Course added: " + courseName);
            } else {
                System.out.println("Course with code " + courseCode + " already exists.");
            }
        }

        public void addSemester(String semesterName) {
            if (!semesters.containsKey(semesterName)) {
                Semester semester = new Semester(semesterName);
                semesters.put(semesterName, semester);
                System.out.println("Semester added: " + semesterName);
            } else {
                System.out.println("Semester " + semesterName + " already exists.");
            }
        }

        public void assignTeacherToCourse(String teacherId, String courseCode) {
            Teacher teacher = teachers.get(teacherId);
            Course course = courses.get(courseCode);

            if (teacher != null && course != null) {
                course.setTeacher(teacher);
                teacher.assignCourse(course);
                System.out.println(teacher.getName() + " assigned to " + course.getCourseName());
            } else {
                System.out.println("Teacher or Course not found.");
            }
        }

        public void enrollStudentInCourse(String studentId, String courseCode, String semester) {
            Student student = students.get(studentId);
            Course course = courses.get(courseCode);

            if (student != null && course != null && semesters.containsKey(semester)) {
                student.enroll(course, semester);
                course.addStudent(student, semester);
                System.out.println(student.getName() + " enrolled in " + course.getCourseName() + " for " + semester);
            } else {
                System.out.println("Student, Course, or Semester not found.");
            }
        }

        public void dropStudentFromCourse(String studentId, String courseCode, String semester) {
            Student student = students.get(studentId);
            Course course = courses.get(courseCode);

            if (student != null && course != null && semesters.containsKey(semester)) {
                student.dropCourse(course, semester);
                course.removeStudent(student, semester);
                System.out.println(student.getName() + " dropped from " + course.getCourseName() + " for " + semester);
            } else {
                System.out.println("Student, Course, or Semester not found.");
            }
        }

        public void assignGradeToStudent(String teacherId, String studentId, String courseCode, double grade, String semester) {
            Teacher teacher = teachers.get(teacherId);
            Student student = students.get(studentId);
            Course course = courses.get(courseCode);

            if (teacher != null && student != null && course != null) {
                teacher.assignGrade(student, course, semester, grade);
            } else {
                System.out.println("Teacher, Student, or Course not found.");
            }
        }

        public void displayStudentCourses(String studentId) {
            Student student = students.get(studentId);
            if (student != null) {
                student.displayCourses();
            } else {
                System.out.println("Student not found.");
            }
        }

        public void displayTeacherCourses(String teacherId) {
            Teacher teacher = teachers.get(teacherId);
            if (teacher != null) {
                teacher.displayCourses();
            } else {
                System.out.println("Teacher not found.");
            }
        }

        public void displayCourseStudents(String courseCode, String semester) {
            Course course = courses.get(courseCode);
            if (course != null) {
                course.displayStudents(semester);
            } else {
                System.out.println("Course not found.");
            }
        }

        public void displayGrades(String studentId) {
            Student student = students.get(studentId);
            if (student != null) {
                student.displayGrades();
            } else {
                System.out.println("Student not found.");
            }
        }
    }



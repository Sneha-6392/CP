package CP.day2;

/* 
Case 1: Student Management System
🔸 Scenario:You are building a Student Management System for a college. The system needs to manage students, their courses, and their performance.🔸 Classes:
    Student (id, name, email)
    Course (courseId, courseName, credits)
    Enrollment (student, course, grade)
🔸 Tasks:Implement encapsulation in all classes (use private variables + getters/setters).
Use composition to relate Student and Course via Enrollment.
Add a method to calculate a student’s GPA.Extend the system to add two types of students: Undergraduate and Postgraduate, each with specific rules (use inheritance).
Use polymorphism to define how GPA is calculated differently for UG and PG students.
*/

import java.util.*;

class Course {
    private String courseId;
    private String courseName;
    private int credits;

    // Course constructor data set and get dono kr raha hai
    public Course(String courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    // agar private data nhi banaya hai toh inn class ka koi use nhi hai
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

}

class Enrollment {
    private Student student;
    private Course course;
    private double grade;

    public Enrollment(Student student, Course course, double grade) {
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;
    }
}

class Student {
    private String studentId;
    private String name;
    private String email;
    private List<Enrollment> enrollments = new ArrayList<>();

    public Student(String studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.enrollments = new ArrayList<>();
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void enroll(Course course, double grade) {
        enrollments.add(new Enrollment(this, course, grade));
    }

    public double calculateGPA() {
        if (enrollments.isEmpty())
            return 0.0;
        double totalPoints = 0;
        double totalCredits = 0;

        for (Enrollment e : enrollments) {
            totalPoints += e.getGrade() * e.getCourse().getCredits();
            totalCredits += e.getCourse().getCredits();
        }

        return totalPoints / totalCredits;
    }

    public void printTranscript() {
        System.out.println("Transcript for " + name + ":");
        for (Enrollment e : enrollments) {
            System.out.println("- " + e.getCourse().getCourseName() + ": " + e.getGrade());
        }
        System.out.printf("GPA: %.2f%n", calculateGPA());

    }
}

class UndergraduateStudent extends Student {
    public UndergraduateStudent(String studentId, String name, String email) {
        super(studentId, name, email);
    }

    public double calculateGPA() {
        double totalPoints = 0;
        double totalCredits = 0;

        for (Enrollment e : getEnrollments()) {
            double grade = Math.min(e.getGrade(), 4.0);
            totalPoints += grade * e.getCourse().getCredits();
            totalCredits += e.getCourse().getCredits();
        }

        return totalCredits == 0 ? 0.0 : totalPoints / totalCredits;
    }
}

class PostgraduateStudent extends Student {
    public PostgraduateStudent(String studentId, String name, String email) {
        super(studentId, name, email);
    }

    public double calculateGPA() {
        double gpa = super.calculateGPA();
        return gpa < 2.5 ? 0.0 : gpa;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {

        Course java = new Course("C101", "Java Programming", 3);
        Course math = new Course("M101", "Mathematics", 4);
        Course db = new Course("D101", "Databases", 2);

        Student s1 = new UndergraduateStudent("UG001", "Alice", "alice@example.com");
        Student s2 = new PostgraduateStudent("PG001", "Bob", "bob@example.com");

        s1.enroll(java, 3.5);
        s1.enroll(math, 3.7);

        s2.enroll(java, 2.2);
        s2.enroll(db, 2.8);

        s1.printTranscript();
        System.out.println("---------------------");
        s2.printTranscript();
    }
}

package CP.day1;
// 1. School and Students with Courses
import java.util.*;
class Course {
    private String name;
    private Set<Student> students = new HashSet<>();
    
    public Course(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void enrollStudent(Student student) {
        students.add(student);
        student.addCourse(this);
    }

    public void showEnrolledStudents() {
        System.out.println("Course: " + name + " enrolled students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

class Student {
    private String name;
    private int rollNumber;
    private Set<Course> courses = new HashSet<>();
    
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() { return name; }
    public int getRollNumber() { return rollNumber; }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void showEnrolledCourses() {
        System.out.println("Student: " + name + " enrolled courses:");
        for (Course c : courses) {
            System.out.println("- " + c.getName());
        }
    }
}

class School {
    private String name;
    private List<Student> students = new ArrayList<>();
    
    public School(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("School: " + name + " students:");
        for (Student s : students) {
            System.out.println("- " + s.getName() + " (Roll no. " + s.getRollNumber() + ")");
        }
    }
}

public class ques1 {
    public static void main(String[] args) {
        School school = new School("Lucknow Public School");
        Student s1 = new Student("Sneha", 62);
        Student s2 = new Student("Vanshika", 70);
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);
        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
        c2.enrollStudent(s1);

        school.showStudents(); 
        s1.showEnrolledCourses();
        c1.showEnrolledStudents(); 
    }
}

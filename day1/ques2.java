package CP.day1;
import java.util.*;
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println("Faculty: " + name);
    }
}
class Department {
    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void showInfo() {
        System.out.println("Department: " + deptName);
    }
}
class University {
    private String universityName;
    private List<Department> departments = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    public University(String universityName) {
        this.universityName = universityName;
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

public void showUniversityDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Departments:");
        for (Department d : departments) {
            d.showInfo();
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.showInfo();
        }
    }

    public void deleteUniversity() {
        System.out.println("Deleting University: " + universityName);
        departments.clear(); 
        faculties.clear();   
    }
}

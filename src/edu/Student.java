package edu;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private HashMap<Course, CourseInfo> coursesThisSemester;
    private ArrayList<Course> pastCourses;

    public Student(String studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.coursesThisSemester = new HashMap<>();
        this.pastCourses = new ArrayList<>();
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

}

package edu;

import java.util.ArrayList;

class CourseInfo{
    private float mark;

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
}

public class Course {
    private String courseName;
    private String semester;
    private Professor professor;
    private ArrayList<String> perCourses;

    public Course(String courseName, String semester, Professor professor, ArrayList<String> perCourses) {
        this.courseName = courseName;
        this.semester = semester;
        this.professor = professor;
        this.perCourses = perCourses;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", semester='" + semester + '\'' +
                ", professor=" + professor +
                ", perCourses=" + perCourses +
                '}';
    }
}

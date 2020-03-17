package edu;

import java.util.ArrayList;

public class Manager {
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;
    private ArrayList<Course> coursesThisSemester;
    private ArrayList<Course> coursesHistory;
    private String currentSemester;

    public Manager(String semester) {
        this.currentSemester = semester;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.coursesThisSemester = new ArrayList<>();
        this.coursesHistory = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public ArrayList<Course> getCoursesThisSemester() {
        return coursesThisSemester;
    }

    public ArrayList<Course> getCoursesHistory() {
        return coursesHistory;
    }

    public String getCurrentSemester() {
        return currentSemester;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setProfessors(ArrayList<Professor> professors) {
        this.professors = professors;
    }

    public void setCoursesThisSemester(ArrayList<Course> coursesThisSemester) {
        this.coursesThisSemester = coursesThisSemester;
    }

    public void setCoursesHistory(ArrayList<Course> coursesHistory) {
        this.coursesHistory = coursesHistory;
    }

    public void setCurrentSemester(String currentSemester) {
        this.currentSemester = currentSemester;
    }

    public void addStudent(String studentId, String firstname, String lastname){
        students.add(new Student(studentId, firstname, lastname));

    }


    public void addProffessor(String firstName, String lastname, String rank){
        professors.add(new Professor(firstName, lastname, rank));
    }

    public void addCourse(String coursName, String professorFirstName, String professorLastName, ArrayList<String> preCourses){
        for (Professor professor : professors) {
            if(professor.getFirstName().equals(professorFirstName) && professor.getLastName().equals(professorLastName)){
                System.out.println("2");
                coursesThisSemester.add(new Course(coursName, currentSemester, professor, preCourses));
            }

        }
    }



}
/*
add student 988 ali alavi
add student 889 ali ahamadi
show students
add professor hamid zarrabi professorii
add professor amin amini hh
show professors


 */
package edu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class CommandProssesor {
    private Manager manager;
    Scanner scanner = new Scanner(System.in);

    public CommandProssesor(Manager manager) {
        this.manager = manager;
    }

    private void prossesAddStudent(String[]  splitsInput){
        manager.addStudent(splitsInput[2], splitsInput[3], splitsInput[4]);
    }

    private void prossesAddProfessor(String[]  splitsInput){
        manager.addProffessor(splitsInput[2], splitsInput[3], splitsInput[4]);
    }

    private void prossesAddCourse(String[] splitInput){
        ArrayList preCourses = new ArrayList<String>();
        if(splitInput.length == 6){
        String[] splitPrecourses =  splitInput[5].split(",");
        Collections.addAll(preCourses, splitPrecourses);
        }
        System.out.println("1");
        manager.addCourse(splitInput[2], splitInput[3], splitInput[4], preCourses);
    }

    private void prossesShowStudents(){
        for (Student student : manager.getStudents()) {
            System.out.println(student.toString());
        }
    }

    private void prossesShowProfessor(){
        for (Professor professor : manager.getProfessors()) {
            System.out.println(professor.toString());
        }
    }
    
    private void prossesShowCoursesThisSemester(){
        for (Course course : manager.getCoursesThisSemester()) {
            System.out.println(course);
        }
    }


    public void run(){
        String input;
        System.out.println("enter your command");
        while(!(input = scanner.nextLine()).equalsIgnoreCase("end")){
            if(input.startsWith("add student")){
                prossesAddStudent(input.split("\\s"));
            }else if(input.startsWith("add professor")){
                prossesAddProfessor(input.split("\\s"));
            }else  if(input.startsWith("add course")){
                prossesAddCourse(input.split("\\s"));
            }else if(input.startsWith("show students")){
                prossesShowStudents();
            }else if(input.startsWith("show courses")){

            }else if(input.startsWith("show professors")){
                prossesShowProfessor();
            }else if(input.startsWith("show courses this semesters")){
                prossesShowCoursesThisSemester();
            }else if(input.startsWith("take course")){
                prossesShowCoursesThisSemester();
            }else if(input.startsWith("show couurses history")){

            }else{
                System.err.println("invalid command");
            }
        }
    }
}

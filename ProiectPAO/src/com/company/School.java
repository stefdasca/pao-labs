package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class School {
    private ArrayList<Teachers> teacher = new ArrayList<>();
    private ArrayList<AuxiliaryEmployees> otheremployees = new ArrayList<>();
    private ArrayList<Students> students = new ArrayList<>();
    private ArrayList<Laboratories> labs = new ArrayList<>();
    private ArrayList<Classrooms> classrooms = new ArrayList<>();
    private Map<Integer, Integer> wages = new HashMap<>();
    private int cnt = 0;

    public Teachers createTeacher(String name, String surname, int age, int salary, String subjecttaught){
        Teachers t = new Teachers(name, surname, age, salary, subjecttaught);
        teacher.add(t);
        cnt++;
        wages.put(cnt, salary);
        return t;
    }

    public AuxiliaryEmployees createWorker(String name, String surname, int age, int salary, String job){
        AuxiliaryEmployees ae = new AuxiliaryEmployees(name, surname, age, salary, job);
        otheremployees.add(ae);
        cnt++;
        wages.put(cnt, salary);
        return ae;
    }

    public Students createStudent(String name, String surname, ArrayList<Double> grades, ArrayList<String> hobbies){
        Students s = new Students(name, surname, grades, hobbies);
        students.add(s);
        return s;
    }

    public Laboratories createLab(int number, int width, int length, String subject){
        Laboratories lb = new Laboratories(number, width, length, subject);
        labs.add(lb);
        return lb;
    }

    public Classrooms createClass(int number, int width, int length, int classnumber, char letter){
        Classrooms cls = new Classrooms(number, width, length, classnumber, letter);
        classrooms.add(cls);
        return cls;
    }

    public int totalWage(){
        int total = 0;
        for(Map.Entry<Integer, Integer> emp : wages.entrySet())
        {
            total = total + emp.getValue();
        }
        return total;
    }
}

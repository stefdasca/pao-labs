package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        School scoala = new School();

        ArrayList<Double> note = null;
        ArrayList<String> hobby = null;

        Students s1 = scoala.createStudent("Georgescu", "Alexandru", note, hobby);
        Students s2 = scoala.createStudent("Popescu", "Maria", note, hobby);
        Students s3 = scoala.createStudent("Coman", "Anca", note, hobby);
        Students s4 = scoala.createStudent("Campeanu", "Radu", note, hobby);
        Students s5 = scoala.createStudent("Blejan", "Bogdan", note, hobby);

        Teachers t1 = scoala.createTeacher("Nistor", "Sergiu", 52, 5000, "Mate");
        Teachers t2 = scoala.createTeacher("Dragan", "Maria", 48, 3800, "Engleza");

    }
}

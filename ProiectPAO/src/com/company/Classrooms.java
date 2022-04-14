package com.company;

public class Classrooms extends Halls{
    private int classnumber;
    private char letter;

    public Classrooms(int number, int width, int length, int classnumber, char letter) {
        super();
    }

    public int getClassnumber() {
        return classnumber;
    }

    public void setClassnumber(int classnumber) {
        this.classnumber = classnumber;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }
}

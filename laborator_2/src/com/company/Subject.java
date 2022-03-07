package com.company;
import com.company.Person;


public class Subject {
    private Room room;
    private int noOfStudents;
    private Person teacher;

    public Subject(Room room, int noOfStudents, Person teacher) {
        this.room = room;
        this.noOfStudents = noOfStudents;
        this.teacher = teacher;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public void printSubject(){
        System.out.println("Class Data: ");
        this.room.printRoom();
        System.out.println("Number of Students: " + this.noOfStudents);
        System.out.println("---------------------------------");
        System.out.println("Teacher Data: ");
        this.teacher.printPerson();
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alexandra", "Baciu", 28, 622032334, "F");
        Person p2 = new Person("Raul", "Galatan", 24, 613057302, "M");
        Room r1 = new Room(113, "Maths", 1);
        Room r2 = new Room(301, "Biology", 3);
        Subject s1 = new Subject(r1, 25, p1);
        Subject s2 = new Subject(r2, 31, p2);
        s1.printSubject();
        s2.printSubject();
    }
}
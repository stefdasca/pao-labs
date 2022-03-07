package com.company;

import java.io.PipedWriter;

public class Person {
    private String name;
    private String surname;
    private int age;
    private long identityNumber;
    private String type;

    public Person(String name, String surname, int age, long identityNumber, String type) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.identityNumber = identityNumber;
        this.type = type;
    }

    // Alt + Insert
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public long getIdentityNumber() {
        return identityNumber;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIdentityNumber(long identityNumber) {
        this.identityNumber = identityNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printPerson() {
        System.out.println("First Name: " + this.name);
        System.out.println("Last Name: " + this.surname);
        System.out.println("Age: " + this.age);
        System.out.println("Identity Number: " + this.identityNumber);
        System.out.println("Type: " + this.type);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Person p1 = new Person("Alexandra", "Baciu", 28, 622032334, "F");
        Person p2 = new Person("Raul", "Galatan", 24, 613057302, "M");
        p1.printPerson();
        p2.printPerson();
    }
}
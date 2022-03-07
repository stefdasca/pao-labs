package com.company;

public class Main {

    public static void main(String[] args) {
        Truth a = Truth.getTruth();
        Truth b = Truth.getTruth();
        System.out.println(a == b);
        a.showTruth();
    }
}
/*Scrieți un program care sa compare doua numere a și b citite de la tastatura si sa afiseze numarul mai mare.*/

package com.company;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a > b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}

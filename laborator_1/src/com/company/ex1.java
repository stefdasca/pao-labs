/*Scrieti un program care sa afișeze toate numerele pare din intervalul [0,n], unde n este un numar citit de la tastatura.*/

package com.company;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for(int i = 0; i <= n; i = i + 2){
            System.out.println(i);
        }
    }
}

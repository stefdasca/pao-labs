/*Fiind dat un numar n, scrieti o metoda care insumeaza toti multiplii de 3 si 5 pana la n (inclusiv).*/
package com.company;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int prod = 1;

        for(int i = 1; i <= n; ++i)
            if(i % 3 == 0 && i % 5 == 0)
                prod = prod * i;

        System.out.println(prod);
    }
}

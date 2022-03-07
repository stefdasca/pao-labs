/* Cititi de la tastatura n note, numere intregi, intr-un vector. Cand cititi valoarea -1 de la tastatura, citirea notelor se opreste si programul afiseaza media acestora. */
package com.company;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int arr[] = new int[n+1];

        int sum = 0;

        for(int i = 1; i <= n; ++i) {
            int numar = scanner.nextInt();
            arr[i] = numar;
            if(numar == -1)
            {
                n = i-1;
                break;
            }
            else {
                sum = sum + numar;
            }
        }

        double avg = 0;

        avg = (0.0 + sum) / (0.0 + n);

        System.out.println(avg);

    }
}

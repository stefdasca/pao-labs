package com.company;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int par[]= new int[n+1];
        int impar[]= new int[n+1];

        int dim_par = 0;
        int dim_impar = 0;

        for(int i = 1; i <= n; ++i) {
            int numar = scanner.nextInt();
            if(numar % 2 == 0)
            {
                ++dim_par;
                par[dim_par] = numar;
            }
            else {
                ++dim_impar;
                impar[dim_impar] = numar;
            }
        }

        for(int i = 1; i <= dim_par; ++i) {
            System.out.print(par[i]);
            System.out.print(" ");
        }

        System.out.println();

        for(int i = 1; i <= dim_impar; ++i) {
            System.out.print(impar[i]);
            System.out.print(" ");
        }

        System.out.println();

    }
}

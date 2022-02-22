package com.company;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int fiba = 1;
        int fibb = 1;

        if(n <= 2)
        {
            System.out.println(1);
        }
        else
        {
            for(int i = 3; i <= n; ++i)
            {
                int nxt_fib = fiba + fibb;
                fiba = fibb;
                fibb = nxt_fib;
            }
            System.out.println(fibb);
        }

    }
}

package com.chandan;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("num");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        if (n != 2) {
            for (int i = 1; i <= n - 2; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(c);
        } else {
            System.out.println(a+b);
        }
    }
}

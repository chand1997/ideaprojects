package com.chandan;

import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        System.out.println("enter num");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("num to find");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int c = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == n) {
                c++;

            }

            num = num / 10;
        }
        System.out.println(c);

    }
}

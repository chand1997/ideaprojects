package com.chandan;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("enter 2 nums");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double ans=0;
        System.out.println("enter operator");
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '%') {
            if (c == '+') {
                ans = a + b;

            }
            if (c == '-') {
                ans = a - b;
            }
            if (c == '/') {
                if(b!=0) {
                    ans = a / b;
                }
                else
                {
                    System.out.println("enter othr b");
                }
            }
            if (c == '*') {
                ans = a * b;

            }
            if (c == '%') {
                ans = a % b;
            }
            System.out.println(ans);
        }

    }

}





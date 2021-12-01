package com.chandan;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("enter range");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("even num");
            for (int i = num1; i <= num2; i += 2) {
                System.out.println(i);
            }
            System.out.println("odd num");
            for (int i = num1 + 1; i <= num2; i += 2) {
                System.out.println(i);
            }
        } else {
            System.out.println("even num");
            for (int i = num1 + 1; i <= num2; i += 2) {
                System.out.println(i);
            }
            {

                System.out.println("odd num");
                for (int i = num1; i <= num2; i += 2) {
                    System.out.println(i);
                }
            }
        }
    }
}






package com.chandan;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        System.out.println("enter which day");
        Scanner in=new Scanner(System.in);
        int num= in.nextInt();
        switch (num) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("enter proper num");

        }
    }
}

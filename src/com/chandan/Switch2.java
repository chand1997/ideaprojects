package com.chandan;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        System.out.println("enter which day");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        switch (num) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
            default -> System.out.println("enter proper num");
        }
    }
}



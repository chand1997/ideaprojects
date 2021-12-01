package com.chandan;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("enter fruit");
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "apple" -> System.out.println("red");
            case "mango" -> System.out.println("king");
            case "orange" -> System.out.println("sweet");
            default -> System.out.println("enter fruit");
        }

        }

    }


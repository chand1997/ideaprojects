package com.chandan;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        System.out.println("enter id and dep");
        Scanner in=new Scanner(System.in);
        int id=in.nextInt();
        String dep= in.next();
        switch (id) {
            case 1 -> {
                System.out.println("shada");
                switch (dep) {
                    case "it" -> System.out.println("it dep");
                }
            }
            case 2 -> {
                System.out.println("dfhdywuy");
                switch (dep) {
                    case "manage" -> System.out.println("manbage dep");
                }
            }
            default -> System.out.println("enter proper details");
        }
    }
}

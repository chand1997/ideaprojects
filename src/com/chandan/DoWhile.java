package com.chandan;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("enter num");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= num);

    }

}

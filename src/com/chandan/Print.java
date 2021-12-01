package com.chandan;

import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        System.out.println("enter statement");
        Scanner in= new Scanner(System.in);
        String statement= in.nextLine();
        System.out.println("enter num");
        Scanner input=new Scanner(System.in);
        int num = input.nextInt();
        for (int i=0 ; i<num ; i++)
        {
            System.out.println(statement);
        }
    }
}

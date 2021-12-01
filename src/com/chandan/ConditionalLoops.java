package com.chandan;

import java.util.Scanner;

public class ConditionalLoops {
    public static void main(String[] args) {
        System.out.println("enter salary");
        Scanner input= new Scanner(System.in);
        int salary= input.nextInt();

        if( salary>10000)
        {
            System.out.println(salary+2000);
        }
        else {
            System.out.println(salary + 3000);
        }


    }

}

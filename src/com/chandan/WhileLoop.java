package com.chandan;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("enter  num" );
        Scanner in= new Scanner(System.in);
        int num= in.nextInt();
        int i=1;
        while(i<=num){
            System.out.println(i);
            i++;
        }
    }
}

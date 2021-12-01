package com.chandan;


import java.util.Scanner;

public class Aff {
    public static void main(String[] args) {
        System.out.println("enter num");
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int a=0;
        int b=1;
        int i= 2;
        while(i<=n){
            int c=b;
            b=b+a;
            a=c;
            i++;
        }
        System.out.println(b);

    }


}

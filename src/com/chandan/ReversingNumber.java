package com.chandan;

import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[] args) {
        System.out.println("enter num");
        Scanner in=new Scanner(System.in);
        int num= in.nextInt();
        int s=0;
        while(num>0)
        {
            int rem=num%10;
              s =s*10+rem;
            num=num/10;

        }
        System.out.println(s);
    }
}

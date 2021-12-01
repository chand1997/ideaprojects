package com.chandan;

import java.util.Scanner;

public class GreatNum {
    public static void main(String[] args) {
        System.out.println("enter 3 nums");
        Scanner in= new Scanner(System.in);
        int a = in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        if(a>b){
            if(a>c) {
                System.out.println("a is largest");
            }
                else
                {
                    System.out.println("c is greatest");
            }
        }
            else{
                if(b>c) {
                    System.out.println("b is greatest");
                }
                else {
                    System.out.println("c is greatest");
                }
                }
            }
    }


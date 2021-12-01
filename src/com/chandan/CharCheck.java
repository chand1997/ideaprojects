package com.chandan;

import java.util.Scanner;

public class CharCheck {
    public static void main(String[] args) {
        System.out.println("enter char");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);


        
//   trim here is used to remove if any spaces are given at begining and charAt is used to check which letter of word
         if (ch >= 'a' && ch <= 'z') {
            System.out.println("lower case");
        } else {
            System.out.println("upper case");
        }
    }
}




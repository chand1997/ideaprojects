package com.chandan;

import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a = 727;
        char b = 's';
        float c= 88.6366f;
        double d= 992929298337.999;
        long e= 828288822288888L;
        int result=(int) ((a*e)/((b*d)/c));
        System.out.println(result);
    }
}

package com.rec.main;

import java.util.Scanner;

public class EuclidesAlgorithm {
    public static void main(String[] args) {
        System.out.println("Enter first number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        int large = (a > b)? a: b;
        int small = a+b-large;
        System.out.println("GCD of " + a + " and " + b + " is " + gcd(large,small));
    }

    private static int gcd(int large, int small) {
        if(large%small==0){
            return small;
        }
        return gcd(small, large%small);
    }
}

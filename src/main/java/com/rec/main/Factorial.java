package com.rec.main;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of "+ n + " is " + factorial(n));
    }

    private static int factorial(int n) {
        if(n < 2) {
            System.out.println(n);
            return 1;
        }
        System.out.print(n +" x ");
        return n * factorial(n-1);
    }
}

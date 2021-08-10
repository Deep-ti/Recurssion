package com.rec.main;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of all digits = " + sum(n));
    }

    private static int sum(int n) {
        if(n/10 == 0){
            return n;
        }
        return (n%10)+sum(n/10);
    }
}

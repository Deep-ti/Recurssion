package com.rec.main;

import java.util.Scanner;

public class PowerOf {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter power : ");
        int p = sc.nextInt();
        System.out.println(p + "th power of " + n + " is " + powerOf(n, p));
    }

    private static int powerOf(int n, int p) {
        if(p == 1){
            return n;
        }
        return n * powerOf(n, p-1);
    }
}

package com.rec.main;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n+" in binary is "+binary(n));
    }

    private static String binary(int n) {
        System.out.println("2 " + n + " " + (n % 2));
        if (n / 2 == 1) {
            return (n / 2) + "" + (n % 2);
        }
        return binary(n / 2) + (n % 2);
    }
}

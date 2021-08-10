package com.rec.main;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + "th fibonacci number is " + fibonacci(n));
    }

    private static int fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int fibo = fibonacci(n-1)+fibonacci(n-2);
        return fibo;
    }
}

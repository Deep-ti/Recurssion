package com.rec.main;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Countdown begins " );
        countdown(n);
    }

    private static int countdown(int n) {
        System.out.print(n + " ");
        if(n ==0){
            return n;
        }
        return countdown(n-1);
    }
}

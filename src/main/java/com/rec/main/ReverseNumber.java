package com.rec.main;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Reverse of "+n+" is ");
        reverse(n);
    }

    private static void reverse(int n) {
        System.out.print(n%10);
        if(n/10 == 0){
            System.out.println();
            return;
        }
        reverse(n/10);
    }
}

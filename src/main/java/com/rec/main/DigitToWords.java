package com.rec.main;

import java.util.Scanner;

public class DigitToWords {
    static String[] wordFor = {"Zero", "One" , "Two", " Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Digits in " + n + " are " + digitToWords(n));
    }

    private static String digitToWords(int n) {
        if(n/10 == 0){
            return wordFor[n];
        }
        return digitToWords(n/10)+ " " +wordFor[n%10];
    }
}

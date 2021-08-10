package com.rec.main;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s + " reversed is " + reverse(s));
    }

    private static String reverse(String s) {
        int n = s.length();
        if(n == 0){
            return "";
        }
        return s.charAt(n-1)+reverse(s.substring(0,n-1));
    }
}

package com.rec.main;

import java.util.Scanner;

public class ArithmeticSeries {
    public static void main(String[] args) {
        System.out.println("Enter start number : ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println("Enter end number : ");
        int e = sc.nextInt();
        System.out.println("Arithmetic sum from " + s + " to " + e + " is " + sumRecurse(s,e));
        System.out.println("By Formula " + sumFormula(s, e));
    }

    private static int sumFormula(int s, int e) {
        int n = e-s+1;
        return (n/2)*(s+e);
    }

    private static int sumRecurse(int s, int e) {
        if(s==e){
            return e;
        }
        System.out.println(s);
        return s + sumRecurse(s+1, e);
    }
}

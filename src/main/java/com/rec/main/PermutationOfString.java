package com.rec.main;

import java.util.Scanner;

public class PermutationOfString {
    public static void main(String[] args) {
        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println("All Permutations Of String "+s+ " is ");
        permutation(s,"");
    }

    private static void permutation(String s, String perm) {
        if(s.length() == 0){
            System.out.print(perm + " ");
            return;
        }
        for(int i = 0; i < s.length(); i++){
            permutation(s.substring(0,i)+s.substring(i+1), perm+s.charAt(i));
        }
    }
}

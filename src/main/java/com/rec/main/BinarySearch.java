package com.rec.main;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("Enter array size ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter array element");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter element to find");
        int x = scanner.nextInt();
        System.out.println("Is "+x+" present at index " + binary(arr,0, arr.length-1, x));
    }

    private static int binary(int[] arr, int start, int end, int x) {
        if(start < end){
            int n = (start+(end-start))/2;
            if(arr[n]==x)
                return n;

            if(arr[n]>n){
                return binary(arr, start, n-1, x);
            }

            return binary(arr, n+1, end, x);
        }
        return -1;
    }
}

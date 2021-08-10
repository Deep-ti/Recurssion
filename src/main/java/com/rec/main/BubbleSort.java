package com.rec.main;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Enter array size ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter "+(i+1)+" element");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Given array " + Arrays.toString(arr));
        System.out.println("Sorted array " + Arrays.toString(bubbleSort(arr, arr.length)));
    }

    private static int[] bubbleSort(int[] arr, int n) {
        if (n == 1) {
            return arr;
        }

        for(int i = 0; i < n-1; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        return bubbleSort(arr, n-1);
    }
}

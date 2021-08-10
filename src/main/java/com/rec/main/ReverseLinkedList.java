package com.rec.main;

import com.rec.datastructures.LinkedList;

import java.util.Scanner;

public class ReverseLinkedList {
    public static void main(String[] args) {
        System.out.println("Enter size of linked list : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l = new LinkedList();
        for(int i = 1; i <= n; i++){
            System.out.println("Enter "+ i + " element : ");
            l.add(sc.nextInt());
        }
        System.out.print("Reverse of ");
        l.displays();
        System.out.print(" is ");
        l.head = reverse(l.head);
        l.displays();
    }

    private static LinkedList.Node reverse(LinkedList.Node n) {
        if(n == null || n.next==null){
            return n;
        }
        LinkedList.Node newNode = reverse(n.next);
        n.next.next = n;
        n.next = null;
        return newNode;
    }
}

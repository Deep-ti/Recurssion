package com.rec.datastructures;

public class LinkedList {

    public static class Node {
        int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void displays(){
        Node current = head;
        while(current.next != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print(current.data);
        System.out.println();
    }
}
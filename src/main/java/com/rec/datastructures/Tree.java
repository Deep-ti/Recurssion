package com.rec.datastructures;

public class Tree {
    public static class Node{
        int data;
        public Node left;
        public Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public int getData(){
            return this.data;
        }
    }

    public Node root = null;

    public void add(int data){
        root = addNode(root, data);
    }
    public Node addNode(Node current, int data){
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addNode(current.left, data);
        } else if (data > current.data) {
            current.right = addNode(current.right, data);
        } else {
            // data already exists
            return current;
        }

        return current;
    }
}

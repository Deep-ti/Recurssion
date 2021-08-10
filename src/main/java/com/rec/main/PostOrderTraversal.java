package com.rec.main;

import com.rec.datastructures.Tree;

import java.util.Scanner;

public class PostOrderTraversal {
    public static void main(String[] args) {
        System.out.println("Enter number of tree nodes : ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Tree tree = new Tree();
        for(int i = 0; i < size; i++){
            System.out.println("Enter node : ");
            tree.add(scanner.nextInt());
        }
        System.out.println("Traversing the tree in post order");
        postOrder(tree.root);
    }

    private static void postOrder(Tree.Node node) {
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.getData());
        }
    }
}

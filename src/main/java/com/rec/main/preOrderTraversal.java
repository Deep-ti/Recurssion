package com.rec.main;

import com.rec.datastructures.Tree;

import java.util.Scanner;

public class preOrderTraversal {
    public static void main(String[] args) {
        System.out.println("Enter number of tree nodes : ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Tree tree = new Tree();
        for(int i = 0; i < size; i++){
            System.out.println("Enter node : ");
            tree.add(scanner.nextInt());
        }
        System.out.println("Traversing the tree in pre order");
        preOrder(tree.root);
    }

    private static void preOrder(Tree.Node node) {
        if (node != null) {
            System.out.print(" " + node.getData());
            preOrder(node.left);
            preOrder(node.right);
        }
    }


}

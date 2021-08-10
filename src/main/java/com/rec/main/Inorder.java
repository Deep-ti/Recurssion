package com.rec.main;

import com.rec.datastructures.Tree;

import java.util.Scanner;

public class Inorder {
    public static void main(String[] args) {
        {
            System.out.println("Enter number of tree nodes : ");
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            Tree tree = new Tree();
            for(int i = 0; i < size; i++){
                System.out.println("Enter node : ");
                tree.add(scanner.nextInt());
            }
            System.out.println("Traversing the tree in inorder");
            inOrder(tree.root);
        }
    }

    private static void inOrder(Tree.Node node) {
        if(node != null){
            inOrder(node.left);
            System.out.println(node.getData());
            inOrder(node.right);
        }
    }
}

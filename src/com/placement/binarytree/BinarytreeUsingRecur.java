package com.placement.binarytree;

import java.util.Scanner;

public class BinarytreeUsingRecur {
    Node root;
    Scanner scanner=new Scanner(System.in);
    static class Node {
         Node right;
         Node left;
         int value;
           Node(int value){
               this.value=value;
           }
    }
    void insert(int value){
        root=insertRec(root,value);
    }
    Node insertRec(Node node,int value){
        if(node==null){
            return new Node(value);
        }
        System.out.println("Insert "+value+"to left of"+node.value+"?(true/false):");
        boolean left=scanner.nextBoolean();
        if(left){
            node.left=insertRec(node.left,value);

        }else{
            node.right=insertRec(node.right, value);
        }
        return node;
    }

     void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value+" ");
        preOrder(node.left);
        preOrder(node.right);
     }
}

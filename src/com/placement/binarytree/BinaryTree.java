package com.placement.binarytree;

import java.util.Scanner;

public class BinaryTree {

   private Tree root;
    static class Tree{
         int value;
         Tree right;
         Tree left;
         Tree(int value){
             this.value=value;
         }
     }

    public Tree getRoot() {
        return root;
    }

    Scanner scanner=new Scanner(System.in);
     public void insert(){
         System.out.print("Enter the root node:");
         int value=scanner.nextInt();
         root=new Tree(value);
     }
      public void display(Tree node){
         if(node==null){
             return;
         }
         System.out.println(node.value);
         display(node.left);
         display(node.right);
      }
      public void preOrder(Tree node){
         if(node==null){
             return;
         }
         System.out.println(node.value);
         preOrder(node.left);
         preOrder(node.right);
      }
    public void inOrder(Tree node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }
    public void postOrder(Tree node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        inOrder(node.right);
        System.out.print(node.value);
    }
}

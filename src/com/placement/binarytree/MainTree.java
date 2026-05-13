package com.placement.binarytree;


public class MainTree {
    public static void main(String[] args) {
        BinaryTree ob = new BinaryTree();
        ob.insert();
        ob.getRoot().left = new BinaryTree.Tree(14);
        ob.getRoot().right = new BinaryTree.Tree(15);

        ob.getRoot().left.left = new BinaryTree.Tree(16);
        ob.getRoot().left.right = new BinaryTree.Tree(17);

        System.out.println("Pre order traversal:");
        ob.preOrder(ob.getRoot());

        System.out.println("In order traversal:");
        ob.inOrder(ob.getRoot());

        System.out.println("Post Order traversal:");
        ob.postOrder(ob.getRoot());

        BinarytreeUsingRecur tree = new BinarytreeUsingRecur();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);

        System.out.println("Preorder Traversal:");

        tree.preOrder(tree.root);
    }
}

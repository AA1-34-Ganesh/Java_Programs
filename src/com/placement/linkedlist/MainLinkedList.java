package com.placement.linkedlist;

import java.util.Scanner;

public class MainLinkedList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        CustomLinkedList list = new CustomLinkedList();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertLast(60);
        System.out.println("Linked list:");
        list.display();
        System.out.println("Size of linked list:"+list.size);
        System.out.print("Enter index number (0-size):");
        int index=scanner.nextInt();
        System.out.print("Enter the value to insert:");
        int value=scanner.nextInt();
        list.insert(value,index);
        System.out.println("After inserted at specific index is:");
        list.display();
        System.out.println("Size of linked list:"+list.size);
        System.out.print("Enter the index number (0-size) to delete:");
        int deleteIndex=scanner.nextInt();
        System.out.println("Deleted element at specific index is:" + list.delete(deleteIndex));
        list.display();
        System.out.println("Head of linked list:"+ list.head.value);
        System.out.println("Remove element from start :"+list.deleteFirst());
        System.out.println("Head of linked list:"+ list.head.value);
        System.out.println("Remove element from end:"+list.deleteLast());
        list.display();
        System.out.println("Size of linked list:"+list.size);
    }
}

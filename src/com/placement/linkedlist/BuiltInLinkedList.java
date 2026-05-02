package com.placement.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class BuiltInLinkedList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        List<Integer> list2=new LinkedList<>();
        list.addFirst(23);
        list.addFirst(32);
        list.addFirst(25);
        list.addFirst(37);
        list.addFirst(43);
        System.out.println("------Linked List built in operations------");
        System.out.println("Adding element at front side of linked list :"+list);
        list2.addLast(10);
        list2.addLast(20);
        list2.addLast(30);
        list2.addLast(40);
        list2.addLast(60);
        System.out.println("Adding element at the end  of linked list2 :"+list2);
        System.out.println("Removed element:"+list.remove(2));
        System.out.println("After removing the element from list:"+list);
        System.out.println("Removing first element:"+list.removeFirst());
        System.out.println("After removing the element from list:"+list);
        System.out.println("Removing last element:"+list.removeLast());
        System.out.println("After removing the element from list:"+list);
    }
}

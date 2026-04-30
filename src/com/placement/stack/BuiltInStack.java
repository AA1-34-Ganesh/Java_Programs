package com.placement.stack;

import java.util.Stack;

public class BuiltInStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        System.out.println("Stack Elements:");
        for (int i=stack.size()-1;i>=0;i--) {
            System.out.println(stack.get(i));
        }
        System.out.println("Top element in stack is:"+stack.peek());
        System.out.println("Removed element:"+stack.pop());
        System.out.println("After deleted elements present in stack is:");
        System.out.println("Top element in stack is:"+stack.peek());
        for (int i=stack.size()-1;i>=0;i--) {
            System.out.println(stack.get(i));
        }
    }
}

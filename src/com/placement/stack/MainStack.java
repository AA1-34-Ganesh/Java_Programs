package com.placement.stack;

public class MainStack {
    public static void main(String[] args) throws StackException {
        CustomStack customStack = new CustomStack(5);
        customStack.push(34);
        customStack.push(25);
        customStack.push(16);
        customStack.push(485);
        customStack.push(349);

        System.out.println("Top element in stack:"+customStack.peek());
        System.out.println("Deleted element:"+customStack.pop());
        System.out.println("After deleted, now top of stack is:"+customStack.peek());


        System.out.println("Top element in stack:"+customStack.peek());
        System.out.println("Deleted element:"+customStack.pop());
        System.out.println("After deleted, now top of stack is:"+customStack.peek());

    }
}

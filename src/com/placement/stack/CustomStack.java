package com.placement.stack;

import java.util.EmptyStackException;
import java.util.Scanner;

public class CustomStack {
        private int top=-1;
         int[] stack;

         CustomStack(int size){
             stack=new int[size];
         }
         boolean isFull(){
             return top== stack.length-1;
         }
         boolean isEmpty(){
             return top==-1;
         }
         int peek() throws StackException{
             if(isEmpty()){
                 throw new StackException("Cannot remove from an empty stack.");
             }
             return stack[top];
         }
       public boolean push(int value){
             if(isFull()){
                 System.out.println("Stack is full");
                 return false;
             }
             top++;
             stack[top]=value;
             return true;
       }
       public int pop() throws StackException{
             if(isEmpty()){
                 throw new StackException("Cannot remove from an empty stack.");
             }
             return stack[top--];
       }
}

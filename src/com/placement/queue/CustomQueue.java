package com.placement.queue;

public class CustomQueue {
    int front=0;
    int rear=-1;
    int capacity;
      int[] queue;
         CustomQueue(int size){
             this.queue=new int[size];
             this.capacity=size;
         }
         boolean isEmpty(){
             return front>rear;
         }
         boolean isFull(){
             return rear==capacity-1;
         }
       void add(int val){
             if(isFull()){
                 System.out.println("Queue is full");
                 return;
             }
             queue[++rear]=val;

       }
       int remove(){
             if(isEmpty()){
                 System.out.println("Queue is empty.");
                 return -1;
             }
             return queue[front++];
       }
       int topElement(){
             if(isEmpty()){
                 System.out.println("Queue is empty");
                 return -1;
             }
             return queue[front];
       }
       void display(){
           if(isEmpty()){
               System.out.println("Queue is empty.");
               return;
           }
             for(int i=front;i<=rear;i++){
                 System.out.print(queue[i]+"->");
             }
             System.out.println();
       }
}

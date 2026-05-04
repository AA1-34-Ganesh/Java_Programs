package com.placement.queue;

public class MainQueue {
    public static void main(String[] args) {
        CustomQueue q1=new CustomQueue(10);
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        q1.add(60);
        q1.add(70);
        q1.add(80);
        System.out.print("Queue elements:");
        q1.display();
        System.out.println("Removed element:"+q1.remove());
        System.out.println("Queue top of element:"+q1.topElement());
         q1.display();
         System.out.println("Queue top of element:"+q1.topElement());
    }
}

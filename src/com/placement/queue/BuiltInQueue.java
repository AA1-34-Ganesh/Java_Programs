package com.placement.queue;

import java.util.LinkedList;
import java.util.Queue;

public class BuiltInQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(60);
        queue.offer(50);
        System.out.println("Peek Element:"+queue.peek());
        System.out.println(queue);
        System.out.println("Removes element from front side:"+queue.poll());
        System.out.println("Check queue is empty or not:"+queue.isEmpty());
        System.out.println(queue);
    }
}

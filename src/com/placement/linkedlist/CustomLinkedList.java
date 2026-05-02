package com.placement.linkedlist;

public class CustomLinkedList {
    Node head;
    Node tail;
    int size;
    class Node {
        int value;
        Node next;
         Node(int value){
             this.value=value;
         }
        Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    void insertFirst(int value){

        Node node=new Node(value );
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    void insertLast(int value){
        if(tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
       size++;
    }
    void insert(int val,int index){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("Invalid index number.");
        }
        if(index==0){
           insertFirst(val);
           return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node  temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    public int deleteFirst(){
        if(head==null){
            throw new RuntimeException("List is empty");
        }
        int dletedElement=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return dletedElement;
    }
    int deleteLast(){
        if(size<=1){
           return deleteFirst();
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        int val=temp.next.value;
        temp.next=null;
        tail=temp;
        size--;
        return val;
    }
    int delete(int index){
        if(index<0 || index>size){
            throw new IndexOutOfBoundsException("Invalid index number.");
        }
        if(index==0){
          return deleteFirst();
        }
        if(index==size-1){
           return deleteLast();
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        int deletedNum=temp.next.value;
        temp.next=temp.next.next;
        size--;
        return deletedNum;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
}

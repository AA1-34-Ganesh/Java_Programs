package com.placement.dsapatterns;
import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapImplementation {

 static class HashMap<K,V> {
     class Node {
         K key;
         V value;

         Node(K key, V value) {
             this.key = key;
             this.value = value;
         }
     }

     int n;
     int N;
     LinkedList<Node> buckets[];

     @SuppressWarnings("unchecked")
     public  HashMap() {
         this.N = 5;
         this.buckets = new LinkedList[this.N];
         for (int i = 0; i < this.N; i++) {
             this.buckets[i] = new LinkedList<>();
         }
     }

      int hashFunction(K key) {

         int hashValue=key.hashCode();
         return Math.abs(hashValue) % N;
     }
     int searchInLl(K key,int bucketIndex){
         LinkedList<Node> ll=buckets[bucketIndex];
         for(int i=0;i<ll.size();i++){
             if(ll.get(i).key==key){
                 return i;
             }
         }
         return -1;
     }

     void putInHashMap(K key,V value){
          int bucketIndex=hashFunction(key);
          int linkedIndex=searchInLl(key, bucketIndex);

          if(linkedIndex==-1){
              buckets[bucketIndex].add(new Node(key,value));
              n++;
          }else{
              Node node=buckets[bucketIndex].get(linkedIndex);
              node.value=value;
          }

          double lambda=(double)n/N;

//          if(lambda>3){
//              rehash();
//          }
     }
     boolean containsKey(K key){
         int bucketIndex=hashFunction(key);
         int linkedlistIndex=searchInLl(key,bucketIndex);

         if(linkedlistIndex==-1){
             return false;
         }

         return true;
     }

     V get(K key){
         int bucketIndex=hashFunction(key);
         int linkedIndex=searchInLl(key,bucketIndex);

         if(linkedIndex==-1){
             return null;
         }

         Node node=buckets[bucketIndex].get(linkedIndex);
         return node.value;
     }

     V remove(K key){
         int bucketIndex=hashFunction(key);
         int linkedList=searchInLl(key,bucketIndex);

         if(linkedList==-1){
             return null;
         }
         Node node=buckets[bucketIndex].remove(linkedList);
         n--;
         return node.value;
     }

     ArrayList<K> keySet(){

         ArrayList<K> keys=new ArrayList<>();
         for(int i=0;i<buckets.length;i++){
             LinkedList<Node> linkedList = buckets[i];

             for(int j=0;j<linkedList.size();j++){
                 Node node=linkedList.get(j);
                 keys.add(node.key);
             }
         }
         return keys;
     }
 }


    public static void main(String[] args) {
       HashMap<String,Integer> map = new HashMap<>();
       map.putInHashMap("Name", 0);
       map.putInHashMap("Ganesh",1049);
       map.putInHashMap("Gowtham", 1048);
       map.putInHashMap("Vishnu",1039);
       map.putInHashMap("Akarsh", 1047);

       ArrayList<String> keys=map.keySet();

       for(int i=0;i<keys.size();i++){
           System.out.println(keys.get(i)+"="+map.get(keys.get(i)));
       }
       map.remove("Gowtham");
       System.out.println(map.get("Gowtham"));
    }
}

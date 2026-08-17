package com.placement.dsapatterns;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,String> hashMapExam=new HashMap<>();

        hashMapExam.put("Name", "Course");
        hashMapExam.put("Ganesh","CSE-DS(AI)");
        hashMapExam.put("Vishnu", "CSE");
        hashMapExam.put("Chandra", "PUC");
        hashMapExam.put("Charan", "Degree");
        hashMapExam.put("Gowtham","Diploma");

        System.out.println(hashMapExam);
   if(hashMapExam.containsKey("Charan")){
       System.out.println("Yes it contains.");
   }
   hashMapExam.remove("Vishnu");
        System.out.println(hashMapExam.get("Ganesh"));
        System.out.println(hashMapExam.get("Gowtham"));
        System.out.println(hashMapExam);

        System.out.println(hashMapExam.keySet());
        System.out.println(hashMapExam.values());

        for(Map.Entry<String,String> p:hashMapExam.entrySet()){
               System.out.println(p.getKey()+"-"+p.getValue());
        }

        Set<String> keys=hashMapExam.keySet();
        System.out.println("Second Method to iterate the element;");
        for(String key:keys){
            System.out.println(key+"-"+hashMapExam.get(key));
        }
    }
}

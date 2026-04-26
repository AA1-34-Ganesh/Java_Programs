package com.placement.training;

public class StudentDetails1 {
     String name;
     long regNo;
     String section;
      String department;

      StudentDetails1(String name,long regNo, String section, String department){
          this.name=name;
          this.regNo=regNo;
          this.section=section;
          this.department=department;
      }
      void ShowDetails(){
          System.out.println("!=======Student Details=====!");
          System.out.println("Name: "+name);
          System.out.println("Register No:"+regNo);
          System.out.println("Department:"+department);
      }
}

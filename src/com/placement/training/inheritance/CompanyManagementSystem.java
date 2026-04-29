package com.placement.training.inheritance;
//In a Company Management System, create a class Employee with a static variable
//companyName. Show how all objects share this value and update it using a static method.
public class CompanyManagementSystem {
    static String companyName="IBM";
    String empName;
    int empId;
    String empRole;

     CompanyManagementSystem(String empName,int empId,String empRole){
         this.empName=empName;
         this.empId=empId;
         this.empRole=empRole;
     }
    void showEmpDetails(){
        System.out.println("Employee Name:"+empName);
        System.out.println("Employee Id:"+empId);
        System.out.println("Employee Role:"+empRole);
    }
}

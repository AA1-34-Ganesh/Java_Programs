package com.placement.training.inheritance;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Company Name:"+CompanyManagementSystem.companyName);
        CompanyManagementSystem emp=new CompanyManagementSystem("Rahul",1234,"Full Stack Developer");
        emp.showEmpDetails();
        System.out.println("-------------------------------");
        CompanyManagementSystem emp1=new CompanyManagementSystem("Ganesh",7823,"Web Developer");
        emp1.showEmpDetails();
    }
}

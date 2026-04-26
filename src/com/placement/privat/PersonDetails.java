package com.placement.privat;

public class PersonDetails extends AadharDetails{
    String name;
    protected long mobileNumber;
    String address;
      PersonDetails(long aadhar,String name,long mobileNumber,String address){
          super(aadhar);
          this.name=name;
          this.mobileNumber=mobileNumber;
          this.address=address;
      }
      void display(){
          System.out.println("Name: "+name);
          System.out.println("Mobile Number: "+mobileNumber);
          System.out.println("Address: "+address);
      }
}

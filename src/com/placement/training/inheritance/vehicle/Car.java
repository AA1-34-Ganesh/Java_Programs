package com.placement.training.inheritance.vehicle;

public class Car extends Vehicle{
      Car(String typeOfVehicle,String fuelType,int model){
          super(typeOfVehicle,fuelType,model);
           this.typeOfVehicle=typeOfVehicle;
           this.fuelType=fuelType;
           this.model=model;
      }
      void start(){
          System.out.println("Car engine is  started.");
      }
      void stop(){
          System.out.println("Car is stopped.");
      }
}

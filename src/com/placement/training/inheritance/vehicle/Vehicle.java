package com.placement.training.inheritance.vehicle;
//3 3. Design a Vehicle System where Vehicle is a parent class and Car is a child class. Use super
//keyword to call the parent class constructor and display vehicle type.
public class Vehicle {
    String typeOfVehicle;
    String fuelType;
    int model;
    Vehicle(String typeOfVehicle,String fuelType,int model){
        this.typeOfVehicle=typeOfVehicle;
        this.fuelType=fuelType;
        this.model=model;
    }
    void vehicleDetails(){
        System.out.println("Vehicle Type:"+typeOfVehicle);
        System.out.println("Fuel Type:"+fuelType);
        System.out.println("Model:"+model);
    }
}

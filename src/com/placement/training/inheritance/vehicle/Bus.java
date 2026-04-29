package com.placement.training.inheritance.vehicle;

public class Bus extends Vehicle{
    String typeofBus;
    int fuelCapacity;
    Bus(String typeOfVehicle,String fuelType,int model,String typeofBus,int fuelCapacity){
        super(typeOfVehicle,fuelType,model);
        this.typeOfVehicle=typeOfVehicle;
        this.fuelType=fuelType;
        this.model=model;
        this.typeofBus=typeofBus;
        this.fuelCapacity=fuelCapacity;
    }
    void busDetails(){
        System.out.println("Bus type:"+typeofBus);
        System.out.println("Fuel tank capacity(in litres):"+fuelCapacity);
    }
    void start(){
        System.out.println("Bus engine is started.");
    }
    void stop(){
        System.out.println("Bus engine is stopped.");
    }
}

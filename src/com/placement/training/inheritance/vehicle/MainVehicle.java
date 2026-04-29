package com.placement.training.inheritance.vehicle;

public class MainVehicle {
    public static void main(String[] args) {
        Car car1 = new Car("Four wheeler", "petrol", 2020);
        car1.vehicleDetails();
        car1.start();

        Bus bus=new Bus("Six wheeler","Desiel",2025,"Government Bus", 40);
        bus.vehicleDetails();
        bus.busDetails();
        bus.start();
    }
}

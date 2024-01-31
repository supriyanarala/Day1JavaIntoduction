package com.ex1_Inheritance;

public class Main {
    public  static void main(String args[]){
        Vehicle vehicle = new Vehicle("Tesla ","Gen 3");
        vehicle.displayInfo();

        Car car = new Car("Toyoto","camry", 4);
        car.startEngine();
        car.displayInfo();
    }
}

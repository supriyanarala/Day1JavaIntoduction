package com.ex1_Inheritance;

//Exercise 1: Inheritance
//Create a class Vehicle with properties like make, model, and a method displayInfo() to print out the details of the vehicle.
// Then, create a subclass Car that inherits from Vehicle and adds a property like numDoors and a method startEngine() to simulate starting the car.
public class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void displayInfo (){
            System.out.println(make + "make");
            System.out.println(model + "model");
    }
}
class Car extends Vehicle{

    private int numDoors;
    public Car(String make, String model) {
        super(make, model);
    }
    public Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }
    public void startEngine(){
        System.out.println("I'm in StartEngine");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(numDoors+": Num of Doors");
    }
}


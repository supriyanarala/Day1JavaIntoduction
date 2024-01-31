package com.ex2_polymorphism;

public class Main {

    /*Exercise 2: Polymorphism
    Define an interface Shape with a method calculateArea(). Implement this interface in classes like Circle, Rectangle, and Triangle.
     Each class should have the necessary properties (radius, length, width, base, height) and implement the calculateArea() method to compute the area of the respective shape.*/

    public static void main(String[] args){

        Circle circle = new Circle(2);
        circle.calculateArea();
        Rectangle rect = new Rectangle(2,2,2);
        rect.calculateArea();
        Square sq = new Square(2);
        sq.calculateArea();
        Triangle tri = new Triangle(2,2);
        tri.calculateArea();
    }
}

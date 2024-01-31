package com.ex2_polymorphism;

public class Circle implements IShape{

    public int radius;
    public double area;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = 2.17 * radius* radius;
        System.out.println("The area of circle is : "+area);
    }
}

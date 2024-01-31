package com.ex2_polymorphism;

public class Triangle implements IShape {
    public int base,height;
    public double area;

    public Triangle( int base, int height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public void calculateArea() {
        area = 0.5 * base* height;
        System.out.println("The area of triangle is : "+area);
    }
}
package com.ex2_polymorphism;

public class Rectangle implements IShape {
    public double area ;
    public int length,width, height;
     public Rectangle(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        area = length*height*width;
        System.out.println("The area of rectangle is : "+area);
    }
}

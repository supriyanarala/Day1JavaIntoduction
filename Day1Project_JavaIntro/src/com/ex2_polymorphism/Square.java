package com.ex2_polymorphism;

public class Square implements IShape {
    public int side;
    public double area;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        area = side * side;
        System.out.println("The area of square is : "+area);
    }
}

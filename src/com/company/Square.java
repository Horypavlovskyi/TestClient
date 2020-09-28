package com.company;

public class Square extends Shape{
    private double side;

    @Override
    public double area() {
        return Math.pow(side, 2);
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }
}

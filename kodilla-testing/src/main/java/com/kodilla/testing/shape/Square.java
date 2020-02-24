package com.kodilla.testing.shape;

public class Square implements Shape {
    String name = "square";
    double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return side * side;
    }
}

package com.kodilla.testing.shape;

public class Circle implements Shape {
    String name = "circle";
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.PI * radius * radius;
    }
}

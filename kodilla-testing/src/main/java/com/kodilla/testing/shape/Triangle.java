package com.kodilla.testing.shape;

public class Triangle implements Shape {
    String name = "triangle";
    double height;
    double basis;

    public Triangle(double height, double basis) {
        this.height = height;
        this.basis = basis;
    }

    public double getHeight() {
        return height;
    }

    public double getBasis() {
        return basis;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return (height * basis) / 2;
    }
}

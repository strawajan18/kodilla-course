package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> theList = new ArrayList<Shape>();


    public void addFigure(Shape shape) {
        theList.add(shape);

    }

    public void removeFigure(Shape shape) {
        theList.remove(shape);
    }

    public Shape getFigure(int n) {
        return theList.get(n);
    }

}


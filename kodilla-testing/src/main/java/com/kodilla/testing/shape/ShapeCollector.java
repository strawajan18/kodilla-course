package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

        ArrayList<Shape> theList = new ArrayList<Shape>();
        private Object Circle;

        public void addFigure(Shape shape) {
        Circle circle = new Circle(3);
        theList.add((Shape) Circle);
        }

        public void removeFigure(Shape shape) {
        Circle circle = new Circle(3);
        theList.remove((Shape) Circle);
        }

        public void getFigure(int n) {
        n = 0;
        theList.get(n);
        }
}


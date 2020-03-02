package com.kodilla.testing.shape;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.management.DescriptorKey;

public class ShapeCollectorTestSuite {
    Circle circle = new Circle(6);

    @Before
    public void before() {
        System.out.println("Starting test");
    }

    @After
    public void after() {
        System.out.println("No error found");
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(circle);
        double field = circle.getField();
        //Then
        Assert.assertEquals(shapeCollector.theList.size(), 1);
        Assert.assertEquals(shapeCollector.getFigure(0).getField(),field,0);

    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.removeFigure(circle);
        //Then
        Assert.assertEquals(shapeCollector.theList.size(), 0);
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle(6,6);
        shapeCollector.addFigure(triangle);
        //When
        Shape figure = shapeCollector.getFigure(0);
        double field = shapeCollector.getFigure(0).getField();
        //Then
        Assert.assertEquals(triangle, figure);
        Assert.assertEquals(field, triangle.getField(),0);
    }


}

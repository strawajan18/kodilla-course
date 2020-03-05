package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] Array = {123, 345, 555, 456, 235, 897};
        //When
        double result = ArrayOperations.getAverage(Array);
        //Then
        Assert.assertEquals(435.17, result, 0.1);

    }
}

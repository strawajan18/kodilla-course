package com.kodilla.testing.collection;

import com.kodilla.collection.OddNumbersExterminator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {
    OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();

    @Before
     public void before() {
        System.out.println("Test Case: begin");
    }
    @After
     public void after() {
        System.out.println("Test Case: end");
    }
    @Test
     public void testOddNumbersExterminatorEmptyList() {
        ArrayList<Integer> emptyList = new ArrayList<>();
        numbersExterminator.exterminate(emptyList);
    }
    @Test
     public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> notEmptyList = new ArrayList<Integer>();
        Random random = new Random();
        for (int n = 0; n < 100; n++) {
            notEmptyList.add(random.nextInt(100));
            numbersExterminator.exterminate(notEmptyList);
        }
    }


}

package com.kodilla.testing;

import com.kodilla.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(787,543);

        if (calculator.addition() == 787 + 543) {
            System.out.println("First method works !");
        }

        if (calculator.substraction() == 787 - 543) {
            System.out.println("Second method works !");
        }
    }
}

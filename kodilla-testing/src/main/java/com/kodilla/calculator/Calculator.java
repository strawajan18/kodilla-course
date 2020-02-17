package com.kodilla.calculator;

public class Calculator {
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int addition() {
        return a + b;
    }

    public int substraction() {
        if (a>b) {
            return a - b;
        } else {
            return b - a;
        }
    }
}

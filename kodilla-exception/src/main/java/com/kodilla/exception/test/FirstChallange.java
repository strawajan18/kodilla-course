package com.kodilla.exception.test;

public class FirstChallange {

    public double divide(double a, double b) throws ArithmeticException {
        FirstChallange firstChallange = new FirstChallange();

        if(b==0) {
            throw new ArithmeticException();
        }
        return a / b;
    }



    public static void main(String[] args) {
        FirstChallange firstChallange = new FirstChallange();

        try {

            double result = firstChallange.divide(3,0);
            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("You can't divide by 0, morron!");

        } finally {

            System.out.println("I'm watching YOU :{");

        }
    }
}



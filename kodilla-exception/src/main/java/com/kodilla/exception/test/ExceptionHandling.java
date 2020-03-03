package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge challenge = new SecondChallenge();

        try {
            challenge.probablyWillThrowException(3, 1.5);
        } catch (Exception e) {
            System.out.println("Throwing an exception!");
        }

    }
}

package com.kodilla.stream;



import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Decorating poems with lambdas");
        poemBeautifier.beautify("Once upon a time", (poem) -> poem);
        poemBeautifier.beautify("Once upon a time", (poem) -> poem.toUpperCase());
        poemBeautifier.beautify("Once upon a time", (poem) -> "ABC " + poem + " ABC");
        poemBeautifier.beautify("Once upon a time", (poem) -> poem.toLowerCase());
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.NumbersGenerator.generateEven(20);
    }
}

package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;

public class ExceptionModuleRunner {
    public static void main(String arg[]) throws java.lang.Exception {

        FileReader fileReader = new FileReader();
        fileReader.readFile();
    }
}

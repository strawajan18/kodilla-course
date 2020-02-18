package com.kodilla.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public void exterminate(ArrayList<Integer> evenNumbers) {
        for (int n = 0; n < evenNumbers.size(); n++) {
            if ((evenNumbers.get(n) % 2) != 0) {
                evenNumbers.remove(n);
            }
        }
    }
}


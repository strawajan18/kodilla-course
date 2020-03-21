package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        boolean end = false;
        Scanner myscan = new Scanner(System.in);
        Random random = new Random();
        int usersChoice;
        int compChoice;
        int roundNumber = 0;
        int usersPoints = 0;
        int computersPoints = 0;
        String userName;

        System.out.println("Hello in the 'Rock paper scissors' game. Type your nickname.");
        userName = myscan.nextLine();
        System.out.println("Hello " + userName + " choose 1 for rock, 2 for paper, 3 for scissors. Let's play !");

        while (!end) {
            System.out.println("Round number : " + ++roundNumber);

            usersChoice = myscan.nextInt();
            compChoice = random.nextInt(3) + 1;


            if (usersChoice == 1 && compChoice == 2) {
                System.out.println("You picked rock, computer picked paper, computer wins !");
                computersPoints++;
                System.out.println("Computer's points : " + computersPoints);
                System.out.println("User's points : " + usersPoints);

            }

            if (usersChoice == 1 && compChoice == 3) {
                System.out.println("You picked rock, computer picked scissors, you win !");
                usersPoints++;
                System.out.println("Computer's points : " + computersPoints);
                System.out.println("User's points : " + usersPoints);

            }

            if (usersChoice == 2 && compChoice == 1) {
                System.out.println("You picked paper, computer picked rock, you win !");
                usersPoints++;
                System.out.println("Computer's points : " + computersPoints);
                System.out.println("User's points : " + usersPoints);
            }

            if (usersChoice == 2 && compChoice == 3) {
                System.out.println("You picked paper, computer picked scissors, computer wins !");
                computersPoints++;
                System.out.println("Computer's points : " + computersPoints);
                System.out.println("User's points : " + usersPoints);

            }

            if (usersChoice == 3 && compChoice == 1) {
                System.out.println("You picked scissors, computer picked rock, computer wins !");
                computersPoints++;
                System.out.println("Computer's points : " + computersPoints);
                System.out.println("User's points : " + usersPoints);

            }

            if (usersChoice == 3 && compChoice == 2) {
                System.out.println("You picked scissors, computer picked paper, you win !");
                usersPoints++;
                System.out.println("Computer's points : " + computersPoints);
                System.out.println("User's points : " + usersPoints);

            }

            if (usersChoice == compChoice) {
                System.out.println("It's a tie !");
                computersPoints++;
                usersPoints++;
                System.out.println("Computer's points : " + computersPoints);
                System.out.println("User's points : " + usersPoints);

            }

            if (usersPoints == 3 || computersPoints == 3) {
                if(usersPoints > computersPoints) {
                    System.out.println("You won congratulations !");
                    end = true;
                } else {
                    System.out.println("Computer won !");
                    end = true;
                }

            }


        }
    }
}

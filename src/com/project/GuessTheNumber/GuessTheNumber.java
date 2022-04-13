package com.project.GuessTheNumber;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        String playAgain = "";
        Scanner answer = new Scanner(System.in);

        do {
            GuessTheNumber.inputGuess();
            System.out.println("Would you like to play again? (y or n)");
            playAgain = answer.nextLine();

        }
        while (playAgain.equals("y"));
        System.out.println("Thanks for playing!");
        if (playAgain.equals("n")) {
            System.exit(0);
        }
    }

    public static void inputGuess() {

        Scanner pn = new Scanner(System.in);

        String str = "This is guess ";
        //int i;//
        int playerGuess;
        int maxAttempts = 6;

        System.out.println("Hello! What is your name?");
        String playerName = pn.nextLine();
        System.out.println("Well," + playerName + ",I am thinking of a number between 1 and 20.");
        System.out.println("Guess the number within 6 tries.");

        for (playerGuess = 1; playerGuess <= maxAttempts; playerGuess++) {
            System.out.println(str + playerGuess);

            Scanner pc = new Scanner(System.in);
            System.out.println("Take a guess.");
            int playerChoice = pc.nextInt();
            System.out.println("Your guess is " + playerChoice);

            if (playerGuess == maxAttempts) {
                System.out.println("That was your final guess. You loose! The number was: 4.");

            }


            if (playerChoice == 4 && playerGuess != maxAttempts) {
                System.out.println("Good job," + playerName + "! " + "You guessed my number in " + playerGuess + " guesses!");
                break;


            } else if (playerChoice <= 3 && playerGuess != maxAttempts) {
                System.out.println("Your guess is too low.");


            } else if (playerChoice >= 5 && playerGuess != maxAttempts) {
                System.out.println("Your guess is too high.");


            }


        }

    }
}






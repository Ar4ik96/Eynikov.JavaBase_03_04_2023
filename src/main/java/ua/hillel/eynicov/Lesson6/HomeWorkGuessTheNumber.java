package ua.hillel.eynicov.Lesson6;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkGuessTheNumber {
    public static void main(String[] args) {
        int secretNumber, guess, tries = 0;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        secretNumber = rand.nextInt(11);
        System.out.println("Guess a number from 0 to 10, you have three attempts");

        while (tries < 3) {
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                tries++;

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the secret number!");
                    return;
                } else {
                    System.out.println("Sorry, that's not the secret number.");
                }
            } else {
                System.out.println("Wrong data! Try again.");
                scanner.next();
            }
        }

        System.out.println("Sorry, you didn't guess the secret number in 3 tries. The secret number was " + secretNumber);
    }
}
import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess, attempts = 0;
        int min = 1, max = 100;
        int randomNumber = random.nextInt(max - min + 1) + min;
        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min, max);
        do {
            System.out.print("Entre a guess: ");
            guess = scanner.nextInt();
            attempts++;
            if(guess < randomNumber) {
                System.out.println("TOO LOW!");
            } else if(guess > randomNumber) {
                System.out.println("TOO HEIGHT!");
            } else {
                System.out.println("CORRECT! the number was " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }
        } while (guess != randomNumber);
        scanner.close();
    }
}
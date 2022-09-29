package Task3;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    private static int rnd_number;


    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
        System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextInt()) {

            int guess = scanner.nextInt();
            if (rnd_number == guess) {
                System.out.println("Correct!");
            } else if (rnd_number < guess) {
                System.out.println("Lower!");
                makeAGuess();
            } else if (rnd_number > guess) {
                System.out.println("Higher!");
                makeAGuess();
            }
        }
        else {
            System.out.println("Please enter a number between 1-100");
            makeAGuess();
        }
    }
}
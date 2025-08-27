package CP.day6;

// Number guessing game.

import java.util.*;
import java.util.Random;
public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;
        System.out.println("Guess a number between 1 and 100");
        while (guess != number) {
            guess = sc.nextInt();
            attempts++;
            if (guess < number) {
                System.out.println("Too low! Try again.");
            }
            else if (guess > number) {
                System.out.println("Too high! Try again.");
            }
            else {
                System.out.println("Congratulations! You've guessed the number " + number + " in " + attempts + " attempts.");
            }
        }
        sc.close();
    }
}

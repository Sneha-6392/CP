package BridgeLabz.day3.arrays;
/* Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors */
import java.util.*;
public class ques8 {
    public static void mai(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        System.out.println("Factors of " + number + ": " + factors);
        sc.close();
    }
}

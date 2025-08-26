package BridgeLabz.day3.arrays;
/* Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers */
import java.util.*;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        int count = 0;
        while (count < 10) {
            int input = sc.nextInt();
            if (input <= 0) {
                break;
            }
            numbers[count] = input;
            sum += input;
            count++;
        }
        System.out.println("You entered:");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nSum of all numbers: " + sum);
        sc.close();
    }
}

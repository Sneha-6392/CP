package BridgeLabz.day3.arrays;
/* Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result */
import java.util.*;
public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
         sc.close();
    }
}

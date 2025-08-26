package BridgeLabz.day3.arrays;
/* Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
 */
import java.util.*;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];
        for (int i = 0; i < age.length; i++) {
            age[i] = sc.nextInt();
        }
        for (int i=0; i < age.length; i++) {
            if (age[i] < 0) {
                System.out.println(age[i] + " invalid age");
            }
            else if (age[i] < 18) {
                System.out.println(age[i] + " not eligible for voting");
            } else {
                System.out.println(age[i] + " eligible for voting");
            }
        }
        sc.close();
    }
}

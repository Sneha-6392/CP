package BridgeLabz.day3.arrays;
/* Create a program to find the mean height of players present in a football team. */
import java.util.*;
public class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];     
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }
        double sum = 0;
        for (double height : heights) {
            sum += height;
        }
        double meanHeight = sum / heights.length;
        System.out.printf("Mean height of the football team: %.2f meters%n", meanHeight);
        sc.close();
    }
}

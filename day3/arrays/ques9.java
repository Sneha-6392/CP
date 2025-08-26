package BridgeLabz.day3.arrays;
/* Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 2D Array into a single dimension array */
import java.util.*;
public class ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();    
        int[][] twoDArray = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoDArray[i][j] = sc.nextInt();
            }
        }
        int[] oneDArray = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneDArray[index++] = twoDArray[i][j];
            }
        }
        for (int num : oneDArray) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}

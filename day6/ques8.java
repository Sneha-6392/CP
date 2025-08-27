package CP.day6;
 
// Fibonacci Sequence Generator:
// ○ Write a program that generates the Fibonacci sequence up to a specified number
// of terms entered by the user.
// ○ Organize the code by creating a function that calculates and prints the Fibonacci
// sequence.

import java.util.*;
public class ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n);
        sc.close();
    }
    public static void fib(int n) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c= a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

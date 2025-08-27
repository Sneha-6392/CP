package CP.day6;

// Basic Calculator

import java.util.*;
public class ques13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);
        int res = 0;
        switch (op) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                if (b != 0) {
                    res = a / b;
                } else {
                    System.out.println("Error: Division by zero");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                sc.close();
                return;
        }
        System.out.println("Result: " + res);
        sc.close();
    }
}

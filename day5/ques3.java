package CP.day5;

// Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result

import java.util.*;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = new char[str.length()];
        for (int i = 0; i < arr.length; i++) {
            char ch = str.charAt(i);
            arr[i] = ch;
        }
        boolean res = true;
        char[] arr2 = str.toCharArray();
        for (int i = 0; i < arr2.length; i++) {
            if (arr[i] != arr2[i]) {
                res = false;
            }
        }
        if (res == true) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }
        sc.close();
    }
    
}

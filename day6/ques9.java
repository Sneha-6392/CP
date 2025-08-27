package CP.day6;

// Palindrome Checker

import java.util.*;
public class ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (palindrome(str)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
        sc.close();
    }
    public static boolean palindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
        
}

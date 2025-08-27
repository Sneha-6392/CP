package CP.day5;

// Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results

import java.util.*;
public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }
        String subStr1 = sb.toString();
        String subStr2 = str.substring(start, end);
        System.out.println("Using charAt(): " + subStr1);
        System.out.println("Using substring(): " + subStr2);
        System.out.println("Are both substrings equal?: " + subStr1.equals(subStr2));
        sc.close();
    }
}

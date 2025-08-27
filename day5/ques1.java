package CP.day5;

// Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method
import java.util.*;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean ans = true;
        if (str1.length() != str2.length()) {
            ans = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    ans = false;
                    break;
                }
            }
        }
        System.out.println("Using charAt(): " + ans);
        System.out.println("Using equals(): " + str1.equals(str2));
        sc.close();
    }
}

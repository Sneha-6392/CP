package CP.day6;

// Problem 4: Date Comparison Write a program that:
// ➢ Takes two date inputs and compares them to check if the first date is before, after,
// or the same as the second date.

import java.util.*;
import java.time.*;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date1 = sc.nextLine();
        String date2 = sc.nextLine();
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        if (d1.isBefore(d2)) {
            System.out.println("date1 is before date2");
        }
        else if (d1.isAfter(d2)) {
            System.out.println("date1 is after date2");
        }
        else {
            System.out.println("Both dates are the same");
        }
        sc.close();
    }
}

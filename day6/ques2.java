package CP.day6;

// Problem 2: Date Arithmetic Create a program that:
// ➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.
// ➢ Then subtracts 3 weeks from the result.

import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date in YYYY-MM-DD format");
        String date = sc.nextLine();
        LocalDate d1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        d1 = d1.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println(d1);
        sc.close();
    }
}

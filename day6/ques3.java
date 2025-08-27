package CP.day6;

// Problem 3: Date Formatting Write a program that:
// ➢ Displays the current date in three different formats:
// ■ dd/MM/yyyy
// ■ yyyy-MM-dd
// ■ EEE, MMM dd, yyyy

import java.time.*;
import java.time.format.DateTimeFormatter;
public class ques3 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter date1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter date2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter date3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println(date.format(date1));
        System.out.println(date.format(date2));
        System.out.println(date.format(date3));
    }
    
}

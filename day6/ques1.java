package CP.day6;

// Problem 1: Time Zones and ZonedDateTime Write a program that displays the current
// time in different time zones:
// ➢ GMT (Greenwich Mean Time)
// ➢ IST (Indian Standard Time)
// ➢ PST (Pacific Standard Time)

import java.time.*;
public class ques1 {
    public static void main(String[] args) {
        ZoneId greenwich = ZoneId.of("Etc/GMT");
        ZoneId india = ZoneId.of("Asia/Kolkata");
        ZoneId pacific = ZoneId.of("America/Los_Angeles");
        ZonedDateTime greenwichTime = ZonedDateTime.now(greenwich);
        ZonedDateTime indiaTime = ZonedDateTime.now(india);
        ZonedDateTime pacificTime = ZonedDateTime.now(pacific);
        System.out.println("Greenwich time: " + greenwichTime);
        System.out.println("Indian time: " + indiaTime);
        System.out.println("Pacific time: " + pacificTime);
    }
    
}

package CP.day9;
// Create a program to find the bonuses of employees based on their years of service.
import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        double bonus = 0;
        if (years > 5) {
            bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus! Years of service less than or equal to 5.");
        }
        sc.close();
    }
}

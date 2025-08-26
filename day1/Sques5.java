// Convert Kilometers to Miles
package BridgeLabz.day1;
import java.util.*;
public class Sques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
        sc.close();
    }
}

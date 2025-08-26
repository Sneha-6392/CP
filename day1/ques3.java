// Celsius to Fahrenheit Conversion
package BridgeLabz.day1;
import java.util.*;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cTemp = sc.nextInt();
        int fTemp = (cTemp * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fTemp);
        sc.close();
    }
}

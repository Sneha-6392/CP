// Power Calculation
package BridgeLabz.day1;
import java.util.*;
public class Sques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int result = (int) Math.pow(base, exponent);
        System.out.println("The result of " + base + " raised to the power of " + exponent + " is: " + result);
        sc.close();
    }
}

// Calculate Simple Interest
package BridgeLabz.day1;
import java.util.*;
public class Sques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        int simpleInterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is: " + simpleInterest);
        sc.close();
    }
}

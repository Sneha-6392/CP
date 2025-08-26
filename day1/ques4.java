// Area of a Circle
package BridgeLabz.day1;
import java.util.*;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int area = (int)(Math.PI * radius * radius);
        System.out.println("Area of the circle is: " + area);
        sc.close();
    }
}

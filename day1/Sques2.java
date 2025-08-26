// Perimeter of a Rectangle
package BridgeLabz.day1;
import java.util.*;
public class Sques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int perimeter = 2 * (length + width);
        System.out.println("The Perimeter of the Rectangle is: " + perimeter);
        sc.close();
    }
}

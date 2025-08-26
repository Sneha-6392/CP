// Volume of a Cylinder
package BridgeLabz.day1;
import java.util.*;
public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int height = sc.nextInt();
        int volume = (int)(Math.PI * (radius * radius) * height);
        System.out.println("Volume of Cyclinder is: " + volume);
        sc.close(); 
    }
}
